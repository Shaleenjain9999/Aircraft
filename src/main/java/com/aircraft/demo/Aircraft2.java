package com.aircraft.demo;

import java.time.LocalDateTime;

public class Aircraft2 implements Aircraft{

	@Override
	public void sendFile(String file, boolean isPaused, boolean isResume, Airport airport,long  layover) {
		System.out.println("Aircraft 2 sending "+file);
		airport.recieveFile(file);
		
	}

	
	

}
