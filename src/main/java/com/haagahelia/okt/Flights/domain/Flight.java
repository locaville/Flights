package com.haagahelia.okt.Flights.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String flightNumber;
	private String airline;
	private String pointOfDeparture;
	private String destination;
	private String departureDate;
	private String arrivalDate;
	private String seatNumber;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Flight(String flightNumber, String airline, String pointOfDeparture, String destination,
			String departureDate, String arrivalDate, String seatNumber) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.pointOfDeparture = pointOfDeparture;
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.seatNumber = seatNumber;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getPointOfDeparture() {
		return pointOfDeparture;
	}


	public void setPointOfDeparture(String pointOfDeparture) {
		this.pointOfDeparture = pointOfDeparture;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDepartureDate() {
		return departureDate;
	}


	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}


	public String getArrivalDate() {
		return arrivalDate;
	}


	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}


	public String getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}


	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", airline=" + airline + ", pointOfDeparture="
				+ pointOfDeparture + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", seatNumber=" + seatNumber + "]";
	}
	
	
	
	
	
	
}
