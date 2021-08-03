package com.saket.j8.streams.commonops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.saket.j8.util.MovieUtil;
import com.saket.java8.domain.Actor;
import com.saket.java8.domain.Movie;

// FlatMap functionality
public class FlatMap {
	List<Movie> movies = MovieUtil.createMoviesAndActors();
	String[] fruits = new String[]{"apples","oranges"};
	String[] veggies = new String[]{"beans","peas"};
	
	private void flatMapMovies(){
		Stream<Actor> actorsStream = 
				movies.stream().flatMap(m -> m.getActors().stream());
		
		actorsStream.forEach(System.out::println);
	}
	
	private void flatMapVeggies() {
		Stream<List<String>> fruitsAndVeggies = 
				Stream.of(Arrays.asList(fruits), Arrays.asList(veggies));
		fruitsAndVeggies.flatMap(s -> s.stream())
		.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		new FlatMap().flatMapVeggies();
		new FlatMap().flatMapMovies();
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> squares = numbers.stream().map(n -> n*n).collect(Collectors.toList());
		squares.forEach(System.out::println);
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		
		//TODO: complete this code block
		//List<int[]> pairs =numbers1.stream().flatMap(e -> numbers2.stream().map(j-> new int[] {e,j})).collect(Collectors.toList());
		//pairs.forEach(e-> e.);
	}

}
