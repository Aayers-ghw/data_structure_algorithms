package programmerinterviewbook;

import interviewtop.util.ListNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 11:17
 */
public class Palindrome {

    /**
     * 请编写一个函数，检查链表是否为回文。
     * <p>
     * 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
     *
     * @param pHead
     * @return
     */
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if (pHead == null) {
            return false;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        fast = pHead;
        slow = reverse(slow);
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode pHead) {
        ListNode pre = null;
        while (pHead != null) {
            ListNode tmp = pHead.next;
            pHead.next = pre;
            pre = pHead;
            pHead = tmp;
        }
        return pre;
    }
}
