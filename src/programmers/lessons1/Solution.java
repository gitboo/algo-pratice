package programmers.lessons1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {

        int[] pa1 = {1, 2, 3, 4, 5};
        int[] pa2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pa3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Student st1 = new Student(1, pa1);
        Student st2 = new Student(2, pa2);
        Student st3 = new Student(3, pa3);

        for (int i = 0; i < answers.length; i++) {
            st1.checkAnswer(answers[i], i);
            st2.checkAnswer(answers[i], i);
            st3.checkAnswer(answers[i], i);
        }

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.sort(Comparator.comparingInt(Student::getCorrectCnt).reversed().thenComparing(Student::getId));

        if (students.get(0).getCorrectCnt() == students.get(1).getCorrectCnt()) {
            if (students.get(0).getCorrectCnt() == students.get(2).getCorrectCnt()) {
                return new int[]{students.get(0).getId(), students.get(1).getId(), students.get(2).getId()};
            }
            return new int[]{students.get(0).getId(), students.get(1).getId()};
        }
        return new int[]{students.get(0).getId()};
    }
}

class Student {
    int id;
    int[] pattern;
    int length;
    int correctCnt = 0;

    Student(int id, int[] pattern) {
        this.id = id;
        this.pattern = pattern;
        this.length = pattern.length;
    }

    public void checkAnswer(int answer, int idx) {
        if (answer == pattern[idx % length]) {
            correctCnt++;
        }
    }

    public int getId() {
        return id;
    }

    public int getCorrectCnt() {
        return correctCnt;
    }
}
