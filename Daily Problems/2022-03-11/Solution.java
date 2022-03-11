/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
			return head;
		}
		// will hold last node of linked list
		ListNode lastNode = head;
		// find length of linked list
		int n = 1;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			n++;
		}
		// mod with length to make k in range
		k = n - (k % n);
		// move prev pointer k-1 times.
		ListNode prev = head;
		for (int i = 1; i < k; i++) {
			prev = prev.next;
		}
		lastNode.next = head;
		head = prev.next;
		prev.next = null;
		return head;
    }
}