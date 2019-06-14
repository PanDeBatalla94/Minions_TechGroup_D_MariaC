package customTree;

public class Node<T> {
    Node right;
    Node left;
    T value;
    public Node(T value) {
        this.right = null;
        this.left = null;
        this.value = value;
    }
}
