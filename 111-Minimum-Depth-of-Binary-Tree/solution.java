/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(Math.min(minDepth(root.left), minDepth(root.right))>0){
            return Math.min(minDepth(root.left), minDepth(root.right))+1;
        }else{
            return Math.max(minDepth(root.left), minDepth(root.right))+1;
        }
    }
    
    
}