package com.eight;

public class FrequencyofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] names= {"Pawan","Rohan","Sudesh","Pawan","Shiv"};
     
     for (int i = 0; i < names.length; i++) {
    	 int count=0;
    	 String singlename= names[i];
		for (int j = 0; j < names.length; j++) {
			if(names[j]==singlename) {
				count=count+1;
			}
			
		}
		System.out.println(names[i]+""+count);
	}
	}

}
