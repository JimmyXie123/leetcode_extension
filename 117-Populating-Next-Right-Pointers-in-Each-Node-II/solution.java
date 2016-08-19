/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)  return;
        //TreeLinkNode first = null;
        root.next = null;
        while(root!=null){
            TreeLinkNode first = null;
            TreeLinkNode prev = root;
            boolean is_First_Left = false;
            while(prev!=null){
                if(prev.left==null&&prev.right==null){
                    prev = prev.next;
                }else if(prev.left!=null){
                    first = prev.left;
                    is_First_Left = true;
                    break;
                }else{
                    first = prev.right;
                    break;
                }
            }
            
            if(first==null) break;
            root = first;
            
            if(is_First_Left){
                if(prev.right!=null){
                    first.next = prev.right;
                    first = first.next;
                }
            }
            
            prev = prev.next;
            
            while(prev!=null){
                if(prev.left!=null){
                    first.next = prev.left;
                    first = first.next;
                }
                
                if(prev.right!=null){
                    first.next = prev.right;
                    first = first.next;
                }
                
                prev = prev.next;
            }
            first.next = null;
            
        }
    }
}