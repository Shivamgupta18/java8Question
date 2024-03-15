package com.eight;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringBasedOnLength {
	public static void main(String[] args) {
            List<String> lst=Arrays.asList("Stream","Operations", "on", "Collections");
          lst.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(p-> System.out.println(p));
      //   System.out.println(ls);
            
            List<String> strings =
            		 Arrays.asList("Stream","Operations","on","Collections");
            		strings.stream()
            		 .sorted( (s1, s2) -> s2.length() - s1.length() )
            		 .forEach(System.out::println);
	}
}
