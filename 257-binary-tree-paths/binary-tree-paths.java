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
    public void btp(TreeNode root, ArrayList<String> arr, String s){
           if(root.left == null &&  root.right == null){
            s= s+root.val;
            arr.add(s );}
            s += root.val;
         if(root.left != null)   btp(root.left, arr, s +"->");
          if(root.right != null)  btp(root.right, arr, s +"->");

           
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String s = "";
        ArrayList<String> arr = new ArrayList<>();
        btp(root,arr,s);
        return arr;
    }
}