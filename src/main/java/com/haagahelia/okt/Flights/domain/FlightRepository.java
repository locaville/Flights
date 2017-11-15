package com.haagahelia.okt.Flights.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {
	
	List<Flight> findById(long id);

}
