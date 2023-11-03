package com.java8.que.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.que.Employee;

public class FilterGetNameFromList {

	public static void main(String[] args) {
		Employee employee = Employee.builder().id(1l).name("Hitesh").age(28l).build();
		Employee employee1 = Employee.builder().id(2l).name("Naresh").age(19l).build();
		Employee employee2 = Employee.builder().id(3l).name("Kishan").age(27l).build();
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
		List<String> names = employees.stream().filter(e->e.getAge()>20).map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);
	}
}
