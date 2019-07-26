package algo.hashtable;

/**
 * @author Aayers-ghw
 * 使用线性探测法处理碰撞
 */
public class LinearProbingHashMap<K, V> {

    /**
     * 散列表中的键值对数目
     */
    private int num;
    private int capacity;
    private K[] keys;
    private V[] values;

    public LinearProbingHashMap(int capacity) {
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
        this.capacity = capacity;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public V get(K key) {
        int index = hash(key);
        while (keys[index] != null && !keys.equals(keys[index])) {
            index = (index + 1) % capacity;
        }
        //若给定key在散列表中存在会返回相应value，否则这里返回的是null
        return values[index];
    }

    public void put(K key, V value) {
        if (num >= capacity / 2) {
            resize(capacity * 2);
        }

        int index = hash(key);
        while (keys[index] != null && !keys.equals(keys[index])) {
            index = (index + 1) % capacity;
        }

        if (keys[index] == null) {
            keys[index] = key;
            values[index] = value;
            return;
        }

        values[index] = value;
        num++;

    }

    public void delete(K key) {

//		if(keys.contains(key)) {
//			
//		}
        int index = hash(key);
        while (!key.equals(keys[index])) {
            index = (index + 1) % capacity;
        }
        keys[index] = null;
        values[index] = null;
        index = (index + 1) % capacity;
        while (keys[index] != null) {
            K keyToRedo = keys[index];
            V valueToRedo = values[index];
            keys[index] = null;
            values[index] = null;
            num--;
            put(keyToRedo, valueToRedo);
            index = (index + 1) % capacity;
        }
        num--;
        if (num > 0 && num == capacity / 8) {
            resize(capacity / 8);
        }
    }

    public void resize(int newCapacity) {
        LinearProbingHashMap<K, V> hashmap = new LinearProbingHashMap<>(newCapacity);
        this.capacity = newCapacity;
        for (int i = 0; i < capacity; ++i) {
            if (keys[i] != null) {
                int index = hash(keys[i]);
                hashmap.put(keys[index], values[i]);
            }
        }
        keys = hashmap.keys;
        values = hashmap.values;
    }

}
