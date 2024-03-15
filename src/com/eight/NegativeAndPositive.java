package com.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NegativeAndPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { -1, 4, 6, -4, -2, 10, 9 };
          int temp=0;
          for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
       // Arrays.stream(arr).forEach(e->System.out.print(" "+e));
          Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e));
	}

}
