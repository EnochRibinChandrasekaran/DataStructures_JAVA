package implementation.linkedlists;

public class LinkedListMenu {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedLists<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        linkedList.traverse();

        System.out.println("Size : " +linkedList.size());

        linkedList.remove(1);
        linkedList.traverse();

        System.out.println("Nodes :");
        linkedList.insert(12);
        linkedList.insert(11);
        linkedList.insert(110);
        linkedList.insert(1111);

        linkedList.traverse();
        System.out.println("middle node :" + linkedList.getMiddleNode());




    }
}
