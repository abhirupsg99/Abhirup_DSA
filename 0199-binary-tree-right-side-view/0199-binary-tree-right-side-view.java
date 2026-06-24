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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
          if (root == null) return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            ans.add(q.peek().val);
            while(n>0){
                TreeNode tmp=q.remove();
                if(tmp.right!=null)
                q.offer(tmp.right);
                if(tmp.left!=null)
                q.offer(tmp.left);
                n--;
            }
        }
        return ans;
        
    }
}