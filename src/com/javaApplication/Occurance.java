package com.javaApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurance {
    public static void main(String[] args) {
		String str="Aavvgfdhghhjsfsdhmhfgdfhcgn, fbdfgddgdzzzzzzz";
		String[] arr1={"Apple","Banana","Orange"};
	Map<String, Long > stre=Arrays.asList(arr1).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(stre);
	
	//ap<String, Long> counts =
		//    list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	
	ArrayList<String> animals = new ArrayList<String>();
	animals.add("bat");
	animals.add("owl");
	animals.add("bat");
	animals.add("bat");
	Map<String, Long> count = 
		       animals.stream()
		              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(count);
	
	
    }
}
