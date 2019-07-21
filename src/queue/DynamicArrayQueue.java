package queue;

public class DynamicArrayQueue {

	// ���飺items�������С��n
	private String[] items;
	private int n;

	// head��ʾ��ͷ�±꣬tail��ʾ��β�±�
	private int head = 0;
	private int tail = 0;

	// ����һ����СΪcapacity������
	public DynamicArrayQueue(int capacity) {
		items = new String[capacity];
		n = capacity;
	}

	// ���
	public boolean enqueue(String item) {
		// tail == n��ʾ����ĩβû�пռ���
		if (tail == n) {
			// tail ==n && head==0����ʾ�������ж�ռ����
			if(head == 0)	return false;
		    // ���ݰ���
			for(int i = head; i < tail; ++i) {
				items[i - head] = items[i];
			}
			// ������֮�����¸���head��tail
			tail = tail - head;
			head = 0;
		}
		
		items[tail] = item;
		tail++;
		return true;
	}

	// ����
	public String dequeue() {
		// ���head == tail ��ʾ����Ϊ��
		if (head == tail)	return null;
		String ret = items[head];
		head++;
		return ret;
	}

	// ��ӡ��������Ԫ��
	public void printAll() {
		while (head != tail) {
			System.out.println(items[head++]);
		}
	}
}
