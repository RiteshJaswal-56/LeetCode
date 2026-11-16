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
    public void fun(TreeNode root , String path , List<String> ans){
        if(root == null) return;
        path += root.val;
        if(root.left == null && root.right == null){
            ans.add(path);
            return;
        }
        path += "->";
        fun(root.left , path , ans);
        fun(root.right , path , ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        fun(root , "", ans);
        return ans;
    }
}