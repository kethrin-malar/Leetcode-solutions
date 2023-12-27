//20. Valid Parentheses

package sample;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();//initialize stack
		
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == '(' || ch == '{' || ch == '[') { //first char is opening bracket this logic 
				stack.push(ch);
			} else {
				if (stack.isEmpty()) //stack is empty or any one closing bracket not matching bracket return false
					return false;
				

				else if (ch == ')')    //this logic the first char is closing parenthese the top of the stack the mathching parentheses it is true
					if (stack.peek() == '(') {
						stack.pop();
						return false;
					}

					else if (ch == '}')
						if (stack.peek() == '{') {
							stack.pop();
							return false;
						}

						else if (ch == ']')
							if (stack.peek() == '[') {
								stack.pop();
								return false;
							}
			}
		}

		if (stack.size() == 0)//stack is empty return true otherwise it is false
			return true;

		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "())";

		boolean result = isValid(s);

		System.out.println("Is the string valid? " + result);
	}

}
