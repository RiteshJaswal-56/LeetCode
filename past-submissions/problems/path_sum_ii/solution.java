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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(root , result , targetSum , new ArrayList<>());
        return result;
    }
    private void backtrack(TreeNode root , List<List<Integer>> result , int targetSum , List<Integer> temp){
        if(root == null) return;

        temp.add(root.val);

        if(root.left==null && root.right==null && targetSum == root.val){
            result.add(new ArrayList<>(temp));
        }
        
        backtrack(root.left , result , targetSum - root.val , temp);
        backtrack(root.right , result , targetSum - root.val , temp);
        temp.remove(temp.size() - 1);
    }
}