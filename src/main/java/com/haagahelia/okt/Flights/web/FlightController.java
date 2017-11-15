package com.haagahelia.okt.Flights.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haagahelia.okt.Flights.domain.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository repository;
	
	@RequestMapping(value="/")
	public String frontPage() {
		return "index.html";
	}

}
