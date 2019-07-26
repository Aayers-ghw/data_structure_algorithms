package algo.linkedlist;

/**
 * 1) 单链表反转 
 * 2) 链表中环的检测 
 * 3) 两个有序的链表合并 
 * 4) 删除链表倒数第n个结点
 * 5) 求链表的中间结点
 *
 */
public class LinkedListAlgo {

	// 单链表反转
	public Node reverse(Node list) {
		Node headNode = null;
		
		Node previousNode = null;
	    while(list != null) {
	    	Node nextNode = list.next;
	    	if(nextNode == null) {
	    		headNode = list;
	    	}
	    	list.next = previousNode;
	    	previousNode = list;
	    	list = nextNode;
	    }
	    return headNode;
	}

	//检测环
	public boolean checkCircle(Node list) {
		if(list == null)	return false;
		
		Node fast = list;
		Node slow = list;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	//有序链表合并
	public static Node mergeSortedLists(Node la, Node lb) {
		if(la == null)	return lb;
		if(lb == null)	return la;
		
		Node p = la;
		Node q = lb;
		Node head;
		if(p.getData() > q.getData()) {
			head = q;
			q = q.next;
		}else {
			head = p;
			p = p.next;
		}
		Node r = head;
		
		while(p != null && q != null) {
			if(p.getData() > q.getData()) {
				r.next = q;
				q = q.next;
			}else {
				r.next = p;
				p = p.next;
			}
			r = r.next;
		}
		
		if(p != null) {
			r.next = p;
		}
		if(q != null) {
			r.next = q;
		}
		return head;
	}
	
	// 删除倒数第K个结点
	public static Node deleteLastKth(Node list, int k) {
		Node fast = list;
		int i = 1;
		while(fast != null && i < k) {
			fast = fast.next;
			i++;
		}
		if(fast == null)	return list;
		
		Node slow = list;
		Node prev = null;
		while(fast != null) {
			fast = fast.next;
			prev = slow;
			slow = slow.next;
		}
		if(prev == null) {
			list = list.next;
		}else {
			prev.next = prev.next.next;
		}
		return list;
	}
	
	// 求中间结点
	public Node findMiddleNode(Node list) {
		if(list == null)	return null;
		
		Node fast = list;
		Node slow = list;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public void printAll(Node list) {
		Node p = list;
		while(p != null) {
			System.out.print(p.getData() + "");
			p = p.next;
		}
		System.out.println();
	}
	
	
	
	public static Node createNode(int value) {
		return new Node(value, null);
	}

	public static class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public int getData() {
			return data;
		}
	}
}
