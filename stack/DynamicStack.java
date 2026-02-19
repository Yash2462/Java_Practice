package stack;

/**
 * DynamicStack is an implementation of a stack data structure that can grow in size dynamically.
 * It uses an array to store the elements of the stack, and when the stack reaches its capacity, it doubles the size of the array to accommodate more elements.
 * The stack supports the following operations:
 * 1. push(x): Add an element x to the top of the stack.
 * 2. pop(): Remove and return the top element from the stack.
 * 3. peek(): Return the top element without removing it from the stack.
 * 4. isEmpty(): Check if the stack is empty.
 */
public class DynamicStack {
    private int top,capacity;
    private int[] stack;

    public DynamicStack(int initialSize){
        top = -1;
        capacity = initialSize;
        stack = new int[capacity];
    }

    //push element to the stack
    public void push(int x){
        if (top == capacity - 1) {
            resize();
        }
        System.out.println("Inserting "+x);
        stack[++top] = x;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, capacity);
        stack = newStack;
        capacity = newCapacity;
        System.out.println("Stack resized to capacity: " + capacity);
    }

    //pop element from the stack
    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        System.out.println("Removing "+peek());
        return stack[top--];
    }

    private String peek() {
        return stack[top] + "";
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(2);
        stack.push(1);
        stack.push(2);
        stack.push(3); // This will trigger a resize
        System.out.println("peek element is "+stack.peek());
        System.out.println(stack.pop()+" popped from stack");
        System.out.println("peek element after pop "+stack.peek());
    }
}
