class Solution {
    TreeNode prev = null,first=null,second=null;
   
   public void recoverTree(TreeNode root) {
       helper(root);
       swap(first,second);
       return ;
   }
   void swap(TreeNode a,TreeNode b)
   {
       int temp = a.val;
       a.val = b.val;
       b.val = temp;
   }
     void helper(TreeNode root)
   {
       if(root == null)
           return ;
       helper(root.left);
       
       if(prev!=null &&  prev.val > root.val)
       {
           if(first == null)
           {
               first = prev;
           }
           second = root;
       }
        
       prev = root;
       helper(root.right);
   }
   
 
}