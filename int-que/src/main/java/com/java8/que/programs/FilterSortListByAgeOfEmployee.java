package com.java8.que.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.que.Employee;

public class FilterSortListByAgeOfEmployee {

	public static void main(String[] args) {
		Employee employee = Employee.builder().id(1l).name("Hitesh").age(28l).build();
		Employee employee1 = Employee.builder().id(2l).name("Naresh").age(25l).build();
		Employee employee2 = Employee.builder().id(3l).name("Kishan").age(27l).build();
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
		List<Long> employeess = employees.stream().map(e->e.getAge())
				.sorted().collect(Collectors.toList());
		System.out.println(employeess);
		
		employees.sort((e1,e2) -> Integer.valueOf(String.valueOf(e1.getAge()))-Integer.valueOf(String.valueOf(e2.getAge())));
		employees.forEach(System.out::println);
		System.out.println();
		employees.sort((e1,e2) -> Integer.valueOf(String.valueOf(e2.getAge()))-Integer.valueOf(String.valueOf(e1.getAge())));
		employees.forEach(System.out::println);
	}
}
