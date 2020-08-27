package com.aircraft.demo;

import java.io.FileNotFoundException;

public interface FileManager {

	void processFile(Request request,boolean isPaused,boolean isResume) throws Exception;
}
