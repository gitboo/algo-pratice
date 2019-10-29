package leetcode.N006_ClimbingStairs;

/**
 * 브레인스토밍을 해보면 문제의 값들이 "1 2 3 5 8 : 피보나치 수열" 과 같다.
 * f(n) = f(n-1) + f(n-2)
 *  - ex) f(5) = f(4) + f(3)
 *
 * 그냥 재귀구현을 하면: 공간복잡도 O(1) 시간복잡도 O(2^n)
 * f(2) = 2
 * f(3) = 3
 *
 * 다이나믹 프로래밍 : 공간복잡도 O(n) 시간복잡도 O(n)
 * 그래서 재귀구현 보다는 다이나믹 프로그래밍을 해서 점화식을 찾아야 한다.
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(1));
        System.out.println(s.climbStairs(2));
        System.out.println(s.climbStairs(3));
        System.out.println(s.climbStairs(4));
        System.out.println(s.climbStairs(5));
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length - 2];
    }
}



