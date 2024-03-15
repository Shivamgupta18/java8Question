package com.java.application;

import java.util.stream.IntStream;

public class VowelOccurance {
   public static void main(String[] args) {
	String str="shivamGuptaBisanda";
Long c= str.chars().filter(ch -> (ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' || ch == 'u')).count();
System.out.println(c);
}
}
