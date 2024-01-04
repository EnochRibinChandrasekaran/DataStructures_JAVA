package implementation.stacks.linkedlist;

//every operation takes O(1) constant time complexity 
public class Stacks<T> {
    int count;
    Node<T> head;

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(T data) {
        if (head == null)
            head = new Node<>(data);
        else {
            Node<T> oldHead = head;
            head = new Node<>(data);
            head.setNextNode(oldHead);
        }
        count++;
    }

    public T pop() {
        if (head == null) return null;
        else {
            count--;
            T oldHeadData = head.getData();
            head = head.getNextNode();
            return oldHeadData;
        }

    }

    public T peek() {
        if (head == null) return null;
        else return head.getData();
    }

}
