package Collections;

/**
 * Lecture 5: Node Based Lists
 * https://docs.google.com/presentation/d/1q6p0spGPmj8rFrQnWKp_QZJRFHg-IkHE1L9BfZc0f0Q/edit#slide=id.g5f6f34a2e_131
 * https://www.youtube.com/watch?v=SlCnrzn_bfM&list=PL8FaHk7qbOD4cp06tWA8i9m20pQLvcgE7&index=4
 */
// Represents a list of integers
public class SLList {

    // Nested Class
    // Declaring a nested class as static means that methods inside the static class
    // can not access any of the members of the enclosing class. In this case,
    // it means that no method in IntNode would be able to access first, addFirst, or getFirst.
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    // if the first item (if it exists) is at sentinel.next
    private IntNode sentinel;
    private int size = 0; // increment when a new node is added

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size++;
    }

    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    // adds x into the front of the list
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next); // x: value / first: pointer
        size++;
    }

    // returns the first item in the list
    public int getFirst() {
        return sentinel.next.item;
    }

    // adds an item to the end of the list
    public void addLast(int x) {
        size++;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    // TODO: make size() more efficient
    // Solution: have a var that increments the size.
    // returns the size of the list that starts at IntNode p
    /*private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }*/

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15); // creates a list of one integer, namely 10.
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());

    }

}
