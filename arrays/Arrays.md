# Arrays in Java

## 1. What is an Array?

An array in Java is a **data structure** that holds a **fixed number of elements** of the **same data type**. Each element can be accessed by its index (starting from 0).

### Characteristics:

* Fixed size (defined at creation)
* Contiguous memory allocation
* Elements are of the same type (int, String, etc.)
* Can be single-dimensional or multi-dimensional

---

## 2. Array Declaration and Initialization

### Syntax

```java
// Declaration
int[] arr;

// Initialization
arr = new int[5]; // array of 5 integers (default 0)

// Combined
int[] arr = new int[5];

// With values
int[] arr = {1, 2, 3, 4, 5};
```

### Default Values

| Type    | Default Value |
| ------- | ------------- |
| int     | 0             |
| double  | 0.0           |
| boolean | false         |
| Object  | null          |

---

## 3. Accessing Elements

```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]); // 10
arr[1] = 50; // Modify value
```

---

## 4. Traversing Arrays

### Using for loop:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Using enhanced for loop:

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

## 5. Common Operations

### a. Sum of elements

```java
int sum = 0;
for (int num : arr) sum += num;
```

### b. Find max/min

```java
int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}
```

### c. Reverse array

```java
for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

### d. Left rotate by one (shift-based)

```java
int first = arr[0];
for (int i = 0; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
arr[arr.length - 1] = first;
```

### e. Remove duplicates from sorted array

```java
int uniqueIndex = 1;
for (int i = 1; i < arr.length; i++) {
    if (arr[i] != arr[uniqueIndex - 1]) {
        arr[uniqueIndex++] = arr[i];
    }
}
// Now arr[0..uniqueIndex-1] has unique elements
```

---

## 6. Multi-dimensional Arrays

### Declaration:

```java
int[][] matrix = new int[3][3];
int[][] predefined = {{1,2,3},{4,5,6},{7,8,9}};
```

### Access:

```java
System.out.println(matrix[0][1]);
matrix[1][2] = 99;
```

---

## 7. Arrays Utility Class

Java provides the `java.util.Arrays` class for utility operations.

### Examples:

```java
int[] arr = {5, 2, 8, 1};
Arrays.sort(arr);            // Sort
int idx = Arrays.binarySearch(arr, 2); // Search
int[] copy = Arrays.copyOf(arr, arr.length); // Copy
Arrays.fill(arr, 0);         // Fill with 0
System.out.println(Arrays.toString(arr)); // Print
```

---

## 8. Limitations of Arrays

* Fixed size (use ArrayList for dynamic size)
* Cannot store mixed types (e.g., int and String)

---

## 9. When to Use Arrays

* When you know the exact number of elements
* When performance and memory predictability are key
* For primitive types when using collections is overkill

---

## 10. Summary

| Feature            | Array            |
| ------------------ | ---------------- |
| Size               | Fixed            |
| Type Safety        | Yes              |
| Fast Access        | Yes (O(1))       |
| Dynamic Growing    | No               |
| Java Utility Class | java.util.Arrays |
