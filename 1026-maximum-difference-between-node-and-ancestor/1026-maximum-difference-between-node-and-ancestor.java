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
    private int findMaxDiff(TreeNode root,int minv,int maxv){
        if(root==null)
        return Math.abs(minv-maxv);
        minv=Math.min(minv,root.val);
        maxv=Math.max(maxv,root.val);
        int l=findMaxDiff(root.left,minv,maxv);
        int r=findMaxDiff(root.right,minv,maxv);
        return Math.max(l,r);


    }
    public int maxAncestorDiff(TreeNode root) {
           return findMaxDiff(root,root.val,root.val);

        
    }
}