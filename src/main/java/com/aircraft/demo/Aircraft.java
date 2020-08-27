package com.aircraft.demo;

import java.time.LocalDateTime;

public interface Aircraft {

	 void sendFile(String file, boolean isPaused, boolean isResume,Airport airport,long  layover) throws Exception;
}
