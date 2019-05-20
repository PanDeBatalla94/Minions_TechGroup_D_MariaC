public interface IList {
    void add(int index, int value);
    void addFirst(int value);
    void addLast(int value);
    void remove(int index);
    void removeFirst();
    Node getIndex(int index);
}
