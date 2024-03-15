package com.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumNumberAndMinimumNumber {
	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(10,15,8,49,25,98,32);
		List<String> ams=
		lists.stream().map(e->e+"").filter(e->e.endsWith("5")).collect(Collectors.toList());
		System.out.println(ams);
		
	int minvalue=lists.stream().min(Integer::compareTo).get();
	System.out.println(minvalue);
	
	int maxvalue=lists.stream().max(Integer::compareTo).get();
	System.out.println(maxvalue);
	}
}
