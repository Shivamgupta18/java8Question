package java8importantQuestion;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateCharacter {
	public static void main(String[] args) {
		String str = "javay8nfnfgfnb";
		List<Character> stre = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue()> 1).map(e2 -> e2.getKey()).collect(Collectors.toList());
		System.out.println(stre);
	}
}
