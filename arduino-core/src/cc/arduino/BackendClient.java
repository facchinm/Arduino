package cc.arduino;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.protobuf.ByteString;

import cc.arduino.core.rpc.ArduinoCoreGrpc;
import cc.arduino.core.rpc.ArduinoCoreGrpc.ArduinoCoreBlockingStub;
import cc.arduino.core.rpc.ArduinoCoreGrpc.ArduinoCoreStub;
import cc.arduino.core.rpc.Board.BoardDetailsReq;
import cc.arduino.core.rpc.Board.BoardDetailsResp;
import cc.arduino.core.rpc.Commands;
import cc.arduino.core.rpc.Commands.Configuration;
import cc.arduino.core.rpc.Commands.ConfigurationOrBuilder;
import cc.arduino.core.rpc.Commands.InitReq;
import cc.arduino.core.rpc.Commands.InitResp;
import cc.arduino.core.rpc.Common.Instance;
import cc.arduino.core.rpc.Compile;
import cc.arduino.core.rpc.Compile.CompileReq;
import cc.arduino.core.rpc.Compile.CompileReqOrBuilder;
import cc.arduino.core.rpc.Compile.CompileResp;
import cc.arduino.core.rpc.Core;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import processing.app.BaseNoGui;
import processing.app.helpers.ProcessUtils;

public class BackendClient {

	private ManagedChannel channel;
	private ArduinoCoreBlockingStub blockingStub;
	private ArduinoCoreStub asyncStub;

	private Process cli;
	private Instance instance;

	public BackendClient() throws IOException {
		this(ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext(true));
	}

	/** Construct client for accessing RouteGuide server using the existing channel. 
	 * @throws IOException */
	public BackendClient(ManagedChannelBuilder<?> channelBuilder) throws IOException {
		channel = channelBuilder.build();
		blockingStub = ArduinoCoreGrpc.newBlockingStub(channel);
		asyncStub = ArduinoCoreGrpc.newStub(channel);

		List<String> cmd = new ArrayList<>();
		cmd.add(BaseNoGui.getContentFile("arduino-cli").getAbsolutePath());
		cmd.add("daemon");
		cli = ProcessUtils.exec(cmd.toArray(new String[0]));
		
		Configuration.Builder conf = Configuration.newBuilder();
		conf.setDataDir(BaseNoGui.getSettingsFolder().getAbsolutePath());

		InitReq.Builder initreq = InitReq.newBuilder();
		initreq.setConfiguration(conf.build());
		InitResp init = blockingStub.init(initreq.build());
		instance = init.getInstance();
	}
	
	public Iterator<CompileResp> compile(CompileReq.Builder req) {
		req.setInstance(instance);
		return blockingStub.compile(req.build());
	}
}
