package algo.linkedlist;

/**
 * 1��������Ĳ��롢ɾ�������Ҳ�����
 * 2�������д洢����int���͵����ݣ�
 *
 */
public class SinglyLinkedList {

	private Node head = null;
	
	public Node findByVaule(int data) {
		Node p = head;
		while(p != null && p.getData() != data) {
			p = p.next;
		}
		
		return p;
	}
	
	public Node findByIndex(int index) {
		Node p = head;
		int pos = 0;
		while(p != null && pos != index) {
			p = p.next;
			pos++;
		}
		
		return p;
	}
	
	//��ͷ���
    //��ͷ������
    //���ֲ������������˳���෴������
	public void insertToHead(int value) {
		Node newNode = new Node(value, null);
		insertToHead(newNode);
	}
	
	public void insertToHead(Node newNode) {
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	 //˳�����
     //����β������
	public void insertTail(int value) {
		Node newNode = new Node(value, null);
		
		//���������Բ����½ڵ���Ϊhead��Ҳ���Բ�����
		if(head == null) {
			head = newNode;
		}else {
			Node q = head;
			while(q.next != null) {
				q = q.next;
			}
			newNode.next = q.next;
			q.next = newNode;
		}
	}
	
	public void insertAfter(Node p, int value) {
		Node newNode = new Node(value, null);
		insertAfter(p, newNode);
	}
	
	public void insertAfter(Node p, Node newNode) {
		if(p == null) return;
		newNode.next = p.next;
		p.next = newNode;
	}
	
	public void insertBefore(Node p, int value) {
		Node newNode = new Node(value, null);
		insertBefore(p, newNode);
	}
	
	public void insertBefore(Node p, Node newNode) {
		if(p == null)	return;
		if(head == p) {
			insertToHead(newNode);
			return;
		}
		
		Node q = head;
		while(q != null && q.next != p) {
			q = q.next;
		}
		
		if(q == null)	return;
		
		newNode.next = p;
		q.next = newNode;
	}
	
	public void deleteByNode(Node p) {
		
		if(p == null || head == null) return;
		
		if(p == head) {
			head = head.next;
			return;
		}
		
		Node q = head;
		while(q != null && q.next != p) {
			q = q.next;
		}
		
		if(q == null)	return;
		
		q.next = q.next.next;
	}
	
	public void deleteByValue(int value) {
		
		if(head == null)	return;
		
		Node p = head;
		Node q = null;
		while(p != null && p.getData() != value) {
			q = p;
			p = p.next;
		}
		
		if(p == null)	return;
		
		if(q == null) {
			head = head.next;
		}else {
			q.next = q.next.next;
		}
		
	}
	
	public void printAll() {
		Node p = head;
		while(p != null) {
			System.out.print(p.getData() + " ");
			p = p.next;
		}
		System.out.println();
	}
	
	//�ж�true or false
	public boolean TFResult(Node left, Node right) {
		Node l = left;
		Node r = right;
		
		System.out.println("left_:" + l.getData());
		System.out.println("right_:" + r.getData());
		while(r != null && l != null) {
			if(r.getData() == l.getData()) {
				r = r.next;
				l = l.next;
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("ʲô���");
		if(l == null && r == null) {
			return true;
		}else {
			return false;
		}
	}
	
	//���ж��Ƿ�Ϊ����
	public boolean palindrome() {
		if(head == null) {
			return false;
		}else {
			System.out.println("��ʼִ���ҵ��м�ڵ�");
			Node p = head;
			Node q = head;
			if(p.next == null) {
				System.out.println("ֻ��һ��Ԫ��");
				return true;
			}
			
			while(q.next != null && q.next.next != null) {
				p = p.next;
				q = q.next.next;
				
			}
			
			System.out.println("�м�ڵ�" + p.data);
	        System.out.println("��ʼִ�������ڵ�Ļ����ж�");
	        Node leftLink = null;
	        Node rightLink = null;
			if(q.next == null) {
				//��p һ��Ϊ����������е㣬�ҽڵ���ĿΪ����
				rightLink = p.next;
				leftLink = inverseLinkList(p).next;
				System.out.println("��ߵ�һ���ڵ�"+leftLink.data);
	            System.out.println("�ұߵ�һ���ڵ�"+rightLink.data);
			}else {
				//p q����Ϊ�е�
				rightLink = p.next;
				leftLink = inverseLinkList(p);
			}
			
			return TFResult(leftLink, rightLink);
		}
	}
	
	
	//��ͷ��������ת
	public Node inverseLinkList(Node p) {
		
		Node pre = null;
		Node r = head;
		System.out.println("z---" + r.data);
		Node next = null;
		while(r != p) {
			next = r.next;
			
			r.next = pre;
			pre = r;
			r = next;
		}
		
		r.next = pre;
		//��������벿�ֵ��е�֮ǰ���Ǹ��ڵ�
        //���Ӵ˴���ʼͬ�������߱Ƚ�
		return r;
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
	
	public static void main(String[] agrs) {
		 SinglyLinkedList link = new SinglyLinkedList(); 
	        System.out.println("hello");
	        //int data[] = {1};
	        //int data[] = {1,2};
	        //int data[] = {1,2,3,1};
	        //int data[] = {1,2,5};
	        //int data[] = {1,2,2,1};
	       // int data[] = {1,2,5,2,1};
	        int data[] = {1,2,5,3,1};

	        for(int i =0; i < data.length; i++){
//	            link.insertToHead(data[i]);
	            link.insertTail(data[i]);
	        }
	       // link.printAll();
	       // Node p = link.inverseLinkList_head(link.head);
	       // while(p != null){
	       //     System.out.println("aa"+p.data);
	       //     p = p.next;
	       // }

	        System.out.println("��ӡԭʼ:");
	        link.printAll();
	        if (link.palindrome()){
	            System.out.println("����");
	        }else{
	            System.out.println("���ǻ���");
	        }
	    }

}
