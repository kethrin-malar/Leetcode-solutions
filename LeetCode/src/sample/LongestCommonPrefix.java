package sample;

import java.util.Arrays;

public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return ""; // Empty string for no elements
        }
        Arrays.sort(strs); // alphabetical  sort
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length()) { //(0<4)
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args) {
        String strs[] = { "java", "javascript", "javadoc" };

        System.out.println(longestCommonPrefix(strs));
        
    }
}
