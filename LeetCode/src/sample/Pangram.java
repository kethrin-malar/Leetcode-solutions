package sample;

import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {

		String sentence1 = "abc";

		System.out.println("Sentence 1 is a pangram: " + checkIfPangram(sentence1));

	}

	public static boolean checkIfPangram(String sentence) {
		HashSet<Character> letters = new HashSet<>();// HashSet named letters to store unique characters

		for (int i = 0; i < sentence.length(); i++) {
	        char ch = sentence.charAt(i);
	        if (Character.isLetter(ch)) {
	            letters.add(Character.toLowerCase(ch)); // Convert to lowercase for uniformity
	        }
	    }
		return letters.size() == 26; //letter size is 3==26 so false
	}
}





//same character will be appaer in the sentence the hashset take one value of unique character.