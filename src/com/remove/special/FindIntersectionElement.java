package com.remove.special;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionElement {
	public static void main(String[] args) {
        int arr1[]= {90,20,15,25,35,70};         
        int arr2[]= {91,20,15,25,35,40};         

        interesction(arr1,arr2);
		
	}
	static void interesction(int arr1[],int arr2[]) {
		 Set<Integer> set=new HashSet<>();
		 for(int i=0;i<arr1.length;i++) {
			 set.add(arr1[i]);
		 }
		 for(int i=0;i<arr2.length;i++) {
			 if(set.contains(arr2[i])) {
				 System.out.println(arr2[i]);
			 }
		 }
	}
}
