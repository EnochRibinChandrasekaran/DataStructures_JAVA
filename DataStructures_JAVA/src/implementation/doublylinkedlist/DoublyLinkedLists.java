package implementation.doublylinkedlist;

public class DoublyLinkedLists<T extends Comparable<T>> implements List<T> {
    private Node<T> headNode;
    private Node<T> tailNode;

    @Override
    //O(N) for inserting & removing in arbitrary position
    //O(1) for inserting and removing in end 
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (tailNode == null) {
            tailNode = newNode;
            headNode = newNode;
        } else {
            newNode.setPrevNode(tailNode);
            tailNode.setNextNode(newNode);
            tailNode = newNode;
        }
    }

    @Override //O(N)
    public void traverseForward() {
        Node<T> currentNode = tailNode;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getPrevNode();
        }
    }

    @Override//O(N)
    public void traverseBackward() {
        Node<T> currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNextNode();
        }
    }

    @Override //O(N)
    public void remove(T data) {
        if (tailNode == null) return;
        else {
            Node<T> currentNode = tailNode;
            Node<T> next = null;
            Node<T> prev = currentNode.getPrevNode();
            while (currentNode != null) {
                if (currentNode.getData().compareTo(data) == 0) {
                    prev.setNextNode(next);
                    next.setPrevNode(prev);
                    break;
                } else {
                    next = currentNode;
                    currentNode = prev;
                    prev = prev.getPrevNode();
                }
            }

        }
    }
}
