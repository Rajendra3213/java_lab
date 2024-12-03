// Stack interface
interface Stack {
    void push(int value);
    int pop();
    boolean isEmpty();
    int peek();
}

// Stack implementation
class IntStack implements Stack {
    private int[] stackArray = new int[5];
    private int top = -1;

    public void push(int value) {
        if (top < stackArray.length - 1) stackArray[++top] = value;
    }

    public int pop() {
        return isEmpty() ? -1 : stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        return isEmpty() ? -1 : stackArray[top];
    }
}

public class IntStackTest {
    public static void main(String[] args) {
        IntStack stack = new IntStack();
        stack.push(10); stack.push(20); stack.push(30);
        System.out.println("Top: " + stack.peek());  // Peek
        System.out.println("Popped: " + stack.pop());  // Pop
        System.out.println("Is empty: " + stack.isEmpty());  // Check empty
    }
}
