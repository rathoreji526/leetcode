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
    private int count = 0, i, ans = 0;

    private void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        count++;
        if(count==i){
            ans =  root.val;
            return;
        }
        helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        i = k;
        helper(root);
        return ans;
    }
}