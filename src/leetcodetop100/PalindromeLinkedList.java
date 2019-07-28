package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 16:47
 */
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode first = head;
        ListNode last = reverse(slow);
        while (last != null && first != null) {
            if (first.val != last.val) {
                return false;
            }
            first = first.next;
            last = last.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode root) {
        ListNode node = null;
        while (root != null) {
            ListNode tmp = root.next;
            root.next = node;
            node = root;
            root = tmp;
        }
        return node;
    }
}
