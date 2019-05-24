public class Node<T> {
    Node next;
    Node previous;
    T value;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}

