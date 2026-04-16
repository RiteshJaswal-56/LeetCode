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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levelNum = 0;

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left!=null){
                    q.add(node.left);
                    }
                if(node.right!=null) {
                    q.add(node.right);
                }
            }
            if(levelNum % 2 == 1){
                Collections.reverse(level);
            }
            result.add(level);
            levelNum++;
        }
        return result;
    }
}