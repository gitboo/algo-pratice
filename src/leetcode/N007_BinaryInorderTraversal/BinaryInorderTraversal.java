package leetcode.N007_BinaryInorderTraversal;


import java.util.ArrayList;
import java.util.List;

/**
 * 승지니어 : https://youtu.be/PsR7gLsuGDw
 * https://leetcode.com/problems/binary-tree-inorder-traversal
 * <p>
 * 재귀 트리 순회
 * - preorder   : self left right
 * - inorder    : left self right -> 오른차순 정렬
 * - postorder  : left right self
 * 이진검색트리 성질 : inorder 순회를 하면 오른차순 정렬이 된다.
 */
public class BinaryInorderTraversal {
    public static void main(String[] args) {
    }
}

class Solution {

    List<Integer> ret;

    public List<Integer> inorderTraversal(TreeNode root) {
        ret = new ArrayList<>();
        traverse(root);
        return ret;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        ret.add(root.val);
        traverse(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
