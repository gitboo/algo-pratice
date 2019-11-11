package leetcode.N008_LinkedListCycle;

import java.util.HashSet;
import java.util.Set;


/**
 * 위클리 알고리즘 : https://youtu.be/MCUsPSJ_cwk
 * https://leetcode.com/problems/linked-list-cycle/
 *
 *  아래와 같이 자료구조를 새로 만들어 하면 쉽게 풀수가 있다. 자료 구조 없이 주어진 리스트로 풀수 있는지 알아봐야 한다!
 */
public class LinkedListCycle {
    public static void main(String[] args) {
    }
}



class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }else{
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}



