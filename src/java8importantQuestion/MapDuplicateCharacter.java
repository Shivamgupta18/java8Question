package java8importantQuestion;

import java.util.HashMap;
import java.util.Map;

public class MapDuplicateCharacter {
	public static void main(String[] args) {
                 String str="ashokkumar";
                 
                 Map<Character, Integer> map=new HashMap<>();
                 for (int i = 0; i < str.length(); i++) {
					    char c=str.charAt(i);
					    if(map.containsKey(c)) {
					    	int count=map.get(c);
					    	map.put(c,count+1);
					    }else {
					    	map.put(c, 1);
					    }
				}
                for(Map.Entry<Character, Integer> maps: map.entrySet()) {
                	if(maps.getValue()>1) {
                	System.out.println(maps.getKey());
                	}
                }
	}
}
