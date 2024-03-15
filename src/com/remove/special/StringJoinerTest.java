package com.remove.special;

import java.util.StringJoiner;

public class StringJoinerTest {
	public static void main(String[] args) {
                  StringJoiner sjoiner=new StringJoiner(",", "[", "]");
                  sjoiner.add("X").add("Y").add("Z");
                  System.out.println(sjoiner);
                  
                  StringJoiner sjoin=new StringJoiner(":","[","]");
                  sjoin.add("M").add("N");
                  System.out.println(sjoin);
                  sjoiner.merge(sjoin);
                 System.out.println(sjoiner); 
                  
	}
}
