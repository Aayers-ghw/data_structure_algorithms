package array;

/**
 * @author Aayers-ghw
 */
public class GenericArray<T> {

    private T[] data;
    private int size;

    /**
     * ���ݴ�������������Array
     *
     * @param capacity
     */
    public GenericArray(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    /**
     * �޲ι��췽����Ĭ����������Ϊ10
     */
    public GenericArray() {
        this(10);
    }

    /**
     * ��ȡ��������
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * ��ȡ��ǰԪ�ظ���
     *
     * @return
     */
    public int count() {
        return size;
    }

    /**
     * �ж������Ƿ�Ϊ��
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * �޸� index λ�õ�Ԫ��
     *
     * @param index
     * @param e
     */
    public void set(int index, T e) {
        checkIndex(index);
        data[index] = e;
    }

    /**
     * ��ȡ��Ӧ index λ�õ�Ԫ��
     *
     * @param index
     * @return
     */
    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    /**
     * �鿴�����Ƿ����Ԫ��e
     *
     * @param e
     * @return
     */
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * ��ȡ��ӦԪ�ص��±�, δ�ҵ������� -1
     *
     * @param e
     * @return
     */
    public int find(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }


    /**
     * �� index λ�ã�����Ԫ��e, ʱ�临�Ӷ� O(m+n)
     *
     * @param index
     * @param e
     */
    public void add(int index, T e) {
        checkIndex(index);
        // �����ǰԪ�ظ���������������������������Ϊԭ����2��
        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * ������ͷ����Ԫ��
     *
     * @param e
     */
    public void addFirst(T e) {
        add(0, e);
    }

    /**
     * ������β����Ԫ��
     *
     * @param e
     */
    public void addLast(T e) {
        add(size, e);
    }

    /**
     * ɾ�� index λ�õ�Ԫ�أ�������
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        checkIndexForRemove(index);

        T ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        // ����
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return ret;
    }

    /**
     * ɾ����һ��Ԫ��
     *
     * @return
     */
    public T removeFirst() {
        return remove(0);
    }

    /**
     * ɾ��ĩβԪ��
     *
     * @return
     */
    public T removeLast() {
        return remove(size - 1);
    }

    /**
     * ��������ɾ��ָ��Ԫ��
     *
     * @param e
     */
    public void removeElement(T e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array size = %d, capacity = %d \n", size, data.length));
        builder.append('[');
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }


    /**
     * ���ݷ�����ʱ�临�Ӷ� O(n)
     *
     * @param capacity
     */
    private void resize(int capacity) {
        T[] newData = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed! Require index >=0 and index <= size.");
        }
    }

    private void checkIndexForRemove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("remove failed! Require index >=0 and index < size.");
        }
    }
}