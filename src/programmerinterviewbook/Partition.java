package programmerinterviewbook;

import interviewtop.util.ListNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:56
 */
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null) {
            return null;
        }
        ListNode smallList = new ListNode(-1);
        ListNode bigList = new ListNode(-1);
        ListNode ps = smallList;
        ListNode pb = bigList;
        while (pHead != null) {
            if (pHead.val < x) {
                ps.next = pHead;
                ps = pHead;
            } else {
                pb.next = pHead;
                pb = pHead;
            }
            pHead = pHead.next;
        }
        pb.next = null;
        ps.next = bigList.next;
        return smallList.next;
    }
}
