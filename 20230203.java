class Solution {
    TreeNode xNode;

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        find(root, x);
        int leftSize = getSubtreeSize(xNode.left);
        if (leftSize >= (n + 1) / 2) {
            return true;
        }
        int rightSize = getSubtreeSize(xNode.right);
        if (rightSize >= (n + 1) / 2) {
            return true;
        }
        int remain = n - 1 - leftSize - rightSize;
        return remain >= (n + 1) / 2;
    }

    public void find(TreeNode node, int x) {
        if (xNode != null || node == null) {
            return;
        }
        if (node.val == x) {
            xNode = node;
            return;
        }
        find(node.left, x);
        find(node.right, x);
    }

    public int getSubtreeSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSubtreeSize(node.left) + getSubtreeSize(node.right);
    }
}
