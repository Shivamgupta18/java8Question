package com.eight;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		
		map.put("apple", 23);
		map.put("rahul", 30);
		map.put("shreya", 28);
		map.put("peeter", 45);
		map.put("zain", 70);
		System.out.println(map);
		Map<String, Integer> map2=
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	   System.out.println(map2);
	}
}
