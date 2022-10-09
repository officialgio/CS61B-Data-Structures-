package Collections.DoublyLinkedList;

/**
 * Lecture 6: DLLs and Array
 * https://www.youtube.com/watch?v=Xt4dKEUokz4&list=PL8FaHk7qbOD5Gy1o06RRilCqv0So31lJt&index=4
 * https://docs.google.com/presentation/d/1itxVVyJTxKaDod3L8_jasnlZ1LHu-KDeV6Njbqqgbfs/edit#slide=id.g829fe3f43_0_742
 */

public class SLList<LochNess> {
    // Representation of each box or node.
    private class StuffNode {
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode first;
    private int size;

    public SLList(LochNess x) {
        first = new StuffNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(LochNess x) {
        first = new StuffNode(x, first);
        size += 1;
    }

    /** Returns the first item in the list. */
    public LochNess getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(LochNess x) {
        size += 1;

        StuffNode p = first;

        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new StuffNode(x, null);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList<String> L = new SLList<>("bone"); // creates a list of one integer, namely 10.
        L.addFirst("thugs");
        System.out.println(L.size());

    }

}


