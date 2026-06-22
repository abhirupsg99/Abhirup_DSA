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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        int level=0;
        while(!q.isEmpty())
        {
            int cs=q.size();
            level++;
            List<Integer> currLevel=new ArrayList<>();
            while(cs!=0)
            {
                TreeNode tmp=q.poll();
                currLevel.add(tmp.val);
                if(tmp.left!=null) q.offer(tmp.left);
                if(tmp.right!=null) q.offer(tmp.right);
                cs--;
            }
            if(level%2==0){
                Collections.reverse(currLevel);
            }
            ans.add(currLevel);
           
        }
        return ans;
        
    }
}