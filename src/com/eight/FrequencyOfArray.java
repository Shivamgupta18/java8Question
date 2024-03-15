package com.eight;

import java.util.HashMap;
import java.util.Map;

// This is another method for count of integer words
public class FrequencyOfArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 2, 3, 3, 4, 5, 6, 7, 9, 9, 0, 4, 2 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			Integer count = map.getOrDefault(arr[i], 1);
			map.put(arr[i], count + 1);
		}
		System.out.println(map);
	}
}
