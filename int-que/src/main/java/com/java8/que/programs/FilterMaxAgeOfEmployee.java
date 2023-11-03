package com.java8.que.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Collectors;

import com.java8.que.Employee;

public class FilterMaxAgeOfEmployee {

	public static void main(String[] args) {
		Employee employee = Employee.builder().id(1l).name("Hitesh").age(28l).build();
		Employee employee1 = Employee.builder().id(2l).name("Naresh").age(29l).build();
		Employee employee2 = Employee.builder().id(3l).name("Kishan").age(27l).build();
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
		OptionalLong maxAge = employees.stream().mapToLong(Employee::getAge).max();
		if(maxAge.isPresent())
			System.out.println("Max Age By OptionalLong : "+maxAge.getAsLong());
		
		Optional<Employee> optEmployee = employees.stream().max(Comparator.comparing(Employee::getAge));
		if(optEmployee.isPresent())
			System.out.println("Max Age By Comparator : "+optEmployee.get().getAge());
		
		Optional<Long> optEmployee1 = employees.stream().map(e->e.getAge()).reduce(Long::max);
		if(optEmployee1.isPresent())
			System.out.println("Max Age By Reduce : "+optEmployee1.get());
		
		Optional<Long> optEmployee2 = employees.stream().map(e->e.getAge()).collect(Collectors.maxBy(Comparator.naturalOrder()));
		if(optEmployee2.isPresent())
			System.out.println("Max Age By Collect Comparator : "+optEmployee2.get());
		
		Long optEmployee3 = employees.stream().map(e->e.getAge()).
				collect(Collectors.summarizingLong(Long::longValue)).getMax();
		System.out.println("Max Age By Collect Comparator Summarizing : "+optEmployee3);
		
	}
	
}
