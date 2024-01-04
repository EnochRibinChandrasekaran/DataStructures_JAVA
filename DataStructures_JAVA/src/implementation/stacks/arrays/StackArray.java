package implementation.stacks.arrays;

//resize method is O(N)
//everything else is O(1)
public class StackArray<T> {
    private int count;
    private T[] stack;

    public StackArray() {
        this.stack = (T[]) new Object[1];
    }

    public int size() {
        return count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(T data) {
        if (stack.length == count) {
            resize(count * 2);
        }
        stack[count++] = data;
    }

    public T pop() {
        if (count == 0) return null;
        T data = stack[--count];
        //avoid memory leaks
        stack[count] = null;

        if (count == stack.length / 4 && count > 0) {
            resize(stack.length / 2);
        }
        return data;
    }

    private void resize(int length) {
        System.out.println("Resizing --");
        T[] resizedArray = (T[]) new Object[length];
        for (int i = 0; i < count; i++) {
            resizedArray[i] = stack[i];
        }
        stack = resizedArray;
    }

    public T peek() {
        if (count == 0) return null;
        return stack[count-1];
    }


}
