package com.javaApplication;

public class newton {
   public static void main(String[] args) {
	   String input="conjecture presented to be ";
	   System.out.println(toAlter(input));
}
   public static String toAlter(String input) {
	  
		StringBuilder result=new StringBuilder();
		boolean cap= true;
		for(char c :input.toCharArray()) {
			if(Character.isWhitespace(c)) 
				result.append(c);
			else {
				result.append(cap?Character.toUpperCase(c):Character.toLowerCase(c));
				cap=!cap;
				
			}
		}
		return result.toString();
   }
}
