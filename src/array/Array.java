package array;

/**
 * 1)����Ĳ��롢ɾ��������С��������ʲ���;
 * 2)�����е�������int���͵�;
 *
 */
public class Array {

	//������������data��������
	public int data[];
	//�������鳤��
	private int n;
	//����ʵ����������Ԫ�صĸ���
	private int count;

	//���췽�������������С
	public Array(int capacity) {
		this.data = new int[capacity];
		this.n = capacity;
		this.count = 0;		//һ��ʼһ������û�д�����Ϊ0
	}
	
	//�����������ҵ������е�Ԫ�ز�����
	public int find(int index) {
		if(index < 0 || index >= count) {
			return -1;
		}
		return data[index];
	}
	
	//����Ԫ��:ͷ�����룬β������
	public boolean insert(int index, int value) {
		//����ռ�����
		if(count == n) {
			System.out.println("û�пɲ���λ��");
			return false;
		}
		
		// ���count��û������ô�Ϳ��Բ������ݵ�������
        // λ�ò��Ϸ�
		if(index < 0 || index > count) {
			System.out.println("����λ�ò��Ϸ�");
			return false;
		}
		//λ�úϷ�
		for(int i = count; i > index; --i) {
			data[i] = data[i - 1];
		}
		data[index] = value;
		count++;
		return true;
	}
	
	//����������ɾ��������Ԫ��
	public boolean delete(int index) {
		if(index < 0 || index >= count)	return false;
		//��ɾ��λ�ÿ�ʼ���������Ԫ����ǰ�ƶ�һλ
		for(int i = index; i < count - 1; i++) {
			data[i] = data[i + 1];
		}
		
		--count;
		return true;
	}
	
	//��ӡ����������Ԫ��
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
