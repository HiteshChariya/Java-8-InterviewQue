package com.java8.que;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

	private Long id;
	private String name;
	private Long age;
	
}
