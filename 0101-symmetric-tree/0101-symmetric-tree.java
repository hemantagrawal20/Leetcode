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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return check(root.left,root.right);
    }
    public static boolean check(TreeNode lnode,TreeNode rnode){
        if(lnode==null && rnode==null){
            return true;
        }
        if(lnode==null || rnode==null){
            return false;
        }
        return lnode.val==rnode.val && check(lnode.left,rnode.right) && check(lnode.right,rnode.left);
    }
}