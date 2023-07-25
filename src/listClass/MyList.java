package listClass;

public class MyList<T> {
    private Object[] array;
    private int size;
    private int capacity;

    public MyList() {
        this(10);
    }

    public MyList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            expandCapacity();
        }
        array[size++] = data;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        T removedData = get(index);

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;

        return removedData;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }

        T oldData = get(index);
        array[index] = data;

        return oldData;
    }

    private void expandCapacity() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        capacity = newCapacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

