package com.saket.j8.functions.function;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.saket.j8.util.TradeUtil;
import com.saket.java8.domain.Movie;
import com.saket.java8.domain.Trade;

/*Function functional interface */

public class FunctionFunctionalInterface {
	List<Trade> trades = TradeUtil.createTrades();
	
	Supplier<List<Trade>> tradesSupplier = () -> TradeUtil.createTrades();
	
	Function<String, Movie> createMovieFunction = s -> new Movie(s);
	
	Function<Integer, Trade> tradeFinder = id ->{
		for(Trade trade: trades){
			if(trade.getId() == id)
				return trade;
		}
		return new Trade();
	};
	
	Function<Integer, Trade> tradeFinder2 = id ->{
		List<Trade> trades = tradesSupplier.get();
		
		return trades.stream()
				.filter(t -> t.getId()==id)
				.findFirst()
				.get();
	};
	private void testFunction(String movieName) {
		Movie movie = createMovieFunction.apply(movieName);
		System.out.println("Movie is: "+movie);
		
		Trade t = tradeFinder.apply(2);
		System.out.println("Trade: "+t);
	}
	public static void main(String[] args) {
		new FunctionFunctionalInterface().testFunction("Gods Must Be Crazy");
	}

}
