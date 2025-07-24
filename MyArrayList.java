
package mystructures;


public class MyArrayList <T>{
      T[] a;
    int size;

    public MyArrayList() {
        a = (T[]) new Object[3];
        size = 0;
    }

    public T[] ensureCapacity() {
        T[] temp;
        temp = (T[]) new Object[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = a[i];
        }
        a = temp;
        return a;
    }

    public void add(T value) {
        if (size == a.length) {
            ensureCapacity();
        }
        a[size] = value;
        size++;
    }

    T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("iinvalid index");
        }
        return a[index];
    }

    public void addByIndex(int index, T val) {
        //checking if the is in the list bounds 
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("invalid index ");
        }

        if (size == a.length) {
            ensureCapacity();
        }

        //shifting elements to the right 
        for (int i = size; i >= index; i--) {
            a[i] = a[i - 1];
        }

        // put the val in  place in the 2 caseaes
        a[index] = val;
        size++;
    }

    @Override
    public String toString() {
        String temp = "[";
        for (int i = 0; i < size; i++) {
            temp += a[i] + " ";
        }
        temp += "]";

        return temp;

    }

    T set(int index, T val) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("iinvalid index");
        }
        T temp = a[index];
        a[index] = val;
        return temp;
    }

    boolean isEmpty() {

        return size == 0;
    }

    void clear() {
        for (int i = 0; i < size; i++) {
            a[i] = null;
        }
        size = 0;
    }

    boolean contains(T val) {
        for (int i = 0; i < size; i++) {
            if (val == null) {
                if (a[i] == null) {
                    return true;
                }
            } else if (val.equals(a[i])) {
                return true;
            }
        }
        return false;
    }

    int lastIndex(T val) {
        for (int i = size - 1; i >= 0; i++) {
            if (a[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    void resize(int newSize) {
        T temp[] = (T[]) new Object[newSize];
        for (int i = 0; i < newSize; i++) {
            temp[i] = a[i];

        }
        a = temp;
    }

    T removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("invalid");
        }
        T temp = a[index];
        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        return temp;
    }

    void removeAll(T val) {

        for (int i = 0; i < size; i++) {
            if (a[i].equals(val)) {
                removeAt(i);
            }
            i--;
        }
    }

    int idexOf(T val) {
        for (int i = 0; i < size; i++) {
            if (a[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    T[] trimToSize(int newsize) {

        T[] temp = (T[]) new Object[newsize];
        for (int i = 0; i < newsize; i++) {
            temp[i] = a[i];
        }
        size = newsize;
        a = temp;
        return a;
    }

}
