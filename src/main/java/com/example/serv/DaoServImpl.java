package com.example.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bean.Citizen;
import com.example.bean.CitizenMaper;
@Repository
public class DaoServImpl implements CitizenDaoIntr{
	
	@Autowired
	private JdbcTemplate jt;
	
	public long ssn() {
		long a=100000000;
		long b=999999999;
		long r=(long) (Math.random()*(b-a+1)+a);
		return r;
	}

	@Override
	public long insertRecord(Citizen c) {
		long s=ssn();
		String q="insert into citizen values(?,?,?,?,?,?)";
		int update = jt.update(q,new Object[]
				{c.getFname(),c.getLname(),c.getGender(),c.getDob(),c.getStatename(),s});
		
		return s;
	}

	@Override
	public Citizen retriveRecord(long ssn) {
		Citizen q=null;
		try {
			 q = jt.queryForObject("select * from citizen where ssn='"+ssn+"'",new CitizenMaper());
		}catch (Exception e) {
			
		}
		return q;
	}

}
