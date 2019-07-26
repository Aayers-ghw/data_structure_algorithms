package algo.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * * ��������ʵ�ֵ�LRU����
 * 1. �ռ临�Ӷ�ΪO(n)
 * 2. ʱ�临�Ӷ�ΪO(n)
 * 3. ��֧��null�Ļ���
 *
 */
public class LRUBasedArray<T> {

	 private static final int DEFAULT_CAPACITY = (1 << 3);

	    private int capacity;

	    private int count;

	    private T[] value;

	    private Map<T, Integer> holder;

	    public LRUBasedArray() {
	        this(DEFAULT_CAPACITY);
	    }

	    public LRUBasedArray(int capacity) {
	        this.capacity = capacity;
	        value = (T[]) new Object[capacity];
	        count = 0;
	        holder = new HashMap<T, Integer>(capacity);
	    }

	    /**
	     * ģ�����ĳ��ֵ
	     * @param object
	     */
	    public void offer(T object) {
	    	if(object == null) {
	    		throw new IllegalArgumentException("�û���������֧��null!");
	    	}
	    	Integer index = holder.get(object);
	    	if(index == null) {
	    		if(isFull()) {
	    			removeAndCache(object);
	    		}else {
	    			cache(object, count);
	    		}
	    	}else {
	    		update(index);
	    	}
	    	
	    }
	    
	    /**
	     * ����������ָ����ֵ�������λ��
	     * @param end
	     */
	    public void update(int end) {
	    	T target = value[end];
	    	rightShift(end);
	    	value[0] = target;
	    	holder.put(target, 0);
	    }
	    
	    /**
	     * �������ݵ�ͷ������Ҫ������
	     * @param object
	     * @param end �������Ƶı߽�
	     */
	    public void cache(T object, int end) {
	    	rightShift(end);
	    	value[0] = object;
	    	holder.put(object, 0);
	    	count++;
	    }
	    
	    /**
	     * ��������������߳����ٻ��浽����ͷ��
	     * @param object
	     */
	    public void removeAndCache(T object) {
	    	value[--count] = null;
	    	cache(object, count);
	    }
	    
	    /**
	     * end��ߵ�����ͳһ����һλ
	     * @param object
	     * @return
	     */
	    public void rightShift(int end) {
	    	for(int i = end - 1; i >= 0; --i) {
	    		value[i + 1] = value[i];
	    		holder.put(value[i], i + 1);
	    	}
	    }
	    
	    public boolean isContain(T object) {
	    	return holder.containsKey(object);
	    }
	    
	    public boolean isEmpty() {
	    	return count == 0;
	    }
	    
	    public boolean isFull() {
	    	return count == capacity;
	    }
	    
	    @Override
	    public String toString() {
	    	StringBuilder sb = new StringBuilder();
	    	for(int i = 0; i < count; ++i) {
	    		sb.append(value[i]);
	    		sb.append(" ");
	    	}
	    	return sb.toString();
	    }
	    
	    static class TestLRUBasedArray {
	    	
	    	public static void main(String[] agrs) {
	    		testDefaultConstructor();
	            testSpecifiedConstructor(4);
//	            testWithException();
	    	}
	    	
	    	private static void testWithException() {
	            LRUBasedArray<Integer> lru = new LRUBasedArray<Integer>();
	            lru.offer(null);
	        }

	        public static void testDefaultConstructor() {
	            System.out.println("======�޲β���========");
	            LRUBasedArray<Integer> lru = new LRUBasedArray<Integer>();
	            lru.offer(1);
	            lru.offer(2);
	            lru.offer(3);
	            lru.offer(4);
	            lru.offer(5);
	            System.out.println(lru);
	            lru.offer(6);
	            lru.offer(7);
	            lru.offer(8);
	            lru.offer(9);
	            System.out.println(lru);
	        }

	        public static void testSpecifiedConstructor(int capacity) {
	            System.out.println("======�вβ���========");
	            LRUBasedArray<Integer> lru = new LRUBasedArray<Integer>(capacity);
	            lru.offer(1);
	            System.out.println(lru);
	            lru.offer(2);
	            System.out.println(lru);
	            lru.offer(3);
	            System.out.println(lru);
	            lru.offer(4);
	            System.out.println(lru);
	            lru.offer(2);
	            System.out.println(lru);
	            lru.offer(4);
	            System.out.println(lru);
	            lru.offer(7);
	            System.out.println(lru);
	            lru.offer(1);
	            System.out.println(lru);
	            lru.offer(2);
	            System.out.println(lru);
	        }
	    }
	    
}
