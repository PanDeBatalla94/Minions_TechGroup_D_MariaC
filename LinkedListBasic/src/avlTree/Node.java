package avlTree;

public class Node {
    Node right;
    Node left;
    Comparable value;
    int height;
    public Node(Comparable value) {
        this.right = null;
        this.left = null;
        this.value = value;
        this.height = 0;
    }
}
