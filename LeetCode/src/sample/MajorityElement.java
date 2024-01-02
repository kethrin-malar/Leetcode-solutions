//169. Majority Element

package sample;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;
        int majorityElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                majorityElement = nums[i];
            }
        }

        if (maxCount > nums.length / 2) {
            return majorityElement;
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 1, 1, 3, 3};
        MajorityElement element = new MajorityElement();
        int result = element.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
