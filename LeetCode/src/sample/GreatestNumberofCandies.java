// 1431 Kids With the Greatest Number of Candies


package sample;

import java.util.ArrayList;

public class GreatestNumberofCandies {

	public static void main(String[] args) {
		int candies[] = {2,3,5,1,3};
		int extraCandies = 3;
		ArrayList<Boolean> list = new ArrayList<>();
		
		int max = candies[0];
		for(int i=1;i<candies.length;i++) {
			if(candies[i]>max)
				max = candies[i];
		}
		for(int i=0; i<candies.length;i++) {
			if((candies[i]+extraCandies)>=max)
				list.add(true);
			else
				list.add(false);
		}
		System.out.println(list);
	}

}
