package com.aircraft.demo;

public class AircraftFactory {

	public Aircraft getAircraft(String aircraft) {
		if (aircraft.equalsIgnoreCase("Aircraft1")) {
			return new Aircraft1();
		} else if (aircraft.equalsIgnoreCase("Aircraft2")) {
			return new Aircraft2();
		}
		return null;
	}
}
