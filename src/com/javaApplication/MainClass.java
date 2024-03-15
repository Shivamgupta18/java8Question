package com.javaApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getObject();
		System.out.println(s1.hashCode());
         // reflections
		/*
		 * Constructor<Singleton> s3 = Singleton.class.getDeclaredConstructor();
		 * s3.setAccessible(true); Singleton sre=s3.newInstance();
		 * System.out.println(sre.hashCode());
		 */
		
		
		// de-serialization.
		FileOutputStream f1=new FileOutputStream("C:\\Users\\shivam.g\\Music\\Aws\\hello.txt");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(s1);
		
		FileInputStream f2=new FileInputStream("C:\\Users\\shivam.g\\Music\\Aws\\hello.txt");
		ObjectInputStream o4=new ObjectInputStream(f2);
		Singleton s3=(Singleton)o4.readObject(); 
		System.out.println(s3.hashCode());
	}
}
