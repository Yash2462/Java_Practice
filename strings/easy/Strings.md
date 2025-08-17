# Strings in Java

## 1. What is a String?

A String in Java is a **sequence of characters** that represents text data. Strings are **immutable objects** in Java, meaning once created, their content cannot be changed. They are stored in the **String Pool** for memory optimization.

### Characteristics:

* Immutable (cannot be modified after creation)
* Reference type (object, not primitive)
* Stored in String Pool for memory efficiency
* Implements CharSequence interface
* Thread-safe due to immutability

---

## 2. String Declaration and Initialization

### Syntax

```java
// String literal (recommended)
String str1 = "Hello World";

// Using new keyword
String str2 = new String("Hello World");

// Empty string
String empty = "";

// From character array
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String str3 = new String(chars);
```

### String Pool vs Heap

```java
String s1 = "Java";        // Stored in String Pool
String s2 = "Java";        // Points to same object in pool
String s3 = new String("Java"); // Creates new object in heap

System.out.println(s1 == s2);    // true (same reference)
System.out.println(s1 == s3);    // false (different references)
System.out.println(s1.equals(s3)); // true (same content)
```

---

## 3. String Comparison

### Using equals() method:

```java
String str1 = "Hello";
String str2 = "hello";
System.out.println(str1.equals(str2));           // false
System.out.println(str1.equalsIgnoreCase(str2)); // true
```

### Using compareTo() method:

```java
String s1 = "Apple";
String s2 = "Banana";
int result = s1.compareTo(s2); // Returns negative (s1 < s2)
```

---

## 4. Common String Methods

### Length and Character Access

```java
String str = "Programming";
System.out.println(str.length());    // 11
System.out.println(str.charAt(0));   // 'P'
System.out.println(str.indexOf('g')); // 3
System.out.println(str.lastIndexOf('g')); // 8
```

### Substring Operations

```java
String text = "Java Programming";
System.out.println(text.substring(5));     // "Programming"
System.out.println(text.substring(0, 4));  // "Java"
```

### Case Conversion

```java
String str = "Hello World";
System.out.println(str.toLowerCase()); // "hello world"
System.out.println(str.toUpperCase()); // "HELLO WORLD"
```

### Trimming and Checking

```java
String str = "  Hello World  ";
System.out.println(str.trim());        // "Hello World"
System.out.println(str.isEmpty());     // false
System.out.println("".isEmpty());      // true
System.out.println(str.isBlank());     // false (Java 11+)
```

---

## 5. String Manipulation

### a. Concatenation

```java
String first = "Hello";
String last = "World";
String result = first + " " + last;           // "Hello World"
String concat = first.concat(" ").concat(last); // "Hello World"
```

### b. Replace Operations

```java
String text = "Hello World";
System.out.println(text.replace('l', 'x'));     // "Hexxo Worxd"
System.out.println(text.replaceAll("l+", "L")); // "HeLo WorLd"
System.out.println(text.replaceFirst("l", "L")); // "HeLlo World"
```

### c. Split and Join

```java
String csv = "apple,banana,orange";
String[] fruits = csv.split(",");               // ["apple", "banana", "orange"]

String joined = String.join("-", fruits);       // "apple-banana-orange"
```

### d. Contains and Pattern Matching

```java
String text = "Programming in Java";
System.out.println(text.contains("Java"));      // true
System.out.println(text.startsWith("Prog"));    // true
System.out.println(text.endsWith("Java"));      // true
System.out.println(text.matches(".*Java.*"));   // true (regex)
```

---

## 6. String Formatting

### Using String.format()

```java
String name = "Alice";
int age = 25;
String formatted = String.format("Name: %s, Age: %d", name, age);
System.out.println(formatted); // "Name: Alice, Age: 25"
```

### Using printf()

```java
System.out.printf("%.2f%% complete%n", 87.5); // "87.50% complete"
```

### Text Blocks (Java 15+)

```java
String html = """
    <html>
        <body>
            <h1>Hello World</h1>
        </body>
    </html>
    """;
```

---

## 7. StringBuilder and StringBuffer

Since Strings are immutable, use StringBuilder for efficient string building.

### StringBuilder (not thread-safe, faster)

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
sb.insert(5, " Beautiful");
sb.reverse();
String result = sb.toString(); // "dlroW lufituaeB olleH"
```

### StringBuffer (thread-safe, slower)

```java
StringBuffer sbf = new StringBuffer("Initial");
sbf.append(" Text");
String result = sbf.toString(); // "Initial Text"
```

---

## 8. String Conversion

### From other types to String

```java
int num = 123;
double decimal = 45.67;
boolean flag = true;

String strNum = String.valueOf(num);        // "123"
String strDec = Double.toString(decimal);   // "45.67"
String strBool = Boolean.toString(flag);    // "true"
```

### From String to other types

```java
String numStr = "123";
String decStr = "45.67";
String boolStr = "true";

int num = Integer.parseInt(numStr);         // 123
double decimal = Double.parseDouble(decStr); // 45.67
boolean flag = Boolean.parseBoolean(boolStr); // true
```

---

## 9. Common String Algorithms

### a. Reverse a String

```java
public static String reverse(String str) {
    char[] chars = str.toCharArray();
    int left = 0, right = chars.length - 1;
    while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }
    return new String(chars);
}
```

### b. Check if Palindrome

```java
public static boolean isPalindrome(String str) {
    str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    int left = 0, right = str.length() - 1;
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```

### c. Count Character Frequency

```java
public static void countChars(String str) {
    int[] count = new int[256]; // ASCII characters
    for (char c : str.toCharArray()) {
        count[c]++;
    }
    for (int i = 0; i < count.length; i++) {
        if (count[i] > 0) {
            System.out.println((char) i + ": " + count[i]);
        }
    }
}
```

### d. Find First Non-Repeating Character

```java
public static char firstNonRepeating(String str) {
    Map<Character, Integer> charCount = new HashMap<>();
    for (char c : str.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    for (char c : str.toCharArray()) {
        if (charCount.get(c) == 1) {
            return c;
        }
    }
    return '\0'; // No non-repeating character found
}
```

---

## 10. Regular Expressions (Regex)

### Basic Pattern Matching

```java
String email = "user@example.com";
String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
boolean isValid = email.matches(emailPattern);

String text = "The year 2023 was great";
String[] numbers = text.split("\\D+"); // Split by non-digits
```

### Pattern and Matcher

```java
import java.util.regex.*;

String text = "Contact: john@email.com or jane@email.com";
Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
Matcher matcher = pattern.matcher(text);

while (matcher.find()) {
    System.out.println("Email found: " + matcher.group());
}
```

---

## 11. String Performance Tips

### Do's and Don'ts

```java
// ❌ Inefficient (creates many String objects)
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "text" + i;
}

// ✅ Efficient (uses StringBuilder internally)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("text").append(i);
}
String result = sb.toString();

// ✅ For simple concatenation, use String.join()
String[] words = {"Hello", "Beautiful", "World"};
String sentence = String.join(" ", words);
```

---

## 12. Memory Considerations

### String Interning

```java
String s1 = new String("Hello").intern(); // Forces into String Pool
String s2 = "Hello";
System.out.println(s1 == s2); // true (both point to pool)
```

### Memory Usage Comparison

| Operation          | Memory Impact |
| ------------------ | ------------- |
| String literal     | Low (pooled)  |
| new String()       | High (heap)   |
| String concat (+)  | High          |
| StringBuilder      | Medium        |

---

## 13. When to Use What

| Scenario                  | Use                |
| ------------------------- | ------------------ |
| Simple text storage       | String             |
| Multiple concatenations   | StringBuilder      |
| Thread-safe building      | StringBuffer       |
| Pattern matching          | Regular Expressions |
| Performance critical      | char[] arrays      |

---

## 14. Common Pitfalls

### Null Pointer Exception

```java
// ❌ Dangerous
String str = null;
if (str.equals("test")) { // NullPointerException
    // code
}

// ✅ Safe approach
if ("test".equals(str)) { // Safe, returns false if str is null
    // code
}

// ✅ Or use Objects.equals() (Java 7+)
if (Objects.equals(str, "test")) {
    // code
}
```

---

## 15. Summary

| Feature               | String              |
| --------------------- | ------------------- |
| Mutability            | Immutable           |
| Memory Storage        | String Pool / Heap  |
| Thread Safety         | Yes                 |
| Performance (concat)  | Poor                |
| Use Case              | Simple text ops     |
| Alternative           | StringBuilder       |

---

## Quick Reference

```java
// Creation
String s = "Hello World";

// Common operations
s.length()                  // Get length
s.charAt(index)            // Get character at index
s.substring(start, end)    // Get substring
s.indexOf("text")          // Find index of text
s.replace("old", "new")    // Replace text
s.split("delimiter")       // Split into array
s.trim()                   // Remove whitespace
s.toUpperCase()           // Convert to uppercase
s.toLowerCase()           // Convert to lowercase

// Comparison
s.equals("other")          // Content comparison
s.compareTo("other")       // Lexicographic comparison
s.contains("text")         // Check if contains text
s.startsWith("prefix")     // Check prefix
s.endsWith("suffix")       // Check suffix
```