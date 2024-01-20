package sample;

import java.util.Arrays;

public class SmallerthanCurrentNumber {
	public int[] smallerNumber(int[] nums) {
		int count;
		int arr[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[j] < nums[i]) {
					count++;
				}
			}
			arr[i] = count;
		}
		return arr;
	}

	

	public static void main(String[] args) {

		SmallerthanCurrentNumber obj = new SmallerthanCurrentNumber();
		int[] nums = { 8, 1, 2, 2, 3 };
		int[] result = obj.smallerNumber(nums);
		System.out.println("SmallerthanCurrentNumber: " + Arrays.toString(result));
	}

}
