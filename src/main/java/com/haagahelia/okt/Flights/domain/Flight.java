package com.haagahelia.okt.Flights.domain;

public class Flight {
	
	private long id;
	private String flightNumber;
	private String airline;
	private String pointOfDeparture;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private String seatNumber;
	
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Flight(long id, String flightNumber, String airline, String pointOfDeparture, String destination,
			String departureTime, String arrivalTime, String seatNumber) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.pointOfDeparture = pointOfDeparture;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
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

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
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
				+ pointOfDeparture + ", destination=" + destination + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", seatNumber=" + seatNumber + "]";
	}
	
}
