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
 class Pair{
    TreeNode node;
    long idx;
    Pair(TreeNode node,long idx){
        this.node=node;
        this.idx=idx;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Deque<Pair> q=new ArrayDeque<>();
        q.offerFirst((new Pair(root,0)));
        long maxw=0;
        while(!q.isEmpty()){
            int n=q.size();
            long l=q.peekFirst().idx;
            long r=q.peekLast().idx;
            maxw=Math.max(maxw,r-l+1);
            for(int i=0;i<n;i++){
                Pair p=q.pollFirst();
                TreeNode curr=p.node;
                long j=p.idx;
                if(curr.left!=null){
                    q.offerLast(new Pair(curr.left,2*j+1));

                }
                if(curr.right!=null){
                    q.offerLast(new Pair(curr.right,2*j+2));

                }

            }
        }
        return (int) maxw;
    }
}