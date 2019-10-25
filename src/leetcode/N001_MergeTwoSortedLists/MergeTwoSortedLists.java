package leetcode.N001_MergeTwoSortedLists;

import java.util.Objects;


/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.mergeTwoLists(new ListNode(1), new ListNode((2)));
    }
}
class Solution {

    private ListNode root;
    private ListNode curr;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        while (Objects.nonNull(l1) || Objects.nonNull(l2)) {

            // l1 만 있는 경우
            if (Objects.nonNull(l1) && Objects.isNull(l2)) {
                addNode(l1);
                l1 = l1.next;
            }
            // l2 만 있는 경우
            else if (Objects.isNull(l1)) {
                addNode(l2);
                l2 = l2.next;
            }
            else {
                // l1 이 작은 경우
                if (l1.val <= l2.val) {
                    addNode(l1);
                    l1 = l1.next;
                } else {
                    // l2 가 작은 경우
                    addNode(l2);
                    l2 = l2.next;
                }
            }
        }
        return root;
    }

    /**
     * 링크드 리스트 할 때 어떻게 노드를 추가 하는지 이해 하자!
     */
    private void addNode(ListNode target) {
        if (root == null) {
            root = target;
            curr = root;
            return;
        }
        curr.next = target;
        curr = target;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
