# Java Strings — Complete Theory + Practical Guide

---

# Table of Contents

1. Introduction to Strings
2. Why Strings are Important
3. String as an Object
4. String Memory Concept
5. String Constant Pool (SCP)
6. Immutable Nature of Strings
7. String Declaration
8. String Input
9. String Methods
10. String Traversal
11. String Comparison
12. String Manipulation
13. StringBuilder
14. Arrays of Strings
15. 2D String Arrays
16. Common Interview Concepts
17. Practice Programs
18. Important Notes

---

# 1. Introduction to Strings

A String in Java is a sequence of characters.

Examples:
```text
"Java"
"Hello World"
"12345"
```

In Java, Strings are used to store text data.

---

# 2. Why Strings are Important

Strings are used everywhere in programming:

- User names
- Passwords
- Messages
- Search operations
- File names
- Emails
- URLs
- Data processing

Almost every application uses Strings.

---

# 3. String is an Object

Very Important Concept:

In Java:
# String is NOT a primitive datatype

It is a:
# Class

Example:
```java
String name = "Java";
```

Here:
- `String` → class
- `name` → object reference
- `"Java"` → object

---

# 4. How String Objects are Created

When you write:

```java
String str = "Java";
```

Java creates a String object in memory.

---

# 5. String Constant Pool (SCP)

One of the most important concepts.

Java stores string literals inside a special memory area called:

# String Constant Pool

Example:

```java
String a = "Java";
String b = "Java";
```

Both `a` and `b` point to the same object.

Visualization:

```text
          SCP
        --------
         "Java"
        --------
          ↑   ↑
          a   b
```

Why?

Because Java saves memory by reusing strings.

---

# 6. Creating String using new Keyword

```java
String str = new String("Java");
```

This creates:
- one object in SCP
- another object in heap memory

Visualization:

```text
SCP -> "Java"

Heap -> new String("Java")
```

---

# 7. Why Strings are Immutable

Important Theory Question.

# Immutable means:
Strings cannot be changed after creation.

Example:

```java
String str = "Java";

str.concat(" Programming");
```

Original string remains:
```text
Java
```

Because `concat()` creates a new object.

---

# 8. Why Java Made Strings Immutable

Reasons:

## 1. Security
Used in:
- URLs
- database connections
- file paths

Immutable strings prevent modification.

---

## 2. Thread Safety
Multiple threads can safely use same string.

---

## 3. Memory Optimization
SCP becomes possible because strings cannot change.

---

# 9. Difference Between Primitive and String

| Primitive | String |
|---|---|
| stores value | stores object reference |
| int, char, float | String |
| fixed size | dynamic |

---

# 10. String Declaration

## Method 1 (Preferred)

```java
String str = "Hello";
```

---

## Method 2

```java
String str = new String("Hello");
```

---

# 11. Taking String Input

Import Scanner:

```java
import java.util.Scanner;
```

---

# next()

Takes single word.

```java
Scanner sc = new Scanner(System.in);

String name = sc.next();
```

Input:
```text
Java Programming
```

Output:
```text
Java
```

---

# nextLine()

Takes full sentence.

```java
String line = sc.nextLine();
```

Input:
```text
Java Programming
```

Output:
```text
Java Programming
```

---

# 12. String Length

## length()

Returns number of characters.

```java
String str = "Programming";

System.out.println(str.length());
```

Output:
```text
11
```

---

# 13. Access Characters

## charAt(index)

Used to access characters.

```java
String str = "Java";

System.out.println(str.charAt(0));
```

Output:
```text
J
```

---

# 14. String Traversal

Traversal means visiting every character.

```java
String str = "Java";

for(int i = 0; i < str.length(); i++) {

    System.out.println(str.charAt(i));
}
```

Output:
```text
J
a
v
a
```

---

# 15. Uppercase and Lowercase

## toUpperCase()

```java
String str = "java";

System.out.println(str.toUpperCase());
```

Output:
```text
JAVA
```

---

## toLowerCase()

```java
String str = "JAVA";

System.out.println(str.toLowerCase());
```

Output:
```text
java
```

---

# 16. String Comparison

Very Important Concept.

---

# == Operator

Compares memory addresses.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);
```

Output:
```text
false
```

Because addresses are different.

---

# equals()

Compares content.

```java
System.out.println(a.equals(b));
```

Output:
```text
true
```

---

# equalsIgnoreCase()

Ignores uppercase/lowercase differences.

```java
String a = "JAVA";
String b = "java";

System.out.println(a.equalsIgnoreCase(b));
```

Output:
```text
true
```

---

# 17. Concatenation

Joining strings together.

```java
String first = "Hello";
String second = "World";

String result = first + " " + second;

System.out.println(result);
```

Output:
```text
Hello World
```

---

# 18. contains()

Checks substring presence.

```java
String str = "Programming";

System.out.println(str.contains("gram"));
```

Output:
```text
true
```

---

# 19. startsWith()

```java
String str = "Programming";

System.out.println(str.startsWith("Pro"));
```

---

# 20. endsWith()

```java
String str = "Programming";

System.out.println(str.endsWith("ing"));
```

---

# 21. substring()

Extract part of string.

```java
String str = "Programming";

System.out.println(str.substring(0,4));
```

Output:
```text
Prog
```

---

# 22. replace()

```java
String str = "Java";

System.out.println(str.replace("Java","Python"));
```

Output:
```text
Python
```

---

# 23. trim()

Removes spaces from beginning and end.

```java
String str = "   Hello   ";

System.out.println(str.trim());
```

Output:
```text
Hello
```

---

# 24. Reverse a String

```java
String str = "Java";

for(int i = str.length()-1; i >= 0; i--) {

    System.out.print(str.charAt(i));
}
```

Output:
```text
avaJ
```

---

# 25. Count Vowels

```java
String str = "Programming";

int count = 0;

for(int i = 0; i < str.length(); i++) {

    char ch = Character.toLowerCase(str.charAt(i));

    if(ch == 'a' || ch == 'e' || ch == 'i' ||
       ch == 'o' || ch == 'u') {

        count++;
    }
}

System.out.println(count);
```

---

# 26. Palindrome String

Palindrome means same forward and backward.

Examples:
```text
madam
racecar
```

Program:

```java
String str = "madam";

String rev = "";

for(int i = str.length()-1; i >= 0; i--) {

    rev += str.charAt(i);
}

if(str.equals(rev)) {

    System.out.println("Palindrome");
}
else {

    System.out.println("Not Palindrome");
}
```

---

# 27. String Arrays

```java
String[] arr = {"Java", "Python", "C++"};

for(int i = 0; i < arr.length; i++) {

    System.out.println(arr[i]);
}
```

---

# 28. 2D String Arrays

```java
String[][] arr = {
    {"A", "B"},
    {"C", "D"}
};
```

Print:

```java
for(int i = 0; i < arr.length; i++) {

    for(int j = 0; j < arr[i].length; j++) {

        System.out.print(arr[i][j] + " ");
    }

    System.out.println();
}
```

---

# 29. StringBuilder

StringBuilder is mutable.

# Mutable means:
data can be changed.

---

# Why StringBuilder?

Normal String:
- slower
- creates many objects

StringBuilder:
- faster
- memory efficient

---

# Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
```

Output:
```text
Java Programming
```

---

# 30. Difference Between String and StringBuilder

| String | StringBuilder |
|---|---|
| immutable | mutable |
| slower | faster |
| more memory | efficient |
| safe | flexible |

---

# 31. Commonly Used String Methods

| Method | Purpose |
|---|---|
| length() | string length |
| charAt() | access character |
| equals() | compare content |
| toUpperCase() | uppercase |
| toLowerCase() | lowercase |
| substring() | extract part |
| contains() | check word |
| replace() | replace text |
| trim() | remove spaces |
| startsWith() | check starting |
| endsWith() | check ending |
| indexOf() | first occurrence |
| lastIndexOf() | last occurrence |

---

# 32. indexOf()

```java
String str = "Programming";

System.out.println(str.indexOf('g'));
```

Output:
```text
3
```

---

# 33. lastIndexOf()

```java
String str = "Programming";

System.out.println(str.lastIndexOf('g'));
```

Output:
```text
10
```

---

# 34. Memory Visualization

Example:

```java
String a = "Java";
String b = "Java";
String c = new String("Java");
```

Visualization:

```text
SCP:
-------
"Java"
-------
 ↑   ↑
 a   b

Heap:
-------
new String("Java")
-------
      ↑
      c
```

---

# 35. Important Interview Questions

---

## Q1. Why String is Immutable?

Answer:
- security
- thread safety
- SCP optimization

---

## Q2. Difference between == and equals()

| == | equals() |
|---|---|
| compares address | compares content |

---

## Q3. Difference between String and StringBuilder

| String | StringBuilder |
|---|---|
| immutable | mutable |
| slower | faster |

---

# 36. Practice Questions

## Easy
1. Find length
2. Print characters
3. Count vowels
4. Reverse string
5. Convert uppercase

---

## Medium
1. Check palindrome
2. Remove spaces
3. Count words
4. Find duplicates
5. Check anagram

---

# 37. Final Notes

Remember these important points:

- String is a class
- String objects are immutable
- SCP saves memory
- Use `equals()` for comparison
- Use `StringBuilder` for modifications
- Strings are heavily used in interviews

---