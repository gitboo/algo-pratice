package baekjoon.solution2920;

// https://www.acmicpc.net/problem/2920
public class Solution2920 {
    public String solution(int[] arr) {
        if (arr.length != 8) {
            return "ERROR";
        }
        if (arr[0] == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != (i + 1)) {
                    return "mixed";
                }
            }
            return "asc";
        }
        if (arr[0] == 8) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != (8 - i)) {
                    return "mixed";
                }
            }
            return "desc";
        }
        return "mixed";
    }
}

class Main {
    public static void main(String[] args) {
        Solution2920 solution = new Solution2920();

        //int[] arg1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arg1 = {8, 7, 6, 5, 4, 3, 1, 2};
        System.out.println(solution.solution(arg1));
    }
}



