package programmerinterviewbook;

import interviewtop.util.ListNode;

import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 11:03
 */
public class Plus {

    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode node = new ListNode(-1);
        ListNode res = node;
        int tmp = 0;
        int sum = 0;
        while (a != null || b != null) {
            sum = tmp;
            if (a != null) {
                sum += a.val;
                a = a.next;
            }
            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            res.next = new ListNode(sum % 10);
            tmp = sum / 10;
            res = res.next;
        }
        if (tmp != 0) {
            res.next = new ListNode(1);
        }
        return node.next;
    }
}
