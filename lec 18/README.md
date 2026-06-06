# Java Collections Practice

## Overview

This project contains practice programs for:

- ArrayList
- LinkedList
- Stack
- Queue
- Vector

The goal is to learn the Java Collections Framework, understand commonly used methods, and prepare for coding interviews and placement tests.

---

# Java Collections Hierarchy

```text
Iterable
   │
Collection
   │
   ├── List
   │     ├── ArrayList
   │     ├── LinkedList
   │     ├── Vector
   │     └── Stack
   │
   └── Queue
         ├── LinkedList
         └── PriorityQueue
```

---

# ArrayList

## Features

- Dynamic array
- Fast random access
- Maintains insertion order
- Allows duplicates

## Common Methods

```java
add()
get()
set()
remove()
contains()
size()
isEmpty()
indexOf()
lastIndexOf()
toArray()
clone()
clear()
Collections.sort()
ensureCapacity()
```

---

# LinkedList

## Features

- Doubly linked list
- Fast insertion and deletion
- Maintains insertion order
- Allows duplicates
- Can be used as Queue and Stack

## Common Methods

```java
add()
addFirst()
addLast()
get()
getFirst()
getLast()
remove()
removeFirst()
removeLast()
contains()
clone()
toArray()
```

---

# Stack

## Features

- LIFO (Last In First Out)

## Common Methods

```java
push()
pop()
peek()
search()
empty()
```

Example:

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());
```

Output:

```text
30
```

---

# Queue

## Features

- FIFO (First In First Out)

## Common Methods

```java
offer()
poll()
peek()
isEmpty()
size()
```

Example:

```java
Queue<Integer> queue = new LinkedList<>();

queue.offer(10);
queue.offer(20);
queue.offer(30);

System.out.println(queue.poll());
```

Output:

```text
10
```

---

# Vector

## Features

- Dynamic array
- Thread-safe (synchronized)
- Maintains insertion order
- Allows duplicates

## Common Methods

```java
add()
get()
set()
remove()
capacity()
ensureCapacity()
firstElement()
lastElement()
clone()
clear()
```

---

# Iterator Example

```java
Iterator<Integer> it = list.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
```

---

# Sorting Collections

Ascending Order:

```java
Collections.sort(list);
```

Descending Order:

```java
Collections.sort(list, Collections.reverseOrder());
```

---

# Clone vs Copy Constructor

Clone:

```java
ArrayList<Integer> copy =
    (ArrayList<Integer>) list.clone();
```

Copy Constructor:

```java
ArrayList<Integer> copy =
    new ArrayList<>(list);
```

Recommended: Use the copy constructor.

---

# ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|----------|----------|----------|
| Access | Fast O(1) | Slow O(n) |
| Insert/Delete | Slow | Fast |
| Memory | Less | More |

---

# ArrayList vs Vector

| Feature | ArrayList | Vector |
|----------|-----------|---------|
| Thread Safe | No | Yes |
| Performance | Faster | Slower |
| Modern Usage | Preferred | Legacy |

---

# Stack vs Queue

| Stack | Queue |
|---------|---------|
| LIFO | FIFO |
| push() | offer() |
| pop() | poll() |
| peek() | peek() |

---

# Key Takeaways

- Use ArrayList for fast access.
- Use LinkedList for frequent insertion/deletion.
- Use Stack for LIFO operations.
- Use Queue for FIFO operations.
- Use Vector only when synchronization is required.
- Prefer interfaces:

```java
List<Integer> list = new ArrayList<>();
Queue<Integer> queue = new LinkedList<>();
```

---

## Author

Suvashis Panda

Java Collections Framework Practice & Interview Preparation 🚀
