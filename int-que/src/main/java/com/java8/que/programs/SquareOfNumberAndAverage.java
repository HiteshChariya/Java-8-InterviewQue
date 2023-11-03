package com.java8.que.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SquareOfNumberAndAverage {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(50);
		numbers.add(500);
		numbers.add(5000);
		numbers.add(5000);
		numbers.add(250);
		
		OptionalDouble average = numbers.stream().mapToInt(n->n*n)
				.filter(n->n>10000).average();
		if(average.isPresent())
			System.out.println(average.getAsDouble());
		
	}
}
