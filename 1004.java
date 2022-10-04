class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkNreturn(root, targetSum);
    }
    
    private boolean checkNreturn(TreeNode root, int target) {
        if(root == null) return false;
        if(root.left == null && root.right == null && target - root.val == 0) return true;
        return  checkNreturn(root.left, target-root.val) || checkNreturn(root.right, target-root.val);
    }
}
