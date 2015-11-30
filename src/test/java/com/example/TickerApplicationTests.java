package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TickerApplication.class)
@WebAppConfiguration
public class TickerApplicationTests {
	
	@Autowired
	StockRepository stockRepository;

	@Test
	public void testStockRepository() {
		Stock stock = new Stock("NFLX", 100.00);
		stockRepository.save(stock);
		System.out.println("StockRepository count: " + stockRepository.count());
		Assert.isTrue(stockRepository.count() == 1);
	}
}
