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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int prev=0;
            if(level%2!=0) prev=Integer.MAX_VALUE;


            for(int i=0;i<size;i++){
                TreeNode cur=q.remove();
                int value=cur.val;
                if(level%2==0){
                    if(value<=prev || value%2==0) return false;
                }
                else{
                    if(value>=prev || value%2!=0) return false;
                }
                prev=value;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);

            }
            level++;



        }
        return true;
    }
}