class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // 模拟指针，用来遍历链表
        ListNode cur = head;
        // 用来定位正数第k个节点
        ListNode first = head;
        // 用来定位倒数第k个节点
        ListNode last = head;
        // 用于节点的计数，和节点值的交换
        int count = 1;
        while (cur.next != null) {
            // 找到正数第k个节点
            if (count < k) {
                first = first.next;
            // 找到倒数第k个节点
            } else {
                last = last.next;
            }
            count++;
            cur = cur.next;
        }
        // 交换正数第k个节点和倒数第k个节点的值
        count = first.val;
        first.val = last.val;
        last.val = count;
        return head;
    }
}