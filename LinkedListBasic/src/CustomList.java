public class CustomList implements IList {
    Node head;
    Node tail;

    @Override
    public void add(int index, int value) {
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

    @Override
    public void addFirst(int value) {
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

    @Override
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    @Override
    public void removeFirst() {
        head = head.next;
        head.previous = null;
    }

    @Override
    public void remove(int index) {
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        currentNode.next.previous = currentNode.previous;
    }


    @Override
    public Node getIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}