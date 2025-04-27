package com.smartorg.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
	private static final String LOG_DIRECTORY = "logs";
	private static final String LOG_FILE = "logs/task_log.txt";

	public static void log(String message) {
		try {
			//Create 'logs' directory if it doesn't exist
			File directory = new File(LOG_DIRECTORY);
			if (!directory.exists()) {
				directory.mkdirs();
			}

			//Now write to the file
			try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
				String timestamp = LocalDateTime.now()
						.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				fw.write("[" + timestamp + "] " + message + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
