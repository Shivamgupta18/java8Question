package com.javaApplication;

import java.io.Serializable;

public class Singleton implements Serializable {
     static  Singleton s=null;
	private Singleton() throws Exception {
		 System.out.println("Private Constructor called!");
		 if(s!=null) 
			 throw new Exception();
	}
	
	//what is the best way to call a mrthod without object we can make that method as  static 
	static Singleton getObject() throws Exception {
		if(s==null) {
		 s=new Singleton(); 
		}
		return s;
	 }
	
	Object readResolve() throws Exception{
		if(s==null) {
			 s=new Singleton(); 
			}
		return s;
	 }
}
