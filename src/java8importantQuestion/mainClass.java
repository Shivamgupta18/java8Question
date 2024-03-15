package java8importantQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class mainClass {
	public static void main(String[] args) {
     List<Employee> list=new ArrayList<>();
     list.add(new Employee("Shivam", "35"));
     list.add(new Employee("Pratibha", "45"));
     list.add(new Employee("Sheela", "55"));
     list.add(new Employee("Ravi", "65"));
     list.add(new Employee("Keerti", "75"));
     list.add(new Employee("Rista", "85"));
     list.add(new Employee("Xenon", "25"));
     list.add(new Employee("Payal", "15"));
     System.out.println(list);
     
     List<Employee> sd=
     list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	  System.out.println(sd);
	  // find the maximum age 
	Optional<String> emp= list.stream().max(Comparator.comparing(Employee::getAge)).map(Employee::getAge);
	   System.out.println(emp);
	   Optional<Employee> ds=
	   list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
	   System.out.println(ds);
	}
}