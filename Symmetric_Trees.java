// 101. Symmetric Tree - https://leetcode.com/problems/symmetric-tree/
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean result;
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        result=true;
        helper(root.left,root.right);
        return result;
    }
    
    private void helper(TreeNode left, TreeNode right){
        // base
        if(left == null && right == null) return;
        if(left == null || right == null){
            result = false;
            return;
        }
        // logic
        if(left.val != right.val){
            result = false;
            return;
        }
        helper(left.left, right.right);
        helper(left.right, right.left);
    }
}