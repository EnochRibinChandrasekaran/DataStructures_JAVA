package implementation.linkedlists;

public interface List<T> {
    public void insert(T data);

    public void remove(T data);

    public void traverse();

    public int size();


    public Node getMiddleNode();

    public void reverse();

}
