package com.airline.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightinfo")
public class FlightDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flightno")
	private int flightno;
	
	@Column(name="airline")
	private String airline;
	
	@Column(name="dep_city")
	private String dep_city;
	
	@Column(name="arr_city")
	private String arr_city;
	
	@Column(name="dep_date")
	private LocalDate dep_date;
	
	@Column(name="arr_date")
	private LocalDate arr_date;
	
	@Column(name="fseats")
	private int fseats;
	
	@Column(name="fseatsfare")
	private double fseatsfare;
	 
	
	public FlightDetails(int flightno, String airline, String dep_city,
			String arr_city, LocalDate dep_date, LocalDate arr_date,
			int fseats, double fseatsfare) {
		super();
		this.flightno = flightno;
		this.airline = airline;
		this.dep_city = dep_city;
		this.arr_city = arr_city;
		this.dep_date = dep_date;
		this.arr_date = arr_date;
		this.fseats = fseats;
		this.fseatsfare = fseatsfare;
	}
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDep_city() {
		return dep_city;
	}
	public void setDep_city(String dep_city) {
		this.dep_city = dep_city;
	}
	public String getArr_city() {
		return arr_city;
	}
	public void setArr_city(String arr_city) {
		this.arr_city = arr_city;
	}
	public LocalDate getDep_date() {
		return dep_date;
	}
	public void setDep_date(LocalDate dep_date) {
		this.dep_date = dep_date;
	}
	public LocalDate getArr_date() {
		return arr_date;
	}
	public void setArr_date(LocalDate arr_date) {
		this.arr_date = arr_date;
	}
	public int getFseats() {
		return fseats;
	}
	public void setFseats(int fseats) {
		this.fseats = fseats;
	}
	public double getFseatsfare() {
		return fseatsfare;
	}
	public void setFseatsfare(double fseatsfare) {
		this.fseatsfare = fseatsfare;
	}
	@Override
	public String toString() {
		return "FlightSchedules [flightno=" + flightno + ", airline=" + airline
				+ ", dep_city=" + dep_city + ", arr_city=" + arr_city
				+ ", dep_date=" + dep_date + ", arr_date=" + arr_date
				+ ", fseats=" + fseats + ", fseatsfare=" + fseatsfare + "]";
	}
	
}