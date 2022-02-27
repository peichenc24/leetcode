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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0)); // node + index in the layer
        int maxWidth = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            Integer leftIDx = null, rightIDx = null;
            
            while(size --> 0) {
                Pair<TreeNode, Integer> el = q.poll();
                if (leftIDx == null) leftIDx = el.getValue();
                rightIDx = el.getValue();
                
                if (el.getKey().left != null) 
                    q.add(new Pair<>(el.getKey().left, el.getValue() * 2));
                if (el.getKey().right != null) 
                    q.add(new Pair<>(el.getKey().right, el.getValue() * 2 + 1));
            }
            
            maxWidth = Math.max(maxWidth, rightIDx - leftIDx + 1);
        }
        return maxWidth;
    }
}