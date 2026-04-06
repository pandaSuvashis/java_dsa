# 🔁 Java Loops

## 📌 Types of Loops in Java

Java provides three main types of loops:

1.  **for loop**\
2.  **while loop**\
3.  **do-while loop**

------------------------------------------------------------------------

## 1️⃣ for Loop

### 🔹 Description

The `for` loop is used when the number of iterations is known
beforehand.\
It consists of initialization, condition, and update in a single line.

### 🔹 Syntax

``` java
for (initialization; condition; update) {
    // code to execute
}
```

### 🔹 Example

``` java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

------------------------------------------------------------------------

## 2️⃣ while Loop

### 🔹 Description

The `while` loop is used when the number of iterations is not known.\
It checks the condition before executing the loop body.

### 🔹 Syntax

``` java
while (condition) {
    // code to execute
}
```

### 🔹 Example

``` java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

------------------------------------------------------------------------

## 3️⃣ do-while Loop

### 🔹 Description

The `do-while` loop executes the code at least once, even if the
condition is false.\
It checks the condition after execution.

### 🔹 Syntax

``` java
do {
    // code to execute
} while (condition);
```

### 🔹 Example

``` java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

------------------------------------------------------------------------

## 💻 Combined Example (All Loops)

``` java
public class LoopDemo {
    public static void main(String[] args) {

        // FOR LOOP
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // WHILE LOOP
        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}
```

------------------------------------------------------------------------

## ⚡ Key Differences

  ------------------------------------------------------------------------
  Loop       Condition      Executes at least     Best Use Case
             Check          once                  
  ---------- -------------- --------------------- ------------------------
  for        Before         ❌ No                 Known number of
                                                  iterations

  while      Before         ❌ No                 Unknown iterations

  do-while   After          ✅ Yes                Must execute at least
                                                  once
  ------------------------------------------------------------------------
