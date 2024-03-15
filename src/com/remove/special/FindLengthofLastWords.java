package com.remove.special;

public class FindLengthofLastWords {
  public static void main(String[] args) {
	String input=" My channel name is JavaMind ";
	int len=lengthofwords(input);
	System.out.println(len);
}
  
  static int lengthofwords(String input) {
	     String str=input.trim();
	     int count=0;
	     for(int i=str.length()-1;i>=0;i--) {
	    	 if(str.charAt(i)!=' ')
	    	 {
	    		 count++;
	    	 }else {
	    		 break;
	    	 }
	     }
	     return count;
  }
}
