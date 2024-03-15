package com.singleton.eager;

public class TestClass {
   
	public static void main(String[] args) {
		  Singleton s1=Singleton.getinstance();
		  System.out.println(s1.hashCode());
		  
		  Singleton s2=Singleton.getinstance();
		  System.out.println(s2.hashCode());
		  
		  Singleton s3=Singleton.getinstance();
		  System.out.println(s3.hashCode());
	}
}
