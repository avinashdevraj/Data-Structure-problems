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
    public int findBottomLeftValue(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        int last=0;
        q.add(root);
        while(q.size()>0){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode cur=q.remove();
                if(i==0) last=cur.val;
                //System.out.print(i+"-"+last+"^");
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
        }
        return last;

    }

}