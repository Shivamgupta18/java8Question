package com.remove.special;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		  String input="Java@#$mindTechie!";
		  int count=0;
		  String removespeicalcharactor=" ";
		  String  specialcharactor="";
		  for(int i=0;i<input.length();i++) {
			  if(!Character.isLetterOrDigit(input.charAt(i)) && !Character.isWhitespace(input.charAt(i))) {
				  count++;
				  specialcharactor+=input.charAt(i);
			  }else {
				  removespeicalcharactor=removespeicalcharactor+input.charAt(i);
			  }
		  }
		  System.out.println(specialcharactor);
		  System.out.println(removespeicalcharactor);
		  if(count==0) {
			  System.out.println("No special  charactors");
		  }else {
			  System.out.println("special charactor in string"+count);
		  }
	}
}

