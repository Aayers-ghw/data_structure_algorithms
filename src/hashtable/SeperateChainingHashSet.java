package hashtable;

/**
 * @author Aayers-ghw
 * ʹ��������������ײ
 */
public class SeperateChainingHashSet<K, V> {

    /**
     * ��ǰɢ�б��еļ�ֵ������
     */
    private int num;
    /**
     * ɢ�б�Ĵ�С
     */
    private int capacity;
    /**
     * �����������
     */
    private SeqSearchST<K, V>[] st;

    public SeperateChainingHashSet(int initialCapacity) {
        this.capacity = initialCapacity;
        this.st = (SeqSearchST<K, V>[]) new Object[capacity];
        for (int i = 0; i < capacity; ++i) {
            st[i] = new SeqSearchST<>();
        }
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public V get(K key) {
        return st[hash(key)].get(key);
    }

    public void put(K key, V value) {
        st[hash(key)].put(key, value);
    }

    public void remove(K key) {
        st[hash(key)].remove(key);
    }


    public class SeqSearchST<K, V> {
        private Node first;

        private class Node {
            K key;
            V value;
            Node next;

            public Node(K key, V value, Node next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }

        public V get(K key) {
            for (Node node = first; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            return null;
        }

        public void put(K key, V value) {
            //�Ȳ��ұ����Ƿ��Ѵ�����Ӧ��key
            Node node;
            for (node = first; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
            }
            first = new Node(key, value, first);
        }

        public void remove(K key) {
            if (first == null) {
                return;
            }
            if (first.key.equals(key)) {
                first = first.next;
                return;
            }
            Node node;
            Node pre;
            for (node = first.next, pre = first; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    pre.next = node.next;
                    break;
                }
                pre = node;
            }
        }
    }

}

