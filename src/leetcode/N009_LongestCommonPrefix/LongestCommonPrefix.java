package leetcode.N009_LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


//> https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] input = {"1o1wer", "1flow", "2flight"};
        Solution solution = new Solution();
        String prefix = solution.longestCommonPrefix(input);
        System.out.println(prefix);

    }
}


class Solution {
    public String longestCommonPrefix(String[] arr) {

        if (Objects.isNull(arr) || arr.length == 0) {
            return "";
        }

        StringBuilder builder = new StringBuilder();

        char[] minChars = Arrays.stream(arr)
                .min(Comparator.comparing(String::length))
                .get().toCharArray();

        outer :
        for (int i = 0; i < minChars.length; i++) {
            for (String each : arr) {
                if (each.charAt(i) != minChars[i]) {
                    break outer;
                }
            }
            builder.append(minChars[i]);
        }
        return builder.toString();
    }
}