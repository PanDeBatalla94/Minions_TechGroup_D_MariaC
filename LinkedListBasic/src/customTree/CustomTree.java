package customTree;

public class CustomTree<T> {
    Node root;
    /**
     * Function to add Node to tree
     * @param value
     */
    public void add(T value) {
        Node newNode = new Node(value);
        if(root == null) {
            this.root = newNode;
        } else {
            this.addNode(newNode, this.root);
        }
    }
    /**
     * Recursive function to add Node to tree
     * @param newNode
     * @param customRoot
     */
    public void addNode(Node newNode, Node customRoot) {
        Node currentNode = customRoot;
        if ((Integer)newNode.value <= (Integer)customRoot.value) {
            if(currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                this.addNode(newNode, currentNode.left);
            }

        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                this.addNode(newNode, currentNode.right);
            }
        }
    }

    /**
     * Function to print tree from root node
     */
    public void print() {
        Node current = root;
        print("", current, false);
    }

    /**
     * Function util to print tree
     * @param prefix
     * @param current
     * @param isLeft
     * */
    public void print(String prefix, Node current, boolean isLeft) {
        if(current != null) {
            System.out.println(prefix + (isLeft ? "|--": " \\-- ") + current.value);
            print(prefix + (isLeft ? "|  ": "  "), current.left, true );
            print(prefix + (isLeft ? "|  ": "  "), current.right, false );
        }
    }
}
