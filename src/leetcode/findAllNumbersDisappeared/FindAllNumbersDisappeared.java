package leetcode.findAllNumbersDisappeared;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = Arrays.stream(nums)
                                .boxed()
                                .collect(Collectors.toSet());

        List<Integer> ret = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}

public class FindAllNumbersDisappeared {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Solution solution = new Solution();
        List<Integer> ret = solution.findDisappearedNumbers(nums);
        System.out.println(ret);
    }
}
