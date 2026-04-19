# 📚 Java Arrays - Complete Guide

## 📌 Overview

This project demonstrates the fundamentals of **arrays in Java**. It includes basic operations such as:

* Declaration and initialization
* Taking user input
* Traversing arrays
* Performing operations like sum, max, search, reverse, and sorting

This file is beginner-friendly and useful for **DSA preparation and interviews**.

---

## 🧠 What is an Array?

An **array** is a collection of elements of the same data type stored in a **contiguous memory location**.

👉 Example:

```java
int[] arr = {1, 2, 3, 4, 5};
```

---

## ⚙️ Features of Arrays

* Fixed size
* Stores similar data types
* Index-based access (starts from 0)
* Fast access using index

---

## 🏗️ Concepts Covered in This Code

### 1. Array Declaration & Initialization

```java
int[] arr = {5, 2, 9, 1, 7};
```

---

### 2. Taking Input from User

```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] inputArr = new int[n];
```

---

### 3. Traversing an Array

```java
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

OR using for-each loop:

```java
for(int num : arr) {
    System.out.print(num + " ");
}
```

---

### 4. Sum of Elements

```java
int sum = 0;
for(int num : arr) {
    sum += num;
}
```

---

### 5. Finding Maximum Element

```java
int max = arr[0];
for(int num : arr) {
    if(num > max) {
        max = num;
    }
}
```

---

### 6. Linear Search

Searches element one by one.

```java
for(int i = 0; i < arr.length; i++) {
    if(arr[i] == key) {
        return i;
    }
}
```

👉 Time Complexity: **O(n)**

---

### 7. Reverse an Array

```java
int start = 0, end = arr.length - 1;
while(start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
```

---

### 8. Sorting an Array

```java
Arrays.sort(arr);
```

👉 Uses built-in optimized sorting (Dual-Pivot QuickSort)

---

## ▶️ How to Run the Code

### Step 1: Compile

```bash
javac ArraysExample.java
```

### Step 2: Run

```bash
java ArraysExample
```

---

## 📊 Time Complexity Summary

| Operation     | Complexity |
| ------------- | ---------- |
| Traversal     | O(n)       |
| Sum           | O(n)       |
| Max           | O(n)       |
| Linear Search | O(n)       |
| Reverse       | O(n)       |
| Sorting       | O(n log n) |

---

## 🎯 Learning Outcomes

After completing this:

* You understand how arrays work in Java
* You can perform basic operations on arrays
* You are ready for intermediate DSA problems

---

## 🚀 Next Topics to Learn

* Binary Search
* Prefix Sum
* Sliding Window
* 2D Arrays
* ArrayList in Java

---

## 💡 Tip

Practice regularly. Arrays are the **foundation of Data Structures** — mastering them will make everything else easier.

---

## 👨‍💻 Author

Your Java practice project 🚀

---
