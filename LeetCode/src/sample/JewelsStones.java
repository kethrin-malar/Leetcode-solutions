//771. Jewels and Stones

package sample;

import java.util.HashSet;
import java.util.Set;

public class JewelsStones {

	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		Set<Character> jewelSet = new HashSet<>();

		for (int i = 0; i < jewels.length(); i++) {
			char jewel = jewels.charAt(i);
			jewelSet.add(jewel);
		}

		for (int i = 0; i < stones.length(); i++) {
			char stone = stones.charAt(i);
			if (jewelSet.contains(stone)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		JewelsStones obj = new JewelsStones();
		String jewels = "Z";
		String stones = "zzzz";
		int result = obj.numJewelsInStones(jewels, stones);
		System.out.println("Jewels and Stones: " + result);

	}

}
