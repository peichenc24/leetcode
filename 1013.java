class Solution {
    public void deleteNode(ListNode node) {
     
        // Step 1: Set value of current node as value of next node
        node.val = node.next.val;
        
        // Step 2: Delete the next node from list
        node.next = node.next.next;
        
    }
}
