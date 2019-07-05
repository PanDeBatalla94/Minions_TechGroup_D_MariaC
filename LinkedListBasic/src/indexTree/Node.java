package indexTree;

import java.util.ArrayList;

public class Node<T> {
    T value;
    ArrayList<Node> children;

    public Node(T value) {
        this.value = value;
        this.children = new ArrayList<Node>();
    }

    public void addChild(Node newNode) {
        this.children.add(newNode);
    }
    public int getIndex(Node node) {
        return this.children.indexOf(node);
    }

    public Node getChild(int index) {
        return this.children.get(index);
    }

    public T getValue() {
        return this.value;
    }
}
