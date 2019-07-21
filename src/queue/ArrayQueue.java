package queue;

/**
 * ������ʵ�ֵĶ���
 *
 */
public class ArrayQueue {
	// ���飺items�������С��n
	private String[] items;
	private int n;
	
	// head��ʾ��ͷ�±꣬tail��ʾ��β�±�
	private int head = 0;
	private int tail = 0;
	
	// ����һ����СΪcapacity������
	public ArrayQueue(int capacity) {
		items = new String[capacity];
		n = capacity;
	}
	
	//���
	public boolean enqueue(String item) {
		// ���tail == n ��ʾ�����Ѿ�����
		if(tail == n)	return false;
		items[tail] = item;
		tail++;
		return true;
	}
	
	//����
	public String dequeue() {
		// ���head == tail ��ʾ����Ϊ��
		if(head == tail)	return null;
		String ret = items[head];
		head++;
		return ret;
	}
	
	//��ӡ��������Ԫ��
	public void printAll() {
		while(head != tail) {
			System.out.println(items[head++]);
		}
	}
	
}
