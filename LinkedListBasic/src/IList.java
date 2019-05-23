public interface IList<T> {
    void add(int index, T value);
    void addFirst(T value);
    void addLast(T value);
    void remove(int index);
    Node removeFirst();
    Node removeLast();
    Node getIndex(int index);
    Node getFirst();
    Node getLast();
}
