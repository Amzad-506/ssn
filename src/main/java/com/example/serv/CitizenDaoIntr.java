package com.example.serv;

import com.example.bean.Citizen;

public interface CitizenDaoIntr {

	public long insertRecord(Citizen c);
	public Citizen retriveRecord(long ssn);
	
}
