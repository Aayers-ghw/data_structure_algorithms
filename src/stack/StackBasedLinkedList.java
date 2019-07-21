package stack;

/**
 * 基于链表实现的栈。
 *
 */
public class StackBasedLinkedList {

	private Node top = null;

	public void printAll() {
		Node p = top;
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}
	
	public void push(int value) {
		Node newNode = new Node(value, null);
		
		//判断是否是空栈
		if(top == null) {
			top.next = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	//用-1表示栈中没有数据
	public int pop() {
		if(top == null) {
			return -1;
		}
		int value = top.getData();
		top = top.next;
		return value;
	}

	private static class Node {
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
