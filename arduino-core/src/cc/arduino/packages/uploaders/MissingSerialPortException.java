package cc.arduino.packages.uploaders;

import java.io.IOException;
import processing.app.helpers.PreferencesMapException;

@SuppressWarnings("serial")
public class MissingSerialPortException extends PreferencesMapException {

	public MissingSerialPortException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
