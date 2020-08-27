package com.aircraft.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aircraft1 implements Aircraft {

	@Override
	public void sendFile(String file, boolean isPaused, boolean isResume, Airport airport,long  layover) throws Exception {
		System.out.println("Aircraft 1 sending " + file);
		 LocalDateTime currentTime = LocalDateTime.now(ZoneId.of("UTC"));
		 LocalDateTime endTime = currentTime.plusHours(layover);
		// Murugan code
		BufferedReader br = new BufferedReader(new FileReader("plans.csv"));
		PrintWriter output = new PrintWriter("plans.txt");
		PrintWriter metadataOutput = new PrintWriter("metadata.txt");//airport name,filename,aircraft name
		String line = br.readLine();
		//if metadata read from metadata content else read from begining
		while (line != null && currentTime.isBefore(endTime)) {
			line = br.readLine();
			output.println(line);
		}

		output.flush();
		output.close();
		

		airport.recieveFile(file);

	}

}
