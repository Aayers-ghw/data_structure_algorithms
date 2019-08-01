package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 19:34
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        }
        int count = 1;
        ListNode tempNode = slow;
        slow = slow.next;
        while (slow != tempNode) {
            count++;
            slow = slow.next;
        }

        ListNode p1 = head;
        for (int i = 0; i < count; ++i) {
            p1 = p1.next;
        }
        ListNode p2 = head;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
