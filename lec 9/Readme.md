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

# 📚 Java 2D Arrays - Complete Guide

## 📌 Overview

This project demonstrates the fundamentals and important operations of **2D arrays in Java**.
It covers traversal, matrix operations, searching, and commonly asked interview problems.

This is useful for:

* Beginners learning arrays
* Students preparing for **DSA**
* Interview practice

---

## 🧠 What is a 2D Array?

A **2D array** is an array of arrays, used to store data in a **tabular format (rows × columns)**.

👉 Example:

```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

This represents a **3 × 3 matrix**.

---

## ⚙️ Key Concepts

* `arr.length` → number of rows
* `arr[i].length` → number of columns
* Access element → `arr[i][j]`

---

## 🏗️ Concepts Covered in Code

---

### 🔹 1. Traversing a 2D Array

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
}
```

---

### 🔹 2. Sum of All Elements

```java
int sum = 0;
for (int[] row : arr) {
    for (int num : row) {
        sum += num;
    }
}
```

---

### 🔹 3. Maximum Element

```java
int max = arr[0][0];
for (int[] row : arr) {
    for (int num : row) {
        if (num > max) max = num;
    }
}
```

---

### 🔹 4. Row-wise Sum

```java
for (int i = 0; i < arr.length; i++) {
    int sum = 0;
    for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
    }
}
```

---

### 🔹 5. Column-wise Sum

```java
for (int j = 0; j < arr[0].length; j++) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i][j];
    }
}
```

---

### 🔹 6. Transpose of Matrix

```java
int[][] t = new int[cols][rows];

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        t[j][i] = arr[i][j];
    }
}
```

👉 Converts rows into columns.

---

### 🔹 7. Diagonal Elements

#### Primary Diagonal:

```java
arr[i][i]
```

#### Secondary Diagonal:

```java
arr[i][n - i - 1]
```

---

### 🔹 8. Spiral Traversal (Important)

Traverse matrix in spiral order:

* Top row → Right column → Bottom row → Left column

Used in many **interview questions**.

---

### 🔹 9. Searching in Matrix

```java
for (int[] row : arr) {
    for (int num : row) {
        if (num == key) return true;
    }
}
```

---

## ▶️ How to Run

### Step 1: Compile

```bash
javac TwoDArrays.java
```

### Step 2: Run

```bash
java TwoDArrays
```

---

## 📊 Time Complexity

| Operation        | Complexity |
| ---------------- | ---------- |
| Traversal        | O(n × m)   |
| Sum / Max        | O(n × m)   |
| Row/Column Sum   | O(n × m)   |
| Transpose        | O(n × m)   |
| Spiral Traversal | O(n × m)   |
| Search           | O(n × m)   |

---

## 🎯 Learning Outcomes

After completing this project:

* You understand how 2D arrays work
* You can perform matrix operations
* You can solve basic and intermediate DSA problems

---

## 🚀 Next Topics

* Matrix Multiplication
* Rotate Matrix (90°)
* Search in Sorted Matrix
* Prefix Sum (2D)

---

## 💡 Pro Tip

Every 2D array problem is based on:

```
row loop + column loop
```

Master nested loops and you’ll unlock most matrix problems.

---

## 👨‍💻 Author

Your Java DSA practice 🚀

---
















