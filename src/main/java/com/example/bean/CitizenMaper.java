package com.example.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CitizenMaper implements RowMapper<Citizen>{

	@Override
	public Citizen mapRow(ResultSet rs, int rowNum) throws SQLException {
		Citizen c=new Citizen();
		c.setFname(rs.getString("fname"));
		c.setLname(rs.getString("lname"));
		c.setGender(rs.getString("gender"));
		c.setStatename(rs.getString("statename"));
		c.setDob(rs.getString("dob"));
		return c;
	}

}
