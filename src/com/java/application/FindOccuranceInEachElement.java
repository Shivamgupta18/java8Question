package com.java.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOccuranceInEachElement {
	public static void main(String[] args) {
         //  Integer arr[]= {1234,13233,1245,123333345};
    	   String arr[]= {"banda","kanpur","delhi","hyderbad","Bangalore"};

    List<Long> stre=       Arrays.stream(arr).map(num->String.valueOf(num)).
           map(str->str.chars().mapToObj(c->(char)c).filter(n1->n1=='a').count()
        		   ).collect(Collectors.toList());
    System.out.println(stre);
	}
}
