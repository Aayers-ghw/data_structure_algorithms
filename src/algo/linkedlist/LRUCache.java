package algo.linkedlist;

import java.util.HashMap;

/**
 * ˫���� + hashMapʵ��
 *
 */
public class LRUCache {
	
	private int cacheSize;
	private HashMap nodes;	//��������
	private int currentSize;
	private Entry first;	//����ͷ
	private Entry last;		//����β
	
	/**
	 * ����ڵ�
	 *
	 */
	class Entry{
		Entry prev;//ǰһ�ڵ�  
	    Entry next;//��һ�ڵ�  
	    Object value;//ֵ  
	    Object key;//��
	}
	
	public LRUCache(int n) {
		this.currentSize = 0;
		this.cacheSize = n;
		nodes = new HashMap(n);		//��������
	}
	
	/**
	 * ��ȡ�����ж���
	 * @param key
	 * @return
	 */
	public Object get(Object key) {
		Entry node = (Entry) nodes.get(key);
		if(node != null) {
			moveToHead(node);
			return node.value;
		}else {
			return null;
		}
	}
	
	/**
	 * ��ӻ��� 
	 * @param key
	 * @param value
	 */
	public void put(Object key, Object value) {
		Entry node = (Entry) nodes.get(key);
		if(node == null) {
			//���������Ƿ��Ѿ�������С
			if(currentSize >= cacheSize) {
				if(last != null) {
					//������ʹ�õ�ɾ��  
					nodes.remove(last.key);		
				}
				removeLast();
			}else {
				currentSize++;
			}
			node = new Entry();
		}
		node.value = value;
		node.key = key;
		//������ʹ�õĽڵ�ŵ�����ͷ����ʾ����ʹ�õ�.  
		moveToHead(node);
		nodes.put(key, node);
	}
	
	/** 
     * ������ɾ�� 
     */  
    public void remove(Object key) {  
        Entry node = (Entry) nodes.get(key);  
        //��������ɾ��  
        if (node != null) {  
            if (node.prev != null) {  
                node.prev.next = node.next;  
            }  
            if (node.next != null) {  
                node.next.prev = node.prev;  
            }  
            if (last == node)  
                last = node.prev;  
            if (first == node)  
                first = node.next;  
        }  
        //��hashtable��ɾ��  
        nodes.remove(key);  
    }  
  
    /** 
     * ɾ������β���ڵ㣬��ʹ����� ʹ�õ�entry 
     */  
    private void removeLast() {  
        //����β��Ϊ��,������βָ��null. ɾ������β��ɾ������ʹ�õĻ������  
        if (last != null) {  
            if (last.prev != null)  
                last.prev.next = null;  
            else  
                first = null;  
            last = last.prev;  
        }  
    }  
	
	/**
	 * �ƶ�������ͷ����ʾ����ڵ�������ʹ�ù��� 
	 */
	public void moveToHead(Entry node) {
		if(node == first) {
			return;
		}
		if(node.prev != null) {
			node.prev.next = node.next;
		}
		if(node.next != null) {
			node.next.prev = node.prev;
		}
		if(last == node) {
			last = node.prev;
		}
		if(first != null) {
			node.next = first;
			first.prev = node;
		}
		first = node;
		node.prev = null;
		if(last == null) {
			last = first;
		}
	}
	
	/**
	 * ��ջ���
	 */
	public void clear() {
		first = null;
		last = null;
		currentSize = 0;
	}
	
}
