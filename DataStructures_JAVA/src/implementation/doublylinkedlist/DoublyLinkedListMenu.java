package implementation.doublylinkedlist;

public class DoublyLinkedListMenu {
    public static void main(String[] args){
    List<Integer> numberlist = new DoublyLinkedLists<>();
    numberlist.insert(1);
    numberlist.insert(2);
    numberlist.insert(3);
    numberlist.insert(4);
    numberlist.insert(5);
    System.out.println("Forward :");
    numberlist.traverseForward();
    System.out.println("Backward :");
    numberlist.traverseBackward();
    System.out.println("Remove :");
    numberlist.remove(2);
    numberlist.traverseForward();

    }
}
