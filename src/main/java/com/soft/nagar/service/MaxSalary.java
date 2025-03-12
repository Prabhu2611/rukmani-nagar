package com.soft.nagar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.soft.nagar.model.Employee;

public class MaxSalary {

	
	public static void main(String args[]) {
		
		Employee employee1 = new Employee("emp1",1000);
		Employee employee2 = new Employee("emp2",6000);
		Employee employee3 = new Employee("emp3",3000);
		Employee employee4 = new Employee("emp4",4000);
		Employee employee5 = new Employee("emp5",5000);
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee5);
		list.add(employee4);
		list.add(employee3);
		list.add(employee2);
		list.add(employee1);
		
		
		Employee em= list.stream().collect(Collectors.maxBy((e1,e2)->e1.getSalary()-e2.getSalary())).get();
		System.out.println(""+em.getName()+" sal "+em.getSalary());
	}
}
