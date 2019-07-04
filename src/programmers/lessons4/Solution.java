package programmers.lessons4;

import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a,b);
        return localDate.getDayOfWeek().toString().substring(0,3);
    }
}


class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        Solution solution = new Solution();
        System.out.println(solution.solution(5,24));

    }
}
