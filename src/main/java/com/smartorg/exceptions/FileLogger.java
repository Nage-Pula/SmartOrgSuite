package com.smartorg.exceptions;
import java.io.FileWriter;
import java.io.IOException;
/**
 * FileLogger class to log messages to a file.
 * This class implements a simple file logging mechanism.
 * It can be used to log messages for debugging or tracking purposes.
 */
public class FileLogger {
	public void log(String message) {
		// Log the message to a file
		try (FileWriter fw = new FileWriter("log.txt", true)) {
			fw.write(message + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
