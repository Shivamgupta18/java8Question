package com.singleton.eager;

public class Singleton {
         private static Singleton instance=null;
            private Singleton() {
				// TODO Auto-generated constructor stub
			}
            public static Singleton getinstance() {
            	if(instance==null) {
            		instance= new Singleton();
            	}
            	return instance;
            }
           
}
