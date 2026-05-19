# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming style where we organize code using **objects** and **classes**.

Java is a **fully object-oriented language** (except primitive types).

---

# Why OOP?

OOP helps to:

* Reuse code
* Make code clean and modular
* Improve security
* Reduce duplication
* Make large applications easier to manage

---

# Core OOP Concepts in Java

There are **4 main pillars** of OOP:

1. Class & Object
2. Encapsulation
3. Inheritance
4. Polymorphism
5. Abstraction

---

# 1. Class and Object

## What is a Class?

A class is a **blueprint/template** for creating objects.

Example:
A `Car` class can contain:

* color
* brand
* speed
* methods like start(), stop()

---

## What is an Object?

An object is a **real instance** of a class.

Example:

* BMW car
* Audi car

Both are objects of class `Car`.

---

## Example

```java
class Car {

    // attributes / variables
    String brand;
    String color;

    // method
    void drive() {
        System.out.println(brand + " is driving");
    }
}

public class Main {
    public static void main(String[] args) {

        // creating object
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.color = "Black";

        System.out.println(c1.brand);
        System.out.println(c1.color);

        c1.drive();
    }
}
```

---

# Memory Representation

```text
Class -> Blueprint

Object -> Actual memory created
```

```java
Car c1 = new Car();
```

* `new` keyword creates object in heap memory
* `c1` stores reference/address

---

# Constructor

A constructor is a special method used to initialize objects.

Rules:

* Constructor name must match class name
* No return type

---

## Example

```java
class Student {

    String name;
    int age;

    // constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 22);

        s1.display();
    }
}
```

---

# Types of Constructors

## 1. Default Constructor

```java
Student() {

}
```

---

## 2. Parameterized Constructor

```java
Student(String name, int age) {

}
```

---

# this Keyword

`this` refers to the current object.

---

## Example

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

---

# 2. Encapsulation

## Definition

Binding data and methods together into a single unit.

OR

Hiding data using private variables.

---

## Why Encapsulation?

* Security
* Data hiding
* Controlled access

---

## Example

```java
class BankAccount {

    private double balance;

    // setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setBalance(5000);

        System.out.println(b1.getBalance());
    }
}
```

---

# Access Modifiers

| Modifier  | Same Class | Same Package | Subclass | Other Package |
| --------- | ---------- | ------------ | -------- | ------------- |
| private   | YES        | NO           | NO       | NO            |
| default   | YES        | YES          | NO       | NO            |
| protected | YES        | YES          | YES      | NO            |
| public    | YES        | YES          | YES      | YES           |

---

# Getter and Setter

## Getter

Used to read value.

```java
getName()
```

---

## Setter

Used to update value.

```java
setName()
```

---

# 3. Inheritance

## Definition

One class acquires properties and methods of another class.

---

# Why Inheritance?

* Code reuse
* Reduces duplication
* Better organization

---

## Example

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.sound();
        d1.bark();
    }
}
```

---

# Types of Inheritance in Java

## Supported

### 1. Single Inheritance

```text
A -> B
```

---

### 2. Multilevel Inheritance

```text
A -> B -> C
```

---

### 3. Hierarchical Inheritance

```text
      A
    /   \
   B     C
```

---

## Not Supported Directly

### Multiple Inheritance using classes

Java avoids ambiguity problem.

But Java supports it using **interfaces**.

---

# super Keyword

Used to refer parent class object.

---

## Example

```java
class Animal {

    String color = "White";
}

class Dog extends Animal {

    String color = "Black";

    void printColor() {
        System.out.println(super.color);
    }
}
```

---

# Method Overriding

When child class provides its own implementation of parent method.

---

## Example

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# 4. Polymorphism

## Definition

Poly = many
Morph = forms

One thing behaving in multiple forms.

---

# Types of Polymorphism

| Type         | Achieved By        |
| ------------ | ------------------ |
| Compile-time | Method Overloading |
| Run-time     | Method Overriding  |

---

# Method Overloading

Same method name with different parameters.

---

## Example

```java
class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

# Run-Time Polymorphism

Achieved using method overriding.

---

## Example

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}
```

Output:

```text
Cat meows
```

Because JVM decides method at runtime.

---

# 5. Abstraction

## Definition

Hiding implementation details and showing only functionality.

Example:

* ATM machine
* Car driving

You use them without knowing internal implementation.

---

# Ways to Achieve Abstraction

1. Abstract Class
2. Interface

---

# Abstract Class

A class declared with `abstract` keyword.

Cannot create objects.

---

## Example

```java
abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# Interface

An interface contains abstract methods.

Used for full abstraction.

---

## Example

```java
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts");
    }
}
```

---

# Difference Between Abstract Class and Interface

| Feature              | Abstract Class    | Interface           |
| -------------------- | ----------------- | ------------------- |
| Methods              | Abstract + Normal | Mostly abstract     |
| Variables            | Any type          | public static final |
| Constructor          | YES               | NO                  |
| Multiple Inheritance | NO                | YES                 |

---

# Important OOP Concepts

# Association

Relationship between two classes.

Example:

```text
Teacher -> Student
```

---

# Aggregation

Weak relationship.

Example:

```text
Department has Teachers
```

Teachers can exist independently.

---

# Composition

Strong relationship.

Example:

```text
House has Rooms
```

Rooms cannot exist without house.

---

# Static Keyword

Belongs to class, not object.

---

## Example

```java
class Student {

    static String college = "ABC College";
}
```

---

# Final Keyword

Used to restrict changes.

| Usage          | Meaning         |
| -------------- | --------------- |
| final variable | constant        |
| final method   | cannot override |
| final class    | cannot inherit  |

---

# Object Class

Parent of all classes in Java.

Common methods:

```java
toString()
equals()
hashCode()
```

---

# Important Interview Questions

## Difference between Overloading and Overriding

| Overloading          | Overriding         |
| -------------------- | ------------------ |
| Same class           | Parent-child class |
| Compile time         | Runtime            |
| Different parameters | Same parameters    |

---

# Difference between Class and Object

| Class     | Object   |
| --------- | -------- |
| Blueprint | Instance |
| Logical   | Physical |

---

# Difference between Abstraction and Encapsulation

| Abstraction                       | Encapsulation          |
| --------------------------------- | ---------------------- |
| Hides implementation              | Hides data             |
| Achieved using abstract/interface | Achieved using private |

---

# Real-Life Example of OOP

## Example: Food Delivery App

### Class

```text
Restaurant
Customer
Order
DeliveryPartner
```

### Objects

```text
KFC
Rahul
Order #101
Ramesh
```

### Inheritance

```text
Vehicle -> Bike
Vehicle -> Car
```

### Encapsulation

Customer bank details hidden.

### Abstraction

User clicks “Order Now” without knowing backend process.

### Polymorphism

Different payment methods:

```text
pay()
UPI
Card
Cash
```

---

# Complete Mini Example

```java
class Employee {

    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name);
        System.out.println(salary);
    }
}

class Developer extends Employee {

    Developer(String name, int salary) {
        super(name, salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Developer d1 = new Developer("Rahul", 50000);

        d1.display();
    }
}
```

---

# Summary
---------------------------------------
| Concept       | Purpose             |
| ------------- | ------------------- |
| Class         | Blueprint           |
| Object        | Real entity         |
| Encapsulation | Data hiding         |
| Inheritance   | Code reuse          |
| Polymorphism  | Many forms          |
| Abstraction   | Hide implementation |

---

# Best Way to Master OOP

Practice by building:

* Bank System
* Library Management
* Student Management
* ATM Machine
* Food Delivery App
* E-commerce Cart

These projects make OOP very clear.
