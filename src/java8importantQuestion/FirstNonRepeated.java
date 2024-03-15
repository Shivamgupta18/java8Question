package java8importantQuestion;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
	public static void main(String[] args) {
       String input = "Java Articles are Awesome";
    String input1=input.toLowerCase();
   Character ch= input1.chars().mapToObj(e->(char)e).
    collect(Collectors.groupingBy(Function.identity(),
    		LinkedHashMap::new,Collectors.counting())).
    entrySet().stream().filter(e->e.getValue()==1L).map(e->e.getKey()).findFirst().get();
    System.out.println(ch);
	}
}
