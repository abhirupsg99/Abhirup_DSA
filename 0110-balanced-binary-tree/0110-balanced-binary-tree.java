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
    public int height(TreeNode root,boolean[] valid)
    {
        if(root==null)
        {
            return 0;
        }
        int L=height(root.left,valid);
        int R=height(root.right,valid);
        if((L-R)>1||-1>(L-R)) valid[0] = false;
            return Math.max(L,R)+1;
    }
    public boolean isBalanced(TreeNode root) 
    {
        boolean valid[] ={true} ;
        height(root,valid);
        return valid[0];
    }
}