package leetcode.N0012ShortestUnsortedContinuousSubarray;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findUnsortedSubarray(int[] nums) {

        Queue<Integer> queue = new PriorityQueue<>();

        for (Integer num : nums) {
            queue.add(num);
        }

        Integer start = null, end = null;

        for (int i = 0; i < nums.length; i++) {
            if (start == null && nums[i] != queue.poll()) {
                start = i;
            } else if (start != null && nums[i] != queue.poll()) {
                end = i;
            }
        }


        if (start == null) {
            return 0;
        }
        if (end == null) {
            end = nums.length - 1;
        }
        return end - start + 1;
    }
}

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {


        int[] nums = {2, 6, 4, 8, 10, 9, 15};

        Solution solution = new Solution();
        int subarray = solution.findUnsortedSubarray(nums);

        System.out.println(subarray);
    }
}



