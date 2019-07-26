package algo.linkedlist;

import java.util.HashMap;

/**
 * 双链表 + hashMap实现
 *
 */
public class LRUCache {
	
	private int cacheSize;
	private HashMap nodes;	//缓存容器
	private int currentSize;
	private Entry first;	//链表头
	private Entry last;		//链表尾
	
	/**
	 * 链表节点
	 *
	 */
	class Entry{
		Entry prev;//前一节点  
	    Entry next;//后一节点  
	    Object value;//值  
	    Object key;//键
	}
	
	public LRUCache(int n) {
		this.currentSize = 0;
		this.cacheSize = n;
		nodes = new HashMap(n);		//缓存容器
	}
	
	/**
	 * 获取缓存中对象
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
	 * 添加缓存 
	 * @param key
	 * @param value
	 */
	public void put(Object key, Object value) {
		Entry node = (Entry) nodes.get(key);
		if(node == null) {
			//缓存容器是否已经超过大小
			if(currentSize >= cacheSize) {
				if(last != null) {
					//将最少使用的删除  
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
		//将最新使用的节点放到链表头，表示最新使用的.  
		moveToHead(node);
		nodes.put(key, node);
	}
	
	/** 
     * 将缓存删除 
     */  
    public void remove(Object key) {  
        Entry node = (Entry) nodes.get(key);  
        //在链表中删除  
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
        //在hashtable中删除  
        nodes.remove(key);  
    }  
  
    /** 
     * 删除链表尾部节点，即使用最后 使用的entry 
     */  
    private void removeLast() {  
        //链表尾不为空,则将链表尾指向null. 删除连表尾（删除最少使用的缓存对象）  
        if (last != null) {  
            if (last.prev != null)  
                last.prev.next = null;  
            else  
                first = null;  
            last = last.prev;  
        }  
    }  
	
	/**
	 * 移动到链表头，表示这个节点是最新使用过的 
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
	 * 清空缓存
	 */
	public void clear() {
		first = null;
		last = null;
		currentSize = 0;
	}
	
}
