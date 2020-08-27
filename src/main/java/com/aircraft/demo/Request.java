package com.aircraft.demo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Request implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4963768816548707260L;
	
	
	private String airport;
	private String aircraft;
	private String file;
	private long  layover;
	
	
	public long  getLayoverTime() {
		return layover;
	}
	public void setLayoverTime(long  layoverTime) {
		this.layover = layoverTime;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	
	//private String file;

}
