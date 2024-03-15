package com.java.application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class javaApplication {
	public static void main(String[] args) {

		// sort the map based on values.

		Map<String, Integer> has = new HashMap<>();
		has.put("job", 3);
		has.put("rAvi", 5);
		has.put("krish", 1);
		has.put("manu", 7);
		System.out.println(has);
		Map<String, Integer> setvalue = has.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(setvalue);
	}
}
