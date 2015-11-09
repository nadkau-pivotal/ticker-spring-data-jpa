package com.example;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TickerApplication {
	
	private static Logger logger = Logger.getLogger(TickerApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(TickerApplication.class, args);
    }
    
//    insert into stock(ticker, price) values ('NFLX', 112.62);
//    insert into stock(ticker, price) values ('MS', 35.22);
//    insert into stock(ticker, price) values ('FB', 107.16);
//    insert into stock(ticker, price) values ('TSLA', 226.70);

//	@Bean
//	public CommandLineRunner demo(StockRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Stock("NFLX", 112.62));
//			repository.save(new Stock("MS", 35.22));
//			repository.save(new Stock("FB", 107.16));
//			repository.save(new Stock("TSLA", 226.70));
//
//			// fetch all customers
//			logger.info("Customers found with findAll():");
//			logger.info("-------------------------------");
//			for (Stock stock : repository.findAll()) {
//				logger.info(stock.toString());
//			}
//            logger.info("");
//
//			// fetch an individual customer by ID
//			Stock customer = repository.findOne("NFLX");
//			logger.info("Customer found with findOne(NFLX):");
//			logger.info("--------------------------------");
//			logger.info(customer.toString());
//            logger.info("");
//
//		};
//	}
}
