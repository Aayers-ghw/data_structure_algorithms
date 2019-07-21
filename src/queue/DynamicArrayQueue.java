package queue;

public class DynamicArrayQueue {

	// 数组：items，数组大小：n
	private String[] items;
	private int n;

	// head表示队头下标，tail表示队尾下标
	private int head = 0;
	private int tail = 0;

	// 申请一个大小为capacity的数组
	public DynamicArrayQueue(int capacity) {
		items = new String[capacity];
		n = capacity;
	}

	// 入队
	public boolean enqueue(String item) {
		// tail == n表示队列末尾没有空间了
		if (tail == n) {
			// tail ==n && head==0，表示整个队列都占满了
			if(head == 0)	return false;
		    // 数据搬移
			for(int i = head; i < tail; ++i) {
				items[i - head] = items[i];
			}
			// 搬移完之后重新更新head和tail
			tail = tail - head;
			head = 0;
		}
		
		items[tail] = item;
		tail++;
		return true;
	}

	// 出队
	public String dequeue() {
		// 如果head == tail 表示队列为空
		if (head == tail)	return null;
		String ret = items[head];
		head++;
		return ret;
	}

	// 打印队列所有元素
	public void printAll() {
		while (head != tail) {
			System.out.println(items[head++]);
		}
	}
}
