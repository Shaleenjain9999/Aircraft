package com.aircraft.demo;

public class AirportFactory {

	public Airport getAirport(String airport) {
		if (airport.equalsIgnoreCase("airport1")) {
			return new Airport1();
		} else if (airport.equalsIgnoreCase("airport2")) {
			return new Airport2();
		}
		return null;
	}
}
