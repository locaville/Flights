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
				repo.save(new Flight("A1234", "Finnair", "Helsinki", "Stockholm", "21.11.2017", "21.11.2017", "21B"));
				repo.save(new Flight("A2345", "SAS", "Oslo", "Riga", "21.11.2017", "21.11.2017", "4A"));
				repo.save(new Flight("A3456", "Lufthansa", "Frankfurt", "London", "10.12.2017", "10.12.2017", "14F"));
			}
			
		};
	}
}
