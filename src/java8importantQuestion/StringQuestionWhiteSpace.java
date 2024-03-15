package java8importantQuestion;

import java.util.stream.Collectors;

public class StringQuestionWhiteSpace {
	public static void main(String[] args) {
		String str = "This  is my  classmate ";
		String result = str.chars().filter(e -> !Character.isWhitespace(e)).mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

		System.out.println(result);
		
		

	}
}

