package com.airline.dao;

import java.util.List;

import com.airline.bean.FlightDetails;

public interface IFlightDao {

	public List<FlightDetails> viewAllFlights();
}
