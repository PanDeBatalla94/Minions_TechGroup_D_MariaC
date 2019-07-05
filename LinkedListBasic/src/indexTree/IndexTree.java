package indexTree;

public class IndexTree<T> {
    Node root;

    public void addNode(T index, T value) {
        Node newNode = new Node(value);

        if(this.root == null) {
            this.root = newNode;
        } else {
            this.addNodeIndexTree(this.root, newNode, index);
        }

    }

    public void addNodeIndexTree(Node currentRoot, Node newNode, T index) {
        if (currentRoot.getValue().equals(index)) {
            currentRoot.addChild(newNode);
        } else {
            int indx = currentRoot.getIndex(currentRoot);
            currentRoot = currentRoot.getChild(indx + 1);
            this.addNodeIndexTree(currentRoot, newNode, index);
        }
    }

    public void print() {
        this.printfromroot(root);
    }
    public void printfromroot(Node currentRoot) {
        System.out.println(currentRoot.getValue());
        int index = currentRoot.children.indexOf(currentRoot);
        currentRoot = currentRoot.getChild(index + 1);
        if (currentRoot.children.size() > 0 ) {

            this.printfromroot(currentRoot);
        }
    }
}
