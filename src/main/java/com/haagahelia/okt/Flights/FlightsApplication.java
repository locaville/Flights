package com.haagahelia.okt.Flights;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.haagahelia.okt.Flights.domain.Flight;
import com.haagahelia.okt.Flights.domain.FlightRepository;


@SpringBootApplication
public class FlightsApplication {
	
	private static final Logger log = LoggerFactory.getLogger(FlightsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlightsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner flightRunner(FlightRepository repo) {
		return new CommandLineRunner() {

			@Override
			public void run(String... arg0) throws Exception {
				log.info("flights:");
				repo.save(new Flight("A1234", "Finnair", "Helsinki", "Stockholm", "11:40 21.11.2017", "11:45 21.11.2017", "21B"));
				repo.save(new Flight("A2345", "SAS", "Oslo", "Riga", "13:50 21.11.2017", "16:55 21.11.2017", "4A"));
			}
			
		};
	}
}
