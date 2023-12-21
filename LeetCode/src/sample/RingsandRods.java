//2103  Rings and Rods

package sample;

import java.util.HashSet;

public class RingsandRods {

	public int countPoints(String rings) {
	    HashSet<Character> r = new HashSet<>();
	    HashSet<Character> g = new HashSet<>();
	    HashSet<Character> b = new HashSet<>();

	    int n = rings.length(); //rings length=14

	    for (int i = 0; i < n; i += 2) {

	        char ringColor = rings.charAt(i);
	        char ringNumber = rings.charAt(i + 1);

	        if (ringColor == 'R') {
	            r.add(ringNumber);
	        } else if (ringColor == 'G') {
	            g.add(ringNumber);
	        } else if (ringColor == 'B') {
	            b.add(ringNumber);
	        }
	    }

	    int count = 0;
	    for (char c = '0'; c <= '9'; c++) {
	        if (r.contains(c) && g.contains(c) && b.contains(c)) {
	            count++;
	        }
	    }

	    return count;
	}
	 public static void main(String[] args) {
	        RingsandRods ringsAndRods = new RingsandRods();
	        String rings = "B0G0R0B1G1R1";
	        int result = ringsAndRods.countPoints(rings);
	        System.out.println("Number of rods with all three colors: " + result);
	    }
	}

