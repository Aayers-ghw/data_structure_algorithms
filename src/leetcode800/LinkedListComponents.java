package leetcode800;

import interviewtop.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aayers-ghw
 * @date 2019/8/27 9:20
 */
public class LinkedListComponents {

    public int numComponents(ListNode head, int[] G) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        while (head != null) {
            boolean flag = set.contains(head.val) && (head.next == null || !set.contains(head.next.val));
            if (flag) {
                res++;
            }
            head = head.next;
        }
        return res;
    }
}
