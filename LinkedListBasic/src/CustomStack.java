public class CustomStack<T> {
    CustomList<T> customStack;

    public CustomStack() {
        this.customStack = new CustomList<>();
    }

    /**
     * Add a node to the first place
     * @param value
     */
    public void push(T value) {
        this.customStack.addFirst(value);
    }

    /**
     * Remove first value of customList
     * @return Node removed
     */
    public Node pop() {
        return this.customStack.removeFirst();
    }

    /**
     * Return first node of customList
     * @return first node
     */
    public Node peek() {
        return this.customStack.getFirst();
    }
}
