/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 1
 * Date: 2021-06-01
 */

public class Palindrome {
	
	private static boolean isPalindrome(String input) {           //check whether the given string is a palindrome or not
		boolean validation = true;
		Stack stack = new Stack(input);
		
		for(int i = 0; i < input.length(); i ++) {           //it will help the string in the stack to ignore spaces
			if(input.charAt(i) != ' ') {
				stack.push(input.charAt(i));
			}
		}
		
		for(int i = 0; i < input.length(); i++) {           //it will compare between input string and stack string
			if(input.charAt(i) != ' ') {                    //ignoring spaces
				if(Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(stack.pop())) {
					validation = false;
					i = input.length();
				}
			}
		}
		
		return validation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = args[0];
		
		 if (isPalindrome(str)) {
	            System.out.println("The string \"" + str + "\" is a palindrome.");
	        } else {
	            System.out.println("The string \"" + str + "\" is not a palindrome.");
	        }
	}
}
