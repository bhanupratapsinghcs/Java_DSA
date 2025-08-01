package org.javaDSA.leetCode.BFS;

public class DeepestLeavesSum {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int x) {
            val = x;
        }
        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        System.out.println("Deepest leaves sum: " + deepestLeavesSum(root)); // Output: 15
    }

    private static int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        int level = findDeepestLevel(root);
        System.out.println("Deepest level: " + level);
        return deepestLeavesSumHelper(root, level);
    }

    private static int findDeepestLevel(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftLevel = findDeepestLevel(root.left);
        int rightLevel = findDeepestLevel(root.right);
        return Math.max(leftLevel,rightLevel) + 1;
    }

    private static int deepestLeavesSumHelper(TreeNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1){
            return root.val;
        }else{
            return deepestLeavesSumHelper(root.left, level - 1) + deepestLeavesSumHelper(root.right, level - 1);
        }
    }

    private static int leavesSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.val;
        }
        return sum +  leavesSum(root.left, sum) + leavesSum(root.right,sum);
    }
}
