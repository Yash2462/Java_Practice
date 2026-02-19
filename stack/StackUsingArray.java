package stack;

/**
 * Stack is a linear data structure that follows the Last In First Out (LIFO) principle.
 * The last element added to the stack will be the first one to be removed.
 * Stack can be implemented using arrays or linked lists.
 * In this implementation, we will use an array to create a stack.
 * The stack will have a fixed capacity, and we will keep track of the top element using an index.
 * The stack will support the following operations:
 * 1. push(x): Add an element x to the top of the stack.
 * 2. pop(): Remove and return the top element from the stack.
 * 3. peek(): Return the top element without removing it from the stack.
 * 4. isEmpty(): Check if the stack is empty.
 * 5. isFull(): Check if the stack is full.
 */
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