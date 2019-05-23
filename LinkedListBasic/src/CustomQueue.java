public class CustomQueue<T> {
    CustomList<T> customQueue;

    public CustomQueue() {
        this.customQueue = new CustomList<>();
    }

    /**
     * This method add a value to a queue, this value is added to the last position
     * @param value
     */
    public void add(T value) {
        this.customQueue.addLast(value);
    }

    /**
     * This method remove the first node on the CustomList
     * @return the node deleted
     */
    public Node remove() {
        Node node_removed = this.customQueue.getFirst();
        this.customQueue.removeFirst();
        return node_removed;
    }

    /**
     * This method return the first node on the customList
     * @return the first node
     */
    public Node peek() {
        return this.customQueue.getFirst();
    }

}
