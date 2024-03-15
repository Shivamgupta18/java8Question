package com.remove.special;

import java.util.Stack;

public class ParenthessExpression {
	public static void main(String[] args) {
		String input = "{(][)}";
		if(balanceParenthesis(input))
		System.out.println("Input String "+ "is balance"+input);
		else {
			System.out.println("Input is not blanced"+input);
		}
	}

	public static boolean balanceParenthesis(String input) {
		Stack stack = new Stack();
		// convert input in to char array
		char[] charArray = input.toCharArray();
		// iterate the charArray

		for (int i = 0; i < charArray.length; i++) {
			char current = charArray[i];
			// check wheather current is '{','[','('.

			if (current == '{' || current == '[' || current == '(') {
				// push the current into stack.
				stack.push(current);
				continue;
			}
			// if stack is empty. return false
			if (stack.isEmpty()) {
				return false;
			}
			// we can use switch statement to pop the element from stack if it is
			// '[','{','('.
			char popcharacter;
			switch (current) {
			case ')':
				popcharacter = (char) stack.pop();
				// (
				if (popcharacter == '{' || popcharacter == '[')
					return false;
				break;
			case '}':
				popcharacter = (char) stack.pop();
				if (popcharacter == '[' || popcharacter == '(')
					return false;
				break;
			case ']':
				popcharacter = (char) stack.pop();
				if (popcharacter == '{' || popcharacter == '(')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
