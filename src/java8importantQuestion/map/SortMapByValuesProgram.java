package java8importantQuestion.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import java8importantQuestion.Employee;

public class SortMapByValuesProgram {

	
	public static void main(String[] args) {
		Map<String, Employee> map=new HashMap<>();
		map.put("Shivam", new Employee("Gupta", "50"));
		map.put("Pratibha", new Employee("Patel", "60"));
		map.put("Neha", new Employee("Rana", "10"));
		map.put("Rakshita", new Employee("Singh", "20"));
		map.put("ravi", new Employee("yadav", "90"));
		map.put("Shubham", new Employee("Verma", "80"));
		map.put("Krish", new Employee("Sharma", "30"));
		
		//System.out.println(map);
		//Map<Object, Object> ma=
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	//	Map<Object, Object> math=		map.entrySet().stream().sorted((e1,e2)->e1.getValue().getName().compareTo(e2.getValue().getName())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		Map<Object, Object> mat=map.entrySet().stream().filter(e->e.getValue().getAge().equalsIgnoreCase("80")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
       System.out.println(mat);
		/*
		 * for(Map.Entry<Object,Object> entry: ma.entrySet()) {
		 * System.out.println(entry.getKey()+""+entry.getValue()); }
		 */
		
		for(Map.Entry<Object,Object> entry: mat.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
}
