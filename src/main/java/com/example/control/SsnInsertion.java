package com.example.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Citizen;
import com.example.serv.CitizenDaoIntr;

@RestController
public class SsnInsertion {

	@Autowired
	private CitizenDaoIntr cd;
	
	@PostMapping("/insert")
	public ResponseEntity<String> insertion(@RequestBody Citizen c) {
		long insertRecord = cd.insertRecord(c);
		String msg="Your Record Inserted Successfully with SSN: "+insertRecord;
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/retrive")
	public ResponseEntity<String> getData(long ssn) {
		Citizen retriveRecord = cd.retriveRecord(ssn);
		if(retriveRecord==null) {
			return new ResponseEntity<String>("Invalid SSN",HttpStatus.OK);
		}
		String string = retriveRecord.toString();
		return new ResponseEntity<String>(string,HttpStatus.OK);
		
	}
}
