package interview.wangyi.huyu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/20 16:58
 */
public class Solution02 {

    /**
     * 单链表定义如下：
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void removeDuplicates(ListNode head) {
        // 在这里编写代码
        if (head == null || head.next == null) {
            return;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.next != null) {
            if (cur.val == pre.val && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }

            }
            pre.next = cur;
            pre = pre.next;
            cur = cur.next;
        }
    }
}
