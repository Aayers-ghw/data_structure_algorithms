package leetcodetop100;

import leetcodetop100.util.Node;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 10:20
 */
public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node ite = head;
        while (ite != null) {
            Node node = new Node();
            node.val = ite.val;
            node.next = ite.next;
            ite.next = node;
            ite = node.next;
        }
        ite = head;
        while (ite != null) {
            if (ite.random != null) {
                ite.next.random = ite.random.next;
            }
            ite = ite.next.next;
        }
        ite = head;
        Node res = new Node();
        Node pre = res;
        while (ite != null) {
            pre.next = ite.next;
            pre = pre.next;

            ite.next = pre.next;
            ite = ite.next;
        }
        return res.next;
    }
}
