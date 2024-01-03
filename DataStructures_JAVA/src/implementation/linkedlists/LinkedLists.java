package implementation.linkedlists;

public class LinkedLists<T extends Comparable<T>> implements List<T> {

    private int noOfItems;
    private Node<T> root;

    @Override
    public void insert(T data) {
        //O(1)
        if (root == null) {
            root = new Node<>(data);
        } else {
            //O(1)
            insertAtTheBeginning(data);
            //O(N)
//            insertAtTheEnd(data,root);
        }
        noOfItems++;
    }

    private void insertAtTheBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    private void insertAtTheEnd(T data, Node<T> node) {

        if (node.getNextNode() != null) {
            insertAtTheEnd(data, node.getNextNode());
        }else{
        Node<T> newNode = new Node<>(data);
        node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        Node<T> currentNode = root;
        if (root == null) return;
        else if (currentNode.getData().compareTo(data) == 0) {
            //O(1)
            root = currentNode.getNextNode();
            noOfItems--;
        } else {
            //O(N)
            Node<T> previousNode = null;
            Node<T> nextNode = root;
            while (currentNode != null) {
                if (currentNode.getData().compareTo(data) == 0) {
                    previousNode.setNextNode(nextNode);
                    currentNode = null;
                    noOfItems--;
                    break;
                }
                previousNode = currentNode;
                currentNode = nextNode;
                nextNode = nextNode.getNextNode();
            }

        }

    }

    @Override//O(N)
    public void traverse() {
        Node<T> actualNode = root;
        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return noOfItems;
    }
}
