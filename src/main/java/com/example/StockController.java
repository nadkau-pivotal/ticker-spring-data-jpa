package com.example;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	private static Logger logger = Logger.getLogger(StockController.class);
	
	@Autowired
	StockRepository stockRepository;

	public StockController() {
		// TODO Auto-generated constructor stub
	}

	
    @RequestMapping(value="/stock", method=RequestMethod.GET)
    public Stock stock(@RequestParam(value="id", defaultValue="MS") String id) {
    	logger.info("Searching..." + id);
    	Stock stock = stockRepository.findOne(id);
    	if(stock == null){

    	}
    	logger.info("Found: " + stock);
    	return stock;
    }
    
    @RequestMapping(value="/stock", method=RequestMethod.POST)
    public Stock stock(@RequestParam(value="id", defaultValue="NFLX") String id,
    		@RequestParam(value="price", defaultValue="100.0") double price) {
    	Stock stock = new Stock(id, price);
    	logger.info("Saving...: " + stock);
    	Stock savedStock = stockRepository.save(stock);
    	logger.info("Saved: " + savedStock);
    	return savedStock;
    }
    
    
}
