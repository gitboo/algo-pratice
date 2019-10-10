package programmers.lessons6;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = IntStream.of(arr).filter((e) -> e % divisor == 0)
                .sorted()
                .toArray();

        if (answer.length == 0) {
            return new int[]{-1};
        }
        return answer;
    }
}

class Main {
    public static void main(String[] args) {

        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        Solution s = new Solution();
        int[] answer = s.solution(arr, divisor);

        System.out.println(Arrays.toString(answer));


    }
}
