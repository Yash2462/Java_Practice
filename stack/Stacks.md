# Stacks in Java

## 1. What is a Stack?

A **stack** is a **linear data structure** that follows the **Last-In-First-Out (LIFO)** principle. The two main operations are:
- **push()**: Add an element to the top of the stack
- **pop()**: Remove the top element from the stack

### Characteristics:

* LIFO (Last-In-First-Out) order
* Dynamic size (can grow and shrink)
* Fast operations (O(1) time complexity for push/pop)
* Used for function call management, undo operations, expression evaluation

---

## 2. Stack Implementation

### a. Using Array (Fixed Size)

```java
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
```

### b. Using ArrayList (Dynamic Size)

```java
import java.util.ArrayList;

class DynamicStack {
    private ArrayList<Integer> stack;
    
    public DynamicStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(int value) {
        stack.add(value);
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public int size() {
        return stack.size();
    }
}
```

### c. Using Java's Built-in Stack Class

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.pop()); // 30
        System.out.println(stack.peek()); // 20
        System.out.println(stack.size()); // 2
        System.out.println(stack.isEmpty()); // false
        
        stack.clear();
        System.out.println(stack.isEmpty()); // true
    }
}
```

---

## 3. Stack Operations

### Basic Operations

| Operation | Description | Time Complexity |
|-----------|-------------|-----------------|
| push() | Add element to top | O(1) |
| pop() | Remove top element | O(1) |
| peek() | View top element without removal | O(1) |
| isEmpty() | Check if stack is empty | O(1) |
| isFull() | Check if stack is full (array implementation) | O(1) |
| size() | Get number of elements | O(1) |

---

## 4. Common Use Cases

### a. Function Call Stack

```java
// When a function is called, its parameters and return address are pushed onto the call stack
// When the function returns, it's popped from the stack
void functionA() {
    functionB(); // functionB is pushed onto the stack
}

void functionB() {
    functionC(); // functionC is pushed onto the stack
}

void functionC() {
    // When this returns, it pops from the stack
}
```

### b. Undo/Redo Operations

```java
class TextEditor {
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    private String currentText = "";
    
    public void type(String text) {
        undoStack.push(currentText);
        currentText += text;
        redoStack.clear(); // Clear redo stack on new action
    }
    
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);
            currentText = undoStack.pop();
        }
    }
    
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);
            currentText = redoStack.pop();
        }
    }
}
```

### c. Expression Evaluation (Postfix/Infix)

```java
public static int evaluatePostfix(String expression) {
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);
        
        if (Character.isDigit(c)) {
            stack.push(c - '0');
        } else {
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            
            switch (c) {
                case '+': stack.push(operand1 + operand2); break;
                case '-': stack.push(operand1 - operand2); break;
                case '*': stack.push(operand1 * operand2); break;
                case '/': stack.push(operand1 / operand2); break;
            }
        }
    }
    
    return stack.pop();
}

// Example: "23+4*" = (2+3)*4 = 20
```

### d. Balanced Parentheses Check

```java
public static boolean isBalanced(String expression) {
    Stack<Character> stack = new Stack<>();
    
    for (char c : expression.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else if (c == ')' || c == ']' || c == '}') {
            if (stack.isEmpty()) return false;
            
            char top = stack.pop();
            if ((c == ')' && top != '(') || 
                (c == ']' && top != '[') || 
                (c == '}' && top != '{')) {
                return false;
            }
        }
    }
    
    return stack.isEmpty();
}

// Example: "({[]})" returns true, "({[)}" returns false
```

### e. Next Greater Element

```java
public static int[] nextGreaterElement(int[] arr) {
    int[] result = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    
    for (int i = arr.length - 1; i >= 0; i--) {
        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
            stack.pop();
        }
        
        result[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(arr[i]);
    }
    
    return result;
}

// Example: [4, 5, 2, 10] -> [5, 10, 10, -1]
```

---

## 5. Stack vs Other Data Structures

### Stack vs Queue

| Feature | Stack (LIFO) | Queue (FIFO) |
|---------|-------------|--------------|
| Order | Last-In-First-Out | First-In-First-Out |
| Operations | push, pop, peek | enqueue, dequeue, peek |
| Use Case | Undo operations, function calls | Task scheduling, BFS |
| Implementation | ArrayList, LinkedList | LinkedList, ArrayDeque |

### Stack vs ArrayList

| Feature | Stack | ArrayList |
|---------|-------|-----------|
| Access | Only top element | Any index |
| Operations | push, pop | add, remove, get |
| Thread Safety | Not thread-safe | Not thread-safe |
| Use Case | LIFO operations | General purpose list |

---

## 6. Time and Space Complexity

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |
| isEmpty() | O(1) |
| size() | O(1) |

### Space Complexity

| Implementation | Space Complexity |
|----------------|------------------|
| Array-based | O(n) - fixed size |
| ArrayList-based | O(n) - dynamic size |
| LinkedList-based | O(n) - dynamic size |

---

## 7. Stack Overflow

**Stack Overflow** occurs when the call stack exceeds its maximum size, typically due to:
- Infinite recursion
- Excessively deep recursion
- Large stack frame sizes

### Example: Infinite Recursion

```java
void infiniteRecursion() {
    infiniteRecursion(); // No base case!
}

public static void main(String[] args) {
    infiniteRecursion(); // Stack Overflow Error
}
```

### Prevention

```java
void safeRecursion(int depth, int maxDepth) {
    if (depth >= maxDepth) { // Base case
        return;
    }
    safeRecursion(depth + 1, maxDepth);
}
```

---

## 8. Practical Examples

### a. Browser History

```java
class Browser {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage;
    
    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear(); // Clear forward history
    }
    
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
        }
    }
    
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
    }
}
```

### b. Algorithm: Tower of Hanoi

```java
public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
    Stack<Integer> stack = new Stack<>();
    
    // Push all disks onto the stack
    for (int i = n; i >= 1; i--) {
        stack.push(i);
    }
    
    // Move disks using stack
    while (!stack.isEmpty()) {
        int disk = stack.pop();
        System.out.println("Move disk " + disk + " from " + source + " to " + destination);
        
        // Push smaller disks to auxiliary
        for (int i = disk - 1; i >= 1; i--) {
            if (!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
                System.out.println("Move disk " + i + " from " + source + " to " + auxiliary);
                stack.push(i);
            }
        }
        
        // Push disk back to source
        stack.push(disk);
        
        // Move smaller disks to destination
        for (int i = disk - 1; i >= 1; i--) {
            if (!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
                System.out.println("Move disk " + i + " from " + auxiliary + " to " + destination);
            }
        }
    }
}
```

---

## 9. Best Practices

### Do's

* ✅ Use stack for LIFO operations (undo, function calls)
* ✅ Check for empty stack before pop/peek operations
* ✅ Use ArrayList or LinkedList for dynamic stacks
* ✅ Clear redo stack when new action is performed (for undo/redo)

### Don'ts

* ❌ Don't use stack for random access operations
* ❌ Don't ignore stack overflow in recursive algorithms
* ❌ Don't use fixed-size array stack when size is unknown
* ❌ Don't forget to handle edge cases (empty stack)

---

## 10. Summary

| Feature | Description |
|---------|-------------|
| Data Structure | Linear, LIFO |
| Operations | push, pop, peek, isEmpty |
| Time Complexity | O(1) for all operations |
| Space Complexity | O(n) |
| Thread Safety | Not thread-safe (use Collections.synchronizedStack for thread safety) |
| Use Cases | Function calls, undo operations, expression evaluation, backtracking |
| Implementations | Array-based, ArrayList-based, LinkedList-based |

---

## 11. Quick Reference

```java
// Using Java's built-in Stack
Stack<Integer> stack = new Stack<>();
stack.push(10);           // Add element
int top = stack.pop();    // Remove and get top element
int peek = stack.peek();  // Get top element without removal
boolean empty = stack.isEmpty(); // Check if empty
int size = stack.size();  // Get size
stack.clear();           // Clear stack

// Using ArrayList for custom stack
List<Integer> stackList = new ArrayList<>();
stackList.add(value);     // push
stackList.remove(stackList.size() - 1); // pop
int top = stackList.get(stackList.size() - 1); // peek

// Using Deque (double-ended queue)
deque<Integer> stackDeque = new ArrayDeque<>();
stackDeque.push(value);   // push
stackDeque.pop();         // pop
stackDeque.peek();        // peek
```
