public class CustomList<T> implements IList<T> {
    Node head;
    Node tail;

    /**
     * Function to add node by index
     * @param index
     * @value value
    */
    @Override
    public void add(int index, T value) {
        Node newNode = new Node(value);
        Node currentNode = head;
        if(index == 0) {
            this.addFirst(value);
        } else {
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            newNode.previous = currentNode;

            currentNode.next.previous = newNode;
            currentNode.next = newNode;
        }
    }

    /**
     * Function to add node to first place
     * @param value
     */
    @Override
    public void addFirst(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Function to add node to last place
     * @param value
     */
    @Override
    public void addLast(T value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    /**
     * Function to remove the first node
     */
    @Override
    public Node removeFirst() {
        Node toRemove = head;
        head = head.next;
        head.previous = null;
        return toRemove;
    }

    /**
     * Function to remove the first node
     */
    @Override
    public Node removeLast() {
        Node toRemove = tail;
        tail = tail.previous;
        tail.next = null;
        return toRemove;
    }

    /**
     * Function to remove node by index
     * @param index
     */
    @Override
    public void remove(int index) {
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        currentNode.next.previous = currentNode.previous;
    }

    /**
     * Function to get index by node
     * @param index
     */
    @Override
    public Node getIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    /**
     * Function to get the first node
     */
    @Override
    public Node getFirst() {
       return head;
    }

    /**
     * Function to get the last node
     */
    @Override
    public Node getLast() {
        return tail;
    }
}
