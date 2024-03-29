package implementation.stacks;

import implementation.stacks.arrays.StackArray;
import implementation.stacks.linkedlist.Stacks;

public class StackMenu {
    public static void main(String[] args) {
        System.out.println("---------Linked List Implementation--------");
        Stacks<Integer> intStack = new Stacks<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
            System.out.println("Peek :" + intStack.peek());

        while(!intStack.isEmpty()){
            System.out.println("Pop :" + intStack.pop());
        }
        System.out.println("---------Array Implementation Implementation--------");
        StackArray<Integer> arrStack = new StackArray<>();
        arrStack.push(1);
        arrStack.push(2);
        arrStack.push(3);
        arrStack.push(4);
        arrStack.push(5);
        System.out.println("Peek :" + arrStack.peek());
        System.out.println("Size :" + arrStack.isEmpty());

        while(!arrStack.isEmpty()){
            System.out.println("Pop :" + arrStack.pop());
        }
    }

}
