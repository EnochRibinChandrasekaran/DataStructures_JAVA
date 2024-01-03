package implementation.doublylinkedlist;

public interface List<T extends Comparable<T>> {
    public void insert(T data);

    public void traverseForward();

    public void traverseBackward();

    public void remove(T data);
}
