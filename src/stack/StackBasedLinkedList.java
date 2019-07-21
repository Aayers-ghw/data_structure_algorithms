package stack;

/**
 * ��������ʵ�ֵ�ջ��
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
		
		//�ж��Ƿ��ǿ�ջ
		if(top == null) {
			top.next = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	//��-1��ʾջ��û������
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
