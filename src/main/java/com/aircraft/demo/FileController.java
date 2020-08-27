package com.aircraft.demo;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	@Autowired
	private FileManager manager;

	@PostMapping(value = "/sendFile", produces = "application/json")
	public ResponseEntity<String> sendFile(@RequestBody Request criteria) {

		try {
			manager.processFile(criteria, false, false);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;

	}

	@PostMapping(value = "/pause", produces = "application/json")
	public ResponseEntity<String> pause(@RequestBody Request criteria) {
		try {
			manager.processFile(criteria, true, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@PostMapping(value = "/resume", produces = "application/json")
	public ResponseEntity<String> resume(@RequestBody Request criteria) {
		try {
			manager.processFile(criteria, false, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
