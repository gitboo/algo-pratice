package leetcode.N003_MinimumAbsoluteDifferenceInBst;

/**
 * 승지니어 : https://youtu.be/KLX44z_NnYc
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 * <p>
 * 재귀 트리 순회
 * - preorder   : self left right
 * - inorder    : left self right -> 오른차순 정렬
 * - postorder  : left right self
 * 이진검색트리 성질 : inorder 순회를 하면 오른차순 정렬이 된다.
 */
public class MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);

        Solution s = new Solution();
        System.out.println(s.getMinimumDifference(root));
    }
}

class Solution {

    int min = Integer.MAX_VALUE;
    int prev;
    boolean init = true;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        if (init) {
            init = false;
        } else {
            min = Math.min(min, Math.abs(node.val - prev));
        }
        prev = node.val;
        inorder(node.right);
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



