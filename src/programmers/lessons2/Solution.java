package programmers.lessons2;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int beginIdx = commands[i][0] -1;
            int endIdx = commands[i][1];
            int targetIdx = commands[i][2] -1;
            int[] ret = Arrays.stream(array, beginIdx, endIdx).sorted().toArray();
             answer[i] = ret[targetIdx];
        }
        return answer;
    }
}

class Main {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}};
        Solution s = new Solution();
        int[] ret = s.solution(array, commands);
        System.out.println(Arrays.toString(ret));
    }
}
