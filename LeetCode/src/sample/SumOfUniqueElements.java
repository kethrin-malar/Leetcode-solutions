// 2540 Sum of Unique Elements

package sample;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++; // Count occurrences of the element
                    break; // Break if found more than one occurrence
                }
            }

            if (count == 0) {
                sum = sum+nums[i]; // Add to sum if the element is unique
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        SumOfUniqueElements solution = new SumOfUniqueElements();
        int result = solution.sumOfUnique(nums);
        System.out.println("Sum of unique elements: " + result);
    }
}

