package sample;

public class StringArrayareEquivalent {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String w1 = "";
		String w2 = "";

		for (int i = 0; i < word1.length; i++) {
			w1 = w1 + word1[i];
		}

		for (int i = 0; i < word2.length; i++) {
			w2 = w2 + word2[i];
		}

		return w1.equals(w2);
	}

	public static void main(String[] args) {
		String[] word1 = { "abd", "c" };
		String[] word2 = { "a", "bc" };
		StringArrayareEquivalent equality = new StringArrayareEquivalent();
		boolean isEqual = equality.arrayStringsAreEqual(word1, word2);
		System.out.println("Evaluate Boolean binary tree: " + isEqual);

	}
}
	