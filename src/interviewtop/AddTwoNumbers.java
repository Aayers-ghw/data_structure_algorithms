package interviewtop;

import interviewtop.util.ListNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 10:45
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }
        ListNode res = new ListNode(0);
        ListNode pre = res;
        int temp = 0;
        while (l1 != null || l2 != null) {
            int sum = temp;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            temp = sum / 10;
            ListNode node = new ListNode(sum % 10);
            pre.next = node;
            pre = pre.next;
        }
        if (temp != 0) {
            pre.next = new ListNode(1);
        }
        return res.next;
    }
}
