package com.java.application;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FilterNumber {;

	 public static void main(String[] args) {
		List<String> list= Arrays.asList("123","java8","4567","lskSingh","789");
	List<String> sr=list.stream().filter(e->{
			Pattern pattern=Pattern.compile("\\d+");
			Matcher matcher=pattern.matcher(e);
		return	matcher.matches();
		}).collect(Collectors.toList());
		
		System.out.println(sr);
		
		List<String> srr=list.stream().filter(e->
		Pattern.compile("\\d+").matcher(e).matches()
	).collect(Collectors.toList());
		
		System.out.println(srr);
	}
}
