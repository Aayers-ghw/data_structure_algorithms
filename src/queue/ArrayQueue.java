package queue;

/**
 * 用数组实现的队列
 *
 */
public class ArrayQueue {
	// 数组：items，数组大小：n
	private String[] items;
	private int n;
	
	// head表示队头下标，tail表示队尾下标
	private int head = 0;
	private int tail = 0;
	
	// 申请一个大小为capacity的数组
	public ArrayQueue(int capacity) {
		items = new String[capacity];
		n = capacity;
	}
	
	//入队
	public boolean enqueue(String item) {
		// 如果tail == n 表示队列已经满了
		if(tail == n)	return false;
		items[tail] = item;
		tail++;
		return true;
	}
	
	//出队
	public String dequeue() {
		// 如果head == tail 表示队列为空
		if(head == tail)	return null;
		String ret = items[head];
		head++;
		return ret;
	}
	
	//打印队列所有元素
	public void printAll() {
		while(head != tail) {
			System.out.println(items[head++]);
		}
	}
	
}
