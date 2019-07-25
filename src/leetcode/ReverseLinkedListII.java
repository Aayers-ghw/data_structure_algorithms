package leetcode;

/**
 * Reverse a linked list from position m to n. Do it in one-pass.
 *
 * @author Aayers-ghw
 * @date 2019/7/25 14:15
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;
        for (int i = 0; i < m - 1; ++i) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        for (int i = m; i < n; ++i) {
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            tmp.next = pre.next;
            pre.next = tmp;
        }
        return res.next;
    }
}
