package com.eight;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
   public static void main(String[] args) {
	/*
	   List<Integer> list=List.of(10,20,77,33,80,60);
     List<Integer> lst=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(lst);*/
        
	/*
	 * List<String> list=List.of("Hello","world","Friend","How","Are","You"); String
	 * lst=list.stream().reduce("",(a,b)->a+" "+b); System.out.println(lst);
	 * 
	 * List<Integer>
	 * lists=list.stream().map(e->e.length()).collect(Collectors.toList());
	 * System.out.println(lists);
	 */
           
      List<Integer> lst=List.of(1,2,3,4,5,1,2,1,2,3);  
     Map<Integer, Long> listr=lst.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
     System.out.println(listr);
}
}
