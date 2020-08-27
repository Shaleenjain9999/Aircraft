package com.aircraft.demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class FileManagerImpl implements FileManager {

	@Override
	public void processFile(Request request, boolean isPaused, boolean isResume) throws Exception {
		String to = request.getAirport();
		String from = request.getAircraft();
		String file =request.getFile();
		long  layover = request.getLayoverTime();
		AircraftFactory aircraft = new AircraftFactory();
		AirportFactory airport = new AirportFactory();
		Airport toAirport = airport.getAirport(to);
		Aircraft fromAircraft = aircraft.getAircraft(from);
		fromAircraft.sendFile(file,isPaused,isResume, toAirport,layover);

	}

}
