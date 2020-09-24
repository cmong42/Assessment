package Array;

import java.util.ArrayList;

public class Palindromes {
	String[] myString = {"racecar", "hare"};
	public void isPalindrome(){  
		for (String i: myString) {
			ArrayList<Character> forwards = new ArrayList<Character>();
			ArrayList<Character> reverse = new ArrayList<Character>();
			for (int z = 0; z<i.length(); z++) {
				forwards.add(i.charAt(z));
			}
			for (int y = i.length()-1; y>=0; y--) {
				reverse.add(i.charAt(y));
			}
	        if (forwards.equals(reverse)) {
	        	System.out.println(i+" is palindrome.");
	        	System.out.println(forwards);
	        	System.out.println(reverse);
	        }else {
	        	System.out.println(i+" is not palindrome");
	        	System.out.println(forwards);
	        	System.out.println(reverse);
	        }
		}
		}
	public static void main(String[] args) {
		Palindromes myPalindrome = new Palindromes();
		myPalindrome.isPalindrome();
	}
}
