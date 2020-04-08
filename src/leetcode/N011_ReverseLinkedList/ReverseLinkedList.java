package leetcode.N011_ReverseLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);

        Solution s = new Solution();

        ListNode listNode = s.reverseList(node1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class Solution {

    ListNode reversNodeHead;
    ListNode reversNode;

    public ListNode reverseList(ListNode head) {

        traverse(head);

        return reversNodeHead;
    }

    public void traverse(ListNode node) {
        if (node == null) {
            return;
        }
        traverse(node.next);
        if (reversNode == null) {
            reversNode = new ListNode(node.val);
            reversNodeHead = reversNode;
            return;
        }
        reversNode.next = new ListNode(node.val);
        reversNode = reversNode.next;

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
