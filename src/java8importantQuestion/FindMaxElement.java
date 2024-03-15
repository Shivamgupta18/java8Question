package java8importantQuestion;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
  public static void main(String[] args) {
	  List<Integer> list=Arrays.asList(12,34,56,10,15,8,49,25,98,98,32,15);
	  
	 System.out.println(list.stream().max(Integer::compare).get());
}
}
