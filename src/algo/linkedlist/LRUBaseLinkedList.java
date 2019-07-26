package algo.linkedlist;

import java.util.Scanner;

/**
 * ���ڵ�����LRU�㷨
 *
 */
public class LRUBaseLinkedList<T> {

	/**
	 * Ĭ����������
	 */
	private final static Integer DEFAULT_CAPACITY = 5;
	
	/**
	 * ͷ�ڵ�
	 */
	private SNode<T> headNode;
	
	/**
	 * ������
	 */
	private Integer length;
	
	/**
	 * ��������
	 */
	private Integer capacity;
	
	public LRUBaseLinkedList() {
		this.headNode = new SNode<>();
		this.capacity = DEFAULT_CAPACITY;
		this.length = 0;
	}
	
	public LRUBaseLinkedList(Integer capacity) {
		this.headNode = new SNode<>();
		this.capacity = capacity;
		this.length = 0;
	}
	
	public void add(T data) {
		SNode preNode = findPreNode(data);
		
		// �����д��ڣ�ɾ��ԭ���ݣ��ٲ��뵽�����ͷ��
		if(preNode != null) {
			deleteElemOptim(preNode);
			intsertElemAtBegin(data);
		}else {
			if(length >= this.capacity) {
				//ɾ��β�ڵ�
				deleteElemAtEnd();
			}
			intsertElemAtBegin(data);
		}
		
	}
	
	/**
	 * ɾ��preNode�����һ��Ԫ��
	 * @param preNode
	 */
	public void deleteElemOptim(SNode preNode) {
		SNode temp = preNode.getNext();
		preNode.setNext(temp.getNext());
		temp = null;
		length--;
	}
	
	/**
	 * ����ͷ������ڵ�
	 * @param data
	 */
	public void intsertElemAtBegin(T data) {
		SNode next = headNode.getNext();
		headNode.setNext(new SNode(data, next));
		length++;
	}
	
	/**
	 * ��ȡ���ҵ�Ԫ�ص�ǰһ�����
	 * @param data
	 * @return
	 */
	private SNode findPreNode(T data) {
		SNode node = headNode;
		while(node.getNext() != null) {
			if(data.equals(node.getNext().getElement())) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}
	
	/**
	 * ɾ��β�ڵ�
	 */
	public void deleteElemAtEnd() {
		SNode ptr = headNode;
		
		//������ֱ�ӷ���
		if(ptr.getNext() == null) {
			return;
		}
		
		//�����ڶ����ڵ�
		while(ptr.getNext().getNext() != null) {
			ptr = ptr.getNext();
		}
		
		SNode tmp = ptr.getNext();
		ptr.setNext(null);
		tmp = null;
		length--;
	}
	
	private void printAll() {
		SNode node = headNode.next;
		while(node != null) {
			System.out.print(node.getElement() + " ");
			node = node.getNext();
		}
		System.out.println();
	}
	
	public class SNode<T> {
		
		private T element;
		
		private SNode next;
		
		public SNode (T element) {
			this.element = element;
		}
		
		public SNode(T element, SNode next) {
			this.element = element;
			this.next = next;
		}
		
		public SNode() {
			this.next = null;
		}
		
		public T getElement() {
			return element;
		}
		
		public void setELemennt(T element) {
			this.element = element;
		}
		
		public SNode getNext() {
			return next;
		}
		
		public void setNext(SNode next) {
			this.next = next;
		}
		
	}
	
	public static void main(String[] args) {
        LRUBaseLinkedList list = new LRUBaseLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            list.add(sc.nextInt());
            list.printAll();
        }
    }
	
}
