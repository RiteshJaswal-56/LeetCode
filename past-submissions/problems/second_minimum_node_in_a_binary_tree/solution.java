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
    long secondmin = Long.MAX_VALUE;
    int min;
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        if(min == 0) {
            min = root.val;
        } 
        if(root.val > min && root.val < secondmin){
            secondmin = root.val;
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);

        if(secondmin == Long.MAX_VALUE){
            return -1;
        }

        return (int) secondmin;
    }
}