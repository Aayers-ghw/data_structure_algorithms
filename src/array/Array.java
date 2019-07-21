package array;

/**
 * 1)数组的插入、删除、按照小标随机访问操作;
 * 2)数组中的数据是int类型的;
 *
 */
public class Array {

	//定义整数数据data保存数据
	public int data[];
	//定义数组长度
	private int n;
	//定义实际中数组中元素的个数
	private int count;

	//构造方法，定义数组大小
	public Array(int capacity) {
		this.data = new int[capacity];
		this.n = capacity;
		this.count = 0;		//一开始一个数都没有存所以为0
	}
	
	//根据索引，找到数据中的元素并返回
	public int find(int index) {
		if(index < 0 || index >= count) {
			return -1;
		}
		return data[index];
	}
	
	//插入元素:头部插入，尾部插入
	public boolean insert(int index, int value) {
		//数组空间已满
		if(count == n) {
			System.out.println("没有可插入位置");
			return false;
		}
		
		// 如果count还没满，那么就可以插入数据到数组中
        // 位置不合法
		if(index < 0 || index > count) {
			System.out.println("插入位置不合法");
			return false;
		}
		//位置合法
		for(int i = count; i > index; --i) {
			data[i] = data[i - 1];
		}
		data[index] = value;
		count++;
		return true;
	}
	
	//根据索引，删除数组中元素
	public boolean delete(int index) {
		if(index < 0 || index >= count)	return false;
		//从删除位置开始，将后面的元素向前移动一位
		for(int i = index; i < count - 1; i++) {
			data[i] = data[i + 1];
		}
		
		--count;
		return true;
	}
	
	//打印数组中所有元素
	public void printAll() {
		for(int i = 0; i < count; ++i) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] agrs) {
		Array test = new Array(5);
		test.printAll();
		test.insert(0, 3);
		test.insert(0, 4);
		test.insert(1, 5);
		test.insert(3, 9);
		test.insert(3, 10);
		test.printAll();
	}
	
	
	
	
	
	
	
	
	
	
}
