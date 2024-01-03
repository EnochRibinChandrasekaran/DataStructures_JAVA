package implementation.linkedlists;

public class LinkedListMenu {

    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedLists<>();
//        linkedList.insert(1);
//        linkedList.insert(2);
//        linkedList.insert(3);
//        linkedList.insert(4);
//
//        linkedList.traverse();
//
//        System.out.println("Size : " + linkedList.size());
//
//        linkedList.remove(1);
//        linkedList.traverse();
//
//        System.out.println("Nodes :");
//        linkedList.insert(12);
//        linkedList.insert(11);
//        linkedList.insert(110);
//        linkedList.insert(1111);
//
//        linkedList.traverse();
//        System.out.println("middle node :" + linkedList.getMiddleNode());
//        linkedList.reverse();
//        linkedList.traverse();

        List<Person> personList = new LinkedLists<>();

        Person ribin = new Person("Ribin", 22);
        personList.insert(new Person("Enoch", 25));
        personList.insert(ribin);
        personList.insert(new Person("Raj", 27));
        personList.insert(new Person("Gopi", 28));
        personList.insert(new Person("Jeff", 21));
        personList.insert(new Person("James", 29));

        personList.traverse();

        System.out.println("Middle element : " + personList.getMiddleNode());
        personList.remove(ribin);
        personList.traverse();

        System.out.println("Reverse order the list :");
        personList.reverse();
        personList.traverse();

    }
}
