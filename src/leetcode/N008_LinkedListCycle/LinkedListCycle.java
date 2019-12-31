package leetcode.N008_LinkedListCycle;

import java.util.HashSet;
import java.util.Set;


/**
 * 위클리 알고리즘 : https://youtu.be/MCUsPSJ_cwk
 * https://leetcode.com/problems/linked-list-cycle/
 *
 * 아래와 같이 자료구조를 새로 만들어 하면 쉽게 풀수가 있다.
 * 하지만 추가적인 자료구조가 필요하기 때문에 비효율 적이다.
 * 그래서 워커/러너 전략을 사용한다.
 * 러너는 두칸씩 이동하고 워커는 한칸씩 이동 하는데 워커가 마지막 노드에 도달하기 전에 워커와 러너 노드는 만나게 된다.
 */
public class LinkedListCycle {
    public static void main(String[] args) {
    }
}

// 워커 러너를 이용해서
class Solution2 {
    public ListNode hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;

        while (walker != null) {
            if (walker.next == null || runner.next == null) {
                return null;
            }
            if (runner.next.next == null) {
                return null;
            }
            walker = walker.next;
            runner = runner.next.next;

            if (walker == runner) {
                return walker;
            }
        }
        return null;
    }
}


// 자료구조 이용해서
class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
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



