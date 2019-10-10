package programmers.lessons5;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] record) {


        return null;
    }
}


class Main {
    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        Solution s = new Solution();
        String[] answer = s.solution(record);

        System.out.println(Arrays.toString(answer));
    }
}
