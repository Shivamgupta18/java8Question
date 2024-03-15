package java8importantQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseAwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input="Hello My world This is my world"; 
        String[] str=input.split(" ");
        List<String> ar=
        Arrays.stream(str).map(words-> new StringBuffer(words).reverse().toString()).collect(Collectors.toList());
         System.out.println(ar);
         
         
         /////////////////////////////////////////////////// hello 
         
         String str1="laptop";
        char[] charArray=str1.toCharArray();
        Map<Character, Integer> map=new HashMap<Character,Integer>();
        
        int count=1;
        for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
			}else {
				map.put(charArray[i], count);
			}	 
		}
       for(Map.Entry<Character, Integer> entry: map.entrySet()) {
    	   if(entry.getValue()>1) {
    		   System.out.println(entry.getKey()+" "+entry.getValue());
    	   }
       }
	}
}
