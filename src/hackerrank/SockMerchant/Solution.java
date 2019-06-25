package hackerrank.SockMerchant;

import java.util.HashSet;
import java.util.Set;

//https://www.hackerrank.com/challenges/sock-merchant/problem
public class Solution {
    public static int sockMerchant(int n, int[] ar) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int each : ar) {
            if (set.contains(each)) {
                set.remove(each);
                count++;
                continue;
            }
            set.add(each);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(9, ar);
        System.out.println(result);
    }
}

