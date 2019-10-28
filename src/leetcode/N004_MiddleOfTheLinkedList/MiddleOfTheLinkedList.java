package leetcode.N004_MiddleOfTheLinkedList;

/**
 * 승지니어 : https://youtu.be/ucJ1XhM6EEU
 * https://leetcode.com/problems/middle-of-the-linked-list/description/
 *
 * 워커 러너 테크닉
 * walker : 한번에 한칸씩
 * runner : 한번에 두칸씩
 * runner 가 끝나면 walker 중간에 오게되서 중간 노드를 알 수 있다.
 *  1 2 3 4
 *  1 2 3 4
 *
 *  1 2 3 4 5
 *  1 2 3 4 5
 */
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);

        Solution s = new Solution();
        ListNode ret = s.middleNode(node1);
        System.out.println(ret.val);

    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while (runner != null) {
            runner = runner.next;
            if(runner != null){
                runner = runner.next;
                walker = walker.next;
            }
        }
        return walker;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}




