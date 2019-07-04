package com.airline.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.FlightDetails;
import com.airline.dao.FlightDaoImpl;
import com.airline.dao.IFlightDao;

@Service
@Transactional
public class FlightServiceImpl implements IFlightService {
	
	@Autowired
	private IFlightDao dao;

	public FlightServiceImpl() {
		dao = new FlightDaoImpl(); 
	}

	@Override
	public List<FlightDetails> viewAllFlights() {
		// TODO Auto-generated method stub
		return dao.viewAllFlights();
	}

}
