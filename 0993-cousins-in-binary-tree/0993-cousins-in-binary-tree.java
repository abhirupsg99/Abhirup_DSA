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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean fx=false;
            boolean fy=false;
            for(int i=0;i< size;i++)
            { TreeNode tmp=q.poll();
            if(tmp.val==x) fx=true;
            if(tmp.val==y) fy=true;
            if(tmp.left!=null && tmp.right!=null){
                if((tmp.left.val==x && tmp.right.val==y)|| (tmp.left.val==y && tmp.right.val==x)){
                    return false;
                }
            }
            if(tmp.left!=null) q.offer(tmp.left);
            if(tmp.right!=null) q.offer(tmp.right);
            }
            if(fx && fy) return true;
            if(fx || fy) return false;
        }
        return false;

    }
}