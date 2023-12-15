package sample;

public class TwoSumArray {
	 public int[] TwoSumArray(int[] nums, int target) {
		
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 if(nums[0]+nums[1]== target) {
					 return new int[] {i,j};
				 }
			 }
				 
			 }
		 return new int[] {};
			 
	 }

	public static void main(String[] args) {
		
		        TwoSumArray twoSumArray = new TwoSumArray();
		        int[] nums = {2, 7, 11, 15};
		        int target = 9;
		        int[] result = twoSumArray.TwoSumArray(nums, target);

		        if (result.length == 2) {
		            System.out.println("Indices: " + result[0] + ", " + result[1]);
		            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
		        } else {
		            System.out.println("No valid pair found.");
		        }
		    }
		

		
	}


