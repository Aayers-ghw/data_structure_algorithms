package programmerinterviewbook;

import interviewtop.util.ListNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:38
 */
public class Remove {

    public boolean removeNode(ListNode pNode) {
        // write code here
        if (pNode == null) {
            return false;
        }
        ListNode nextNode = pNode.next;
        if (nextNode == null) {
            return false;
        }
        pNode.val = nextNode.val;
        pNode.next = nextNode.next;
        return true;
    }
}
