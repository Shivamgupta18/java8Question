package com.java.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumberinList {
	public static void main(String[] args) {
       List<Integer> list=Arrays.asList(1,2,1,5,8,5,3,9,3);
       Set<Integer> set=new HashSet<>();
       list.stream().filter(e->!set.add(e)).forEach(e->System.out.println(e));
       
      // list.stream().mapToInt(e->e).sum();
       
       
  
   
	}
}
