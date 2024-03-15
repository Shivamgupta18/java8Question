package com.eight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

class MainClass {

	public static void main(String[] args) {
       List<Employee> employee=createEmployee();
    long empcount=employee.stream().filter(e->e.getAge()>25).count();
		System.out.println(empcount);
		// find the employee whose name is Marry.
	Set<Employee> e9=employee.stream().filter(e->e.getName().equalsIgnoreCase("Mary")).collect(Collectors.toSet());	
	// System.out.println(e9);
	OptionalInt max =employee.stream().mapToInt(Employee::getAge).max();
	if(max.isPresent()) {
		System.out.println(max.getAsInt());
	}
	// sort age
	//employee.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).forEach(System.out::println);
	 
	Optional<Employee> emp= employee.stream().max(Comparator.comparing(Employee::getAge));
	System.out.println(emp.get());
	List<String> e78=employee.stream().map(Employee::getName).collect(Collectors.toList());
	 String employeeNamesStr =String.join(",",e78);
	// System.out.println(employeeNamesStr);
	}    
    
	public static List<Employee> createEmployee() {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Martin",19);
		Employee e2 = new Employee("John", 21);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Mary", 18);
		Employee e5 = new Employee("John", 22);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		return list;
	}
}