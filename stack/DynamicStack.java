package stack;

public class DynamicStack {
    int top,capacity;
    int stack[];

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
