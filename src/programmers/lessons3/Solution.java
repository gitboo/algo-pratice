package programmers.lessons3;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        boolean[] students = new boolean[n];
        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1] = true;
        }
        reserve = Arrays.stream(reserve).sorted().toArray();
        int answer = n - lost.length;
        for (int i = 0; i < reserve.length; i++) {
            int reserveIdx = reserve[i] - 1;
            if (reserveIdx - 1 >= 0 && students[reserveIdx - 1]) {
                students[reserveIdx - 1] = false;
                answer++;
                continue;
            }
            if (students[reserveIdx]) {
                students[reserveIdx] = false;
                answer++;
                continue;
            }
            if (reserveIdx + 1 < students.length && students[reserveIdx + 1]) {
                students[reserveIdx + 1] = false;
                answer++;
            }
        }
        return answer;
    }
}


class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        Solution s = new Solution();
        int ret = s.solution(n, lost, reserve);
        System.out.println(ret);
    }
}
