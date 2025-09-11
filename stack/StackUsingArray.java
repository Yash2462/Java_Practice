package stack;

public class StackUsingArray {
    private int top;
    private final int capacity;
    private final int[] stack;

    public StackUsingArray(int size){
        top = -1;
        capacity = size;
        stack = new int[capacity];
    }

    //push element to the stack
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting "+x);
        stack[++top] = x;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    //pop element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("Removing "+peek());
        return stack[top--];
    }

    //peek element from the stack
    private String peek() {
        return Integer.toString(stack[top]);
    }

    public boolean isEmpty () {
            return top == -1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("peek element is "+stack.peek());
        System.out.println(stack.pop()+" popped from stack");
        System.out.println("peek element after pop "+stack.peek());
    }
}