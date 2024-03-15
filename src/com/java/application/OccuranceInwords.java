package com.java.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceInwords {
	public static void main(String[] args) {
		String str = "javagffghhg";
		Map<Character, Long> col = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(col);
// new method.
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray())
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int count = map.get(c);
				map.put(c, count + 1);
			}
		System.out.println(map);

	}

}
