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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode ele = queue.poll();
            TreeNode temp = ele.left;
            ele.left=ele.right;
            ele.right=temp;

            if(ele.left!=null){
                queue.add(ele.left);
            }
            if(ele.right!=null){
                queue.add(ele.right);
            }
        }
        return root;

        
    }
}
