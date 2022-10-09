package Collections.ArrayList;

/**
 *  Lecture 7: Arrays and Lists
 *  https://www.youtube.com/watch?v=2FmIfaHl2G4&list=PL8FaHk7qbOD4S8NCRyN3yQV2U2TpjWUhy&index=2
 *  https://docs.google.com/presentation/d/1ZKSPKdEjlLlzmf7LoQJlTUC3w0MPInSXy2DxTEva0yo/edit#slide=id.p
 */

public class AList<T> {
    private T[] items;
    private int size;
    /** Creates an empty list. */
    public AList() {
        items = (T[])new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        T[] a = (T[])new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
    /** Inserts X into the back of the list. */
    public void addLast(T x) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public T getLast() {
        return items[size - 1];
    }

    /** Gets the ith item in the list (0 is the front). */
    public T get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public T removeLast() {
        T x = getLast();
        items[size - 1] = null;
        size--;
        return x;
    }
} 