package cc.arduino.core.rpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The main Arduino Platform Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: commands.proto")
public class ArduinoCoreGrpc {

  private ArduinoCoreGrpc() {}

  public static final String SERVICE_NAME = "cc.arduino.core.rpc.ArduinoCore";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.InitReq,
      cc.arduino.core.rpc.Commands.InitResp> METHOD_INIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "Init"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.InitReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.InitResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.DestroyReq,
      cc.arduino.core.rpc.Commands.DestroyResp> METHOD_DESTROY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "Destroy"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.DestroyReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.DestroyResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.RescanReq,
      cc.arduino.core.rpc.Commands.RescanResp> METHOD_RESCAN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "Rescan"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.RescanReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.RescanResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.UpdateIndexReq,
      cc.arduino.core.rpc.Commands.UpdateIndexResp> METHOD_UPDATE_INDEX =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "UpdateIndex"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.UpdateIndexReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.UpdateIndexResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq,
      cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp> METHOD_UPDATE_LIBRARIES_INDEX =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "UpdateLibrariesIndex"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Board.BoardDetailsReq,
      cc.arduino.core.rpc.Board.BoardDetailsResp> METHOD_BOARD_DETAILS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "BoardDetails"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Board.BoardDetailsReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Board.BoardDetailsResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Board.BoardAttachReq,
      cc.arduino.core.rpc.Board.BoardAttachResp> METHOD_BOARD_ATTACH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "BoardAttach"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Board.BoardAttachReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Board.BoardAttachResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Compile.CompileReq,
      cc.arduino.core.rpc.Compile.CompileResp> METHOD_COMPILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "Compile"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Compile.CompileReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Compile.CompileResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformInstallReq,
      cc.arduino.core.rpc.Core.PlatformInstallResp> METHOD_PLATFORM_INSTALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "PlatformInstall"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformInstallReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformInstallResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformDownloadReq,
      cc.arduino.core.rpc.Core.PlatformDownloadResp> METHOD_PLATFORM_DOWNLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "PlatformDownload"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformDownloadReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformDownloadResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUninstallReq,
      cc.arduino.core.rpc.Core.PlatformUninstallResp> METHOD_PLATFORM_UNINSTALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "PlatformUninstall"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformUninstallReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformUninstallResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUpgradeReq,
      cc.arduino.core.rpc.Core.PlatformUpgradeResp> METHOD_PLATFORM_UPGRADE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "PlatformUpgrade"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformUpgradeReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformUpgradeResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Upload.UploadReq,
      cc.arduino.core.rpc.Upload.UploadResp> METHOD_UPLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "Upload"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Upload.UploadReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Upload.UploadResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformSearchReq,
      cc.arduino.core.rpc.Core.PlatformSearchResp> METHOD_PLATFORM_SEARCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "PlatformSearch"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformSearchReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformSearchResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformListReq,
      cc.arduino.core.rpc.Core.PlatformListResp> METHOD_PLATFORM_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "PlatformList"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformListReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Core.PlatformListResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryDownloadReq,
      cc.arduino.core.rpc.Lib.LibraryDownloadResp> METHOD_LIBRARY_DOWNLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "LibraryDownload"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryDownloadReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryDownloadResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryInstallReq,
      cc.arduino.core.rpc.Lib.LibraryInstallResp> METHOD_LIBRARY_INSTALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "LibraryInstall"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryInstallReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryInstallResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUninstallReq,
      cc.arduino.core.rpc.Lib.LibraryUninstallResp> METHOD_LIBRARY_UNINSTALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "LibraryUninstall"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryUninstallReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryUninstallResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq,
      cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> METHOD_LIBRARY_UPGRADE_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "LibraryUpgradeAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibrarySearchReq,
      cc.arduino.core.rpc.Lib.LibrarySearchResp> METHOD_LIBRARY_SEARCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "LibrarySearch"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibrarySearchReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibrarySearchResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryListReq,
      cc.arduino.core.rpc.Lib.LibraryListResp> METHOD_LIBRARY_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cc.arduino.core.rpc.ArduinoCore", "LibraryList"),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryListReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cc.arduino.core.rpc.Lib.LibraryListResp.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArduinoCoreStub newStub(io.grpc.Channel channel) {
    return new ArduinoCoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArduinoCoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArduinoCoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ArduinoCoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArduinoCoreFutureStub(channel);
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  @java.lang.Deprecated public static interface ArduinoCore {

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public void init(cc.arduino.core.rpc.Commands.InitReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp> responseObserver);

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public void destroy(cc.arduino.core.rpc.Commands.DestroyReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp> responseObserver);

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public void rescan(cc.arduino.core.rpc.Commands.RescanReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp> responseObserver);

    /**
     * <pre>
     * Update package index of the Arduino Core Service
     * </pre>
     */
    public void updateIndex(cc.arduino.core.rpc.Commands.UpdateIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp> responseObserver);

    /**
     * <pre>
     * Update libraries index
     * </pre>
     */
    public void updateLibrariesIndex(cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp> responseObserver);

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public void boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp> responseObserver);

    /**
     */
    public void boardAttach(cc.arduino.core.rpc.Board.BoardAttachReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardAttachResp> responseObserver);

    /**
     */
    public void compile(cc.arduino.core.rpc.Compile.CompileReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp> responseObserver);

    /**
     */
    public void platformInstall(cc.arduino.core.rpc.Core.PlatformInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp> responseObserver);

    /**
     */
    public void platformDownload(cc.arduino.core.rpc.Core.PlatformDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp> responseObserver);

    /**
     */
    public void platformUninstall(cc.arduino.core.rpc.Core.PlatformUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp> responseObserver);

    /**
     */
    public void platformUpgrade(cc.arduino.core.rpc.Core.PlatformUpgradeReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp> responseObserver);

    /**
     */
    public void upload(cc.arduino.core.rpc.Upload.UploadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp> responseObserver);

    /**
     */
    public void platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp> responseObserver);

    /**
     */
    public void platformList(cc.arduino.core.rpc.Core.PlatformListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp> responseObserver);

    /**
     */
    public void libraryDownload(cc.arduino.core.rpc.Lib.LibraryDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp> responseObserver);

    /**
     */
    public void libraryInstall(cc.arduino.core.rpc.Lib.LibraryInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp> responseObserver);

    /**
     */
    public void libraryUninstall(cc.arduino.core.rpc.Lib.LibraryUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp> responseObserver);

    /**
     */
    public void libraryUpgradeAll(cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> responseObserver);

    /**
     */
    public void librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp> responseObserver);

    /**
     */
    public void libraryList(cc.arduino.core.rpc.Lib.LibraryListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryListResp> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ArduinoCoreImplBase implements ArduinoCore, io.grpc.BindableService {

    @java.lang.Override
    public void init(cc.arduino.core.rpc.Commands.InitReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INIT, responseObserver);
    }

    @java.lang.Override
    public void destroy(cc.arduino.core.rpc.Commands.DestroyReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESTROY, responseObserver);
    }

    @java.lang.Override
    public void rescan(cc.arduino.core.rpc.Commands.RescanReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESCAN, responseObserver);
    }

    @java.lang.Override
    public void updateIndex(cc.arduino.core.rpc.Commands.UpdateIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_INDEX, responseObserver);
    }

    @java.lang.Override
    public void updateLibrariesIndex(cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_LIBRARIES_INDEX, responseObserver);
    }

    @java.lang.Override
    public void boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BOARD_DETAILS, responseObserver);
    }

    @java.lang.Override
    public void boardAttach(cc.arduino.core.rpc.Board.BoardAttachReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardAttachResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BOARD_ATTACH, responseObserver);
    }

    @java.lang.Override
    public void compile(cc.arduino.core.rpc.Compile.CompileReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMPILE, responseObserver);
    }

    @java.lang.Override
    public void platformInstall(cc.arduino.core.rpc.Core.PlatformInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLATFORM_INSTALL, responseObserver);
    }

    @java.lang.Override
    public void platformDownload(cc.arduino.core.rpc.Core.PlatformDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLATFORM_DOWNLOAD, responseObserver);
    }

    @java.lang.Override
    public void platformUninstall(cc.arduino.core.rpc.Core.PlatformUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLATFORM_UNINSTALL, responseObserver);
    }

    @java.lang.Override
    public void platformUpgrade(cc.arduino.core.rpc.Core.PlatformUpgradeReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLATFORM_UPGRADE, responseObserver);
    }

    @java.lang.Override
    public void upload(cc.arduino.core.rpc.Upload.UploadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLOAD, responseObserver);
    }

    @java.lang.Override
    public void platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLATFORM_SEARCH, responseObserver);
    }

    @java.lang.Override
    public void platformList(cc.arduino.core.rpc.Core.PlatformListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLATFORM_LIST, responseObserver);
    }

    @java.lang.Override
    public void libraryDownload(cc.arduino.core.rpc.Lib.LibraryDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIBRARY_DOWNLOAD, responseObserver);
    }

    @java.lang.Override
    public void libraryInstall(cc.arduino.core.rpc.Lib.LibraryInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIBRARY_INSTALL, responseObserver);
    }

    @java.lang.Override
    public void libraryUninstall(cc.arduino.core.rpc.Lib.LibraryUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIBRARY_UNINSTALL, responseObserver);
    }

    @java.lang.Override
    public void libraryUpgradeAll(cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIBRARY_UPGRADE_ALL, responseObserver);
    }

    @java.lang.Override
    public void librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIBRARY_SEARCH, responseObserver);
    }

    @java.lang.Override
    public void libraryList(cc.arduino.core.rpc.Lib.LibraryListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryListResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIBRARY_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ArduinoCoreGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  @java.lang.Deprecated public static interface ArduinoCoreBlockingClient {

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public cc.arduino.core.rpc.Commands.InitResp init(cc.arduino.core.rpc.Commands.InitReq request);

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public cc.arduino.core.rpc.Commands.DestroyResp destroy(cc.arduino.core.rpc.Commands.DestroyReq request);

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public cc.arduino.core.rpc.Commands.RescanResp rescan(cc.arduino.core.rpc.Commands.RescanReq request);

    /**
     * <pre>
     * Update package index of the Arduino Core Service
     * </pre>
     */
    public java.util.Iterator<cc.arduino.core.rpc.Commands.UpdateIndexResp> updateIndex(
        cc.arduino.core.rpc.Commands.UpdateIndexReq request);

    /**
     * <pre>
     * Update libraries index
     * </pre>
     */
    public java.util.Iterator<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp> updateLibrariesIndex(
        cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq request);

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public cc.arduino.core.rpc.Board.BoardDetailsResp boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Board.BoardAttachResp> boardAttach(
        cc.arduino.core.rpc.Board.BoardAttachReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Compile.CompileResp> compile(
        cc.arduino.core.rpc.Compile.CompileReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformInstallResp> platformInstall(
        cc.arduino.core.rpc.Core.PlatformInstallReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformDownloadResp> platformDownload(
        cc.arduino.core.rpc.Core.PlatformDownloadReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformUninstallResp> platformUninstall(
        cc.arduino.core.rpc.Core.PlatformUninstallReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformUpgradeResp> platformUpgrade(
        cc.arduino.core.rpc.Core.PlatformUpgradeReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Upload.UploadResp> upload(
        cc.arduino.core.rpc.Upload.UploadReq request);

    /**
     */
    public cc.arduino.core.rpc.Core.PlatformSearchResp platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request);

    /**
     */
    public cc.arduino.core.rpc.Core.PlatformListResp platformList(cc.arduino.core.rpc.Core.PlatformListReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryDownloadResp> libraryDownload(
        cc.arduino.core.rpc.Lib.LibraryDownloadReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryInstallResp> libraryInstall(
        cc.arduino.core.rpc.Lib.LibraryInstallReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryUninstallResp> libraryUninstall(
        cc.arduino.core.rpc.Lib.LibraryUninstallReq request);

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> libraryUpgradeAll(
        cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request);

    /**
     */
    public cc.arduino.core.rpc.Lib.LibrarySearchResp librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request);

    /**
     */
    public cc.arduino.core.rpc.Lib.LibraryListResp libraryList(cc.arduino.core.rpc.Lib.LibraryListReq request);
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  @java.lang.Deprecated public static interface ArduinoCoreFutureClient {

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.InitResp> init(
        cc.arduino.core.rpc.Commands.InitReq request);

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.DestroyResp> destroy(
        cc.arduino.core.rpc.Commands.DestroyReq request);

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.RescanResp> rescan(
        cc.arduino.core.rpc.Commands.RescanReq request);

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Board.BoardDetailsResp> boardDetails(
        cc.arduino.core.rpc.Board.BoardDetailsReq request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Core.PlatformSearchResp> platformSearch(
        cc.arduino.core.rpc.Core.PlatformSearchReq request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Core.PlatformListResp> platformList(
        cc.arduino.core.rpc.Core.PlatformListReq request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Lib.LibrarySearchResp> librarySearch(
        cc.arduino.core.rpc.Lib.LibrarySearchReq request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Lib.LibraryListResp> libraryList(
        cc.arduino.core.rpc.Lib.LibraryListReq request);
  }

  public static class ArduinoCoreStub extends io.grpc.stub.AbstractStub<ArduinoCoreStub>
      implements ArduinoCore {
    private ArduinoCoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArduinoCoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArduinoCoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArduinoCoreStub(channel, callOptions);
    }

    @java.lang.Override
    public void init(cc.arduino.core.rpc.Commands.InitReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INIT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void destroy(cc.arduino.core.rpc.Commands.DestroyReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESTROY, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void rescan(cc.arduino.core.rpc.Commands.RescanReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESCAN, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void updateIndex(cc.arduino.core.rpc.Commands.UpdateIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_UPDATE_INDEX, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void updateLibrariesIndex(cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_UPDATE_LIBRARIES_INDEX, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BOARD_DETAILS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void boardAttach(cc.arduino.core.rpc.Board.BoardAttachReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardAttachResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_BOARD_ATTACH, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void compile(cc.arduino.core.rpc.Compile.CompileReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_COMPILE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void platformInstall(cc.arduino.core.rpc.Core.PlatformInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_PLATFORM_INSTALL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void platformDownload(cc.arduino.core.rpc.Core.PlatformDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_PLATFORM_DOWNLOAD, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void platformUninstall(cc.arduino.core.rpc.Core.PlatformUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_PLATFORM_UNINSTALL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void platformUpgrade(cc.arduino.core.rpc.Core.PlatformUpgradeReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_PLATFORM_UPGRADE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void upload(cc.arduino.core.rpc.Upload.UploadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_UPLOAD, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PLATFORM_SEARCH, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void platformList(cc.arduino.core.rpc.Core.PlatformListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PLATFORM_LIST, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void libraryDownload(cc.arduino.core.rpc.Lib.LibraryDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIBRARY_DOWNLOAD, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void libraryInstall(cc.arduino.core.rpc.Lib.LibraryInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIBRARY_INSTALL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void libraryUninstall(cc.arduino.core.rpc.Lib.LibraryUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIBRARY_UNINSTALL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void libraryUpgradeAll(cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIBRARY_UPGRADE_ALL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIBRARY_SEARCH, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void libraryList(cc.arduino.core.rpc.Lib.LibraryListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIBRARY_LIST, getCallOptions()), request, responseObserver);
    }
  }

  public static class ArduinoCoreBlockingStub extends io.grpc.stub.AbstractStub<ArduinoCoreBlockingStub>
      implements ArduinoCoreBlockingClient {
    private ArduinoCoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArduinoCoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArduinoCoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArduinoCoreBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Commands.InitResp init(cc.arduino.core.rpc.Commands.InitReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INIT, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Commands.DestroyResp destroy(cc.arduino.core.rpc.Commands.DestroyReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESTROY, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Commands.RescanResp rescan(cc.arduino.core.rpc.Commands.RescanReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESCAN, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Commands.UpdateIndexResp> updateIndex(
        cc.arduino.core.rpc.Commands.UpdateIndexReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_UPDATE_INDEX, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp> updateLibrariesIndex(
        cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_UPDATE_LIBRARIES_INDEX, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Board.BoardDetailsResp boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BOARD_DETAILS, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Board.BoardAttachResp> boardAttach(
        cc.arduino.core.rpc.Board.BoardAttachReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_BOARD_ATTACH, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Compile.CompileResp> compile(
        cc.arduino.core.rpc.Compile.CompileReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_COMPILE, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformInstallResp> platformInstall(
        cc.arduino.core.rpc.Core.PlatformInstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_PLATFORM_INSTALL, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformDownloadResp> platformDownload(
        cc.arduino.core.rpc.Core.PlatformDownloadReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_PLATFORM_DOWNLOAD, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformUninstallResp> platformUninstall(
        cc.arduino.core.rpc.Core.PlatformUninstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_PLATFORM_UNINSTALL, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformUpgradeResp> platformUpgrade(
        cc.arduino.core.rpc.Core.PlatformUpgradeReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_PLATFORM_UPGRADE, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Upload.UploadResp> upload(
        cc.arduino.core.rpc.Upload.UploadReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_UPLOAD, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Core.PlatformSearchResp platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PLATFORM_SEARCH, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Core.PlatformListResp platformList(cc.arduino.core.rpc.Core.PlatformListReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PLATFORM_LIST, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryDownloadResp> libraryDownload(
        cc.arduino.core.rpc.Lib.LibraryDownloadReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIBRARY_DOWNLOAD, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryInstallResp> libraryInstall(
        cc.arduino.core.rpc.Lib.LibraryInstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIBRARY_INSTALL, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryUninstallResp> libraryUninstall(
        cc.arduino.core.rpc.Lib.LibraryUninstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIBRARY_UNINSTALL, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> libraryUpgradeAll(
        cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIBRARY_UPGRADE_ALL, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Lib.LibrarySearchResp librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIBRARY_SEARCH, getCallOptions(), request);
    }

    @java.lang.Override
    public cc.arduino.core.rpc.Lib.LibraryListResp libraryList(cc.arduino.core.rpc.Lib.LibraryListReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIBRARY_LIST, getCallOptions(), request);
    }
  }

  public static class ArduinoCoreFutureStub extends io.grpc.stub.AbstractStub<ArduinoCoreFutureStub>
      implements ArduinoCoreFutureClient {
    private ArduinoCoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArduinoCoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArduinoCoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArduinoCoreFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.InitResp> init(
        cc.arduino.core.rpc.Commands.InitReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INIT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.DestroyResp> destroy(
        cc.arduino.core.rpc.Commands.DestroyReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESTROY, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.RescanResp> rescan(
        cc.arduino.core.rpc.Commands.RescanReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESCAN, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Board.BoardDetailsResp> boardDetails(
        cc.arduino.core.rpc.Board.BoardDetailsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BOARD_DETAILS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Core.PlatformSearchResp> platformSearch(
        cc.arduino.core.rpc.Core.PlatformSearchReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PLATFORM_SEARCH, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Core.PlatformListResp> platformList(
        cc.arduino.core.rpc.Core.PlatformListReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PLATFORM_LIST, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Lib.LibrarySearchResp> librarySearch(
        cc.arduino.core.rpc.Lib.LibrarySearchReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIBRARY_SEARCH, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Lib.LibraryListResp> libraryList(
        cc.arduino.core.rpc.Lib.LibraryListReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIBRARY_LIST, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractArduinoCore extends ArduinoCoreImplBase {}

  private static final int METHODID_INIT = 0;
  private static final int METHODID_DESTROY = 1;
  private static final int METHODID_RESCAN = 2;
  private static final int METHODID_UPDATE_INDEX = 3;
  private static final int METHODID_UPDATE_LIBRARIES_INDEX = 4;
  private static final int METHODID_BOARD_DETAILS = 5;
  private static final int METHODID_BOARD_ATTACH = 6;
  private static final int METHODID_COMPILE = 7;
  private static final int METHODID_PLATFORM_INSTALL = 8;
  private static final int METHODID_PLATFORM_DOWNLOAD = 9;
  private static final int METHODID_PLATFORM_UNINSTALL = 10;
  private static final int METHODID_PLATFORM_UPGRADE = 11;
  private static final int METHODID_UPLOAD = 12;
  private static final int METHODID_PLATFORM_SEARCH = 13;
  private static final int METHODID_PLATFORM_LIST = 14;
  private static final int METHODID_LIBRARY_DOWNLOAD = 15;
  private static final int METHODID_LIBRARY_INSTALL = 16;
  private static final int METHODID_LIBRARY_UNINSTALL = 17;
  private static final int METHODID_LIBRARY_UPGRADE_ALL = 18;
  private static final int METHODID_LIBRARY_SEARCH = 19;
  private static final int METHODID_LIBRARY_LIST = 20;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArduinoCore serviceImpl;
    private final int methodId;

    public MethodHandlers(ArduinoCore serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT:
          serviceImpl.init((cc.arduino.core.rpc.Commands.InitReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp>) responseObserver);
          break;
        case METHODID_DESTROY:
          serviceImpl.destroy((cc.arduino.core.rpc.Commands.DestroyReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp>) responseObserver);
          break;
        case METHODID_RESCAN:
          serviceImpl.rescan((cc.arduino.core.rpc.Commands.RescanReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp>) responseObserver);
          break;
        case METHODID_UPDATE_INDEX:
          serviceImpl.updateIndex((cc.arduino.core.rpc.Commands.UpdateIndexReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp>) responseObserver);
          break;
        case METHODID_UPDATE_LIBRARIES_INDEX:
          serviceImpl.updateLibrariesIndex((cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp>) responseObserver);
          break;
        case METHODID_BOARD_DETAILS:
          serviceImpl.boardDetails((cc.arduino.core.rpc.Board.BoardDetailsReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp>) responseObserver);
          break;
        case METHODID_BOARD_ATTACH:
          serviceImpl.boardAttach((cc.arduino.core.rpc.Board.BoardAttachReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardAttachResp>) responseObserver);
          break;
        case METHODID_COMPILE:
          serviceImpl.compile((cc.arduino.core.rpc.Compile.CompileReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp>) responseObserver);
          break;
        case METHODID_PLATFORM_INSTALL:
          serviceImpl.platformInstall((cc.arduino.core.rpc.Core.PlatformInstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp>) responseObserver);
          break;
        case METHODID_PLATFORM_DOWNLOAD:
          serviceImpl.platformDownload((cc.arduino.core.rpc.Core.PlatformDownloadReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp>) responseObserver);
          break;
        case METHODID_PLATFORM_UNINSTALL:
          serviceImpl.platformUninstall((cc.arduino.core.rpc.Core.PlatformUninstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp>) responseObserver);
          break;
        case METHODID_PLATFORM_UPGRADE:
          serviceImpl.platformUpgrade((cc.arduino.core.rpc.Core.PlatformUpgradeReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp>) responseObserver);
          break;
        case METHODID_UPLOAD:
          serviceImpl.upload((cc.arduino.core.rpc.Upload.UploadReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp>) responseObserver);
          break;
        case METHODID_PLATFORM_SEARCH:
          serviceImpl.platformSearch((cc.arduino.core.rpc.Core.PlatformSearchReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp>) responseObserver);
          break;
        case METHODID_PLATFORM_LIST:
          serviceImpl.platformList((cc.arduino.core.rpc.Core.PlatformListReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp>) responseObserver);
          break;
        case METHODID_LIBRARY_DOWNLOAD:
          serviceImpl.libraryDownload((cc.arduino.core.rpc.Lib.LibraryDownloadReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp>) responseObserver);
          break;
        case METHODID_LIBRARY_INSTALL:
          serviceImpl.libraryInstall((cc.arduino.core.rpc.Lib.LibraryInstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp>) responseObserver);
          break;
        case METHODID_LIBRARY_UNINSTALL:
          serviceImpl.libraryUninstall((cc.arduino.core.rpc.Lib.LibraryUninstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp>) responseObserver);
          break;
        case METHODID_LIBRARY_UPGRADE_ALL:
          serviceImpl.libraryUpgradeAll((cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp>) responseObserver);
          break;
        case METHODID_LIBRARY_SEARCH:
          serviceImpl.librarySearch((cc.arduino.core.rpc.Lib.LibrarySearchReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp>) responseObserver);
          break;
        case METHODID_LIBRARY_LIST:
          serviceImpl.libraryList((cc.arduino.core.rpc.Lib.LibraryListReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryListResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_INIT,
        METHOD_DESTROY,
        METHOD_RESCAN,
        METHOD_UPDATE_INDEX,
        METHOD_UPDATE_LIBRARIES_INDEX,
        METHOD_BOARD_DETAILS,
        METHOD_BOARD_ATTACH,
        METHOD_COMPILE,
        METHOD_PLATFORM_INSTALL,
        METHOD_PLATFORM_DOWNLOAD,
        METHOD_PLATFORM_UNINSTALL,
        METHOD_PLATFORM_UPGRADE,
        METHOD_UPLOAD,
        METHOD_PLATFORM_SEARCH,
        METHOD_PLATFORM_LIST,
        METHOD_LIBRARY_DOWNLOAD,
        METHOD_LIBRARY_INSTALL,
        METHOD_LIBRARY_UNINSTALL,
        METHOD_LIBRARY_UPGRADE_ALL,
        METHOD_LIBRARY_SEARCH,
        METHOD_LIBRARY_LIST);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ArduinoCore serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_INIT,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Commands.InitReq,
              cc.arduino.core.rpc.Commands.InitResp>(
                serviceImpl, METHODID_INIT)))
        .addMethod(
          METHOD_DESTROY,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Commands.DestroyReq,
              cc.arduino.core.rpc.Commands.DestroyResp>(
                serviceImpl, METHODID_DESTROY)))
        .addMethod(
          METHOD_RESCAN,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Commands.RescanReq,
              cc.arduino.core.rpc.Commands.RescanResp>(
                serviceImpl, METHODID_RESCAN)))
        .addMethod(
          METHOD_UPDATE_INDEX,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Commands.UpdateIndexReq,
              cc.arduino.core.rpc.Commands.UpdateIndexResp>(
                serviceImpl, METHODID_UPDATE_INDEX)))
        .addMethod(
          METHOD_UPDATE_LIBRARIES_INDEX,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Commands.UpdateLibrariesIndexReq,
              cc.arduino.core.rpc.Commands.UpdateLibrariesIndexResp>(
                serviceImpl, METHODID_UPDATE_LIBRARIES_INDEX)))
        .addMethod(
          METHOD_BOARD_DETAILS,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Board.BoardDetailsReq,
              cc.arduino.core.rpc.Board.BoardDetailsResp>(
                serviceImpl, METHODID_BOARD_DETAILS)))
        .addMethod(
          METHOD_BOARD_ATTACH,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Board.BoardAttachReq,
              cc.arduino.core.rpc.Board.BoardAttachResp>(
                serviceImpl, METHODID_BOARD_ATTACH)))
        .addMethod(
          METHOD_COMPILE,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Compile.CompileReq,
              cc.arduino.core.rpc.Compile.CompileResp>(
                serviceImpl, METHODID_COMPILE)))
        .addMethod(
          METHOD_PLATFORM_INSTALL,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Core.PlatformInstallReq,
              cc.arduino.core.rpc.Core.PlatformInstallResp>(
                serviceImpl, METHODID_PLATFORM_INSTALL)))
        .addMethod(
          METHOD_PLATFORM_DOWNLOAD,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Core.PlatformDownloadReq,
              cc.arduino.core.rpc.Core.PlatformDownloadResp>(
                serviceImpl, METHODID_PLATFORM_DOWNLOAD)))
        .addMethod(
          METHOD_PLATFORM_UNINSTALL,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Core.PlatformUninstallReq,
              cc.arduino.core.rpc.Core.PlatformUninstallResp>(
                serviceImpl, METHODID_PLATFORM_UNINSTALL)))
        .addMethod(
          METHOD_PLATFORM_UPGRADE,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Core.PlatformUpgradeReq,
              cc.arduino.core.rpc.Core.PlatformUpgradeResp>(
                serviceImpl, METHODID_PLATFORM_UPGRADE)))
        .addMethod(
          METHOD_UPLOAD,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Upload.UploadReq,
              cc.arduino.core.rpc.Upload.UploadResp>(
                serviceImpl, METHODID_UPLOAD)))
        .addMethod(
          METHOD_PLATFORM_SEARCH,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Core.PlatformSearchReq,
              cc.arduino.core.rpc.Core.PlatformSearchResp>(
                serviceImpl, METHODID_PLATFORM_SEARCH)))
        .addMethod(
          METHOD_PLATFORM_LIST,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Core.PlatformListReq,
              cc.arduino.core.rpc.Core.PlatformListResp>(
                serviceImpl, METHODID_PLATFORM_LIST)))
        .addMethod(
          METHOD_LIBRARY_DOWNLOAD,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Lib.LibraryDownloadReq,
              cc.arduino.core.rpc.Lib.LibraryDownloadResp>(
                serviceImpl, METHODID_LIBRARY_DOWNLOAD)))
        .addMethod(
          METHOD_LIBRARY_INSTALL,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Lib.LibraryInstallReq,
              cc.arduino.core.rpc.Lib.LibraryInstallResp>(
                serviceImpl, METHODID_LIBRARY_INSTALL)))
        .addMethod(
          METHOD_LIBRARY_UNINSTALL,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Lib.LibraryUninstallReq,
              cc.arduino.core.rpc.Lib.LibraryUninstallResp>(
                serviceImpl, METHODID_LIBRARY_UNINSTALL)))
        .addMethod(
          METHOD_LIBRARY_UPGRADE_ALL,
          asyncServerStreamingCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq,
              cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp>(
                serviceImpl, METHODID_LIBRARY_UPGRADE_ALL)))
        .addMethod(
          METHOD_LIBRARY_SEARCH,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Lib.LibrarySearchReq,
              cc.arduino.core.rpc.Lib.LibrarySearchResp>(
                serviceImpl, METHODID_LIBRARY_SEARCH)))
        .addMethod(
          METHOD_LIBRARY_LIST,
          asyncUnaryCall(
            new MethodHandlers<
              cc.arduino.core.rpc.Lib.LibraryListReq,
              cc.arduino.core.rpc.Lib.LibraryListResp>(
                serviceImpl, METHODID_LIBRARY_LIST)))
        .build();
  }
}
