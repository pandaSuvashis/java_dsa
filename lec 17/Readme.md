# Java Abstraction - Complete Detailed README & Notes

# Table of Contents

1. Introduction to Abstraction
2. What is Abstraction?
3. Real-Life Examples
4. Why Do We Need Abstraction?
5. Types of Abstraction
6. Abstract Class
7. Abstract Methods
8. Rules of Abstract Class
9. Rules of Abstract Methods
10. Concrete Methods
11. Constructors in Abstract Class
12. Variables in Abstract Class
13. Example Programs
14. Abstraction vs Encapsulation
15. Abstraction vs Interface
16. Interfaces in Java
17. Multiple Inheritance Using Interface
18. Runtime Polymorphism with Abstraction
19. Important Interview Questions
20. Advantages of Abstraction
21. Disadvantages of Abstraction
22. Real-World Use Cases
23. Complete Notes Section
24. Final Revision Notes

---

# 1. Introduction to Abstraction

Abstraction is one of the four major pillars of OOPs:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

Abstraction is used to hide implementation details and show only the important functionality to the user.

---

# 2. What is Abstraction?

## Definition

> Abstraction means hiding internal implementation details and showing only essential features.

---

# Easy Understanding

You use many things daily without knowing their internal working.

Examples:

* Car
* Mobile Phone
* ATM
* TV Remote

You only know HOW TO USE them.
You do not know how they internally work.

This is abstraction.

---

# Example: Car

You know:

* Start car
* Stop car
* Accelerate
* Brake

But you don't know:

* Engine mechanism
* Fuel injection process
* Gear synchronization

Important functionality is shown.
Complex implementation is hidden.

---

# 3. Real-Life Examples

| Real Object    | Hidden Details                  |
| -------------- | ------------------------------- |
| ATM            | Banking server operations       |
| Mobile Phone   | Internal hardware communication |
| TV Remote      | Signal processing               |
| Coffee Machine | Internal heating system         |
| Car            | Engine system                   |

---

# 4. Why Do We Need Abstraction?

Abstraction is needed because:

* Reduces complexity
* Improves security
* Makes code easier to use
* Hides unnecessary details
* Improves maintainability
* Helps in large applications

---

# 5. Types of Abstraction in Java

Java achieves abstraction in two ways:

| Type           | Description         |
| -------------- | ------------------- |
| Abstract Class | Partial abstraction |
| Interface      | Full abstraction    |

---

# 6. Abstract Class

## Definition

A class declared using the `abstract` keyword is called an abstract class.

---

# Syntax

```java
abstract class Animal {

}
```

---

# Important Points

* Cannot create object of abstract class
* Can contain abstract methods
* Can contain normal methods
* Can contain constructors
* Can contain variables

---

# Example

```java
abstract class Animal {

    abstract void sound();
}
```

---

# 7. Abstract Methods

## Definition

A method without body is called abstract method.

---

# Syntax

```java
abstract void sound();
```

---

# Important Points

* No method body
* Must be inside abstract class or interface
* Child class must implement it

---

# Example Program

```java
abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}
```

---

# Output

```text
Dog barks
```

---

# Step-by-Step Explanation

## Parent Class

```java
abstract class Animal {

    abstract void sound();
}
```

* `Animal` is abstract class
* `sound()` is abstract method

---

## Child Class

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Dog class provides implementation.

---

# 8. Rules of Abstract Class

| Rule                         | Description                |
| ---------------------------- | -------------------------- |
| Must use `abstract` keyword  | Required                   |
| Cannot create object         | `new Animal()` not allowed |
| Can contain abstract methods | Yes                        |
| Can contain normal methods   | Yes                        |
| Can contain constructor      | Yes                        |
| Can contain variables        | Yes                        |

---

# Invalid Example

```java
abstract class Animal {

}

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal();
    }
}
```

---

# Error

```text
Animal is abstract; cannot be instantiated
```

---

# 9. Rules of Abstract Methods

| Rule                                    | Description                |
| --------------------------------------- | -------------------------- |
| No body                                 | Mandatory                  |
| Ends with `;`                           | Required                   |
| Must be overridden                      | Child class responsibility |
| Must be inside abstract class/interface | Required                   |

---

# Invalid Example

```java
abstract void show(){

}
```

---

# Error Reason

Abstract methods cannot have body.

---

# 10. Concrete Methods

Normal methods with body are called concrete methods.

---

# Example

```java
abstract class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}
```

---

# Important Point

Abstract class can contain:

* abstract methods
* normal methods

---

# 11. Constructors in Abstract Class

Yes, abstract class can have constructors.

---

# Example

```java
abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {

}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
    }
}
```

---

# Output

```text
Animal constructor called
```

---

# Why Constructor Needed?

To initialize common data.

---

# 12. Variables in Abstract Class

Abstract classes can contain variables.

---

# Example

```java
abstract class Animal {

    String color = "Black";
}

class Dog extends Animal {

    void display() {
        System.out.println(color);
    }
}
```

---

# 13. Example Programs

# Example 1: Shape Program

```java
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
```

---

# Output

```text
Drawing Circle
Drawing Rectangle
```

---

# Example 2: Bank Program

```java
abstract class Bank {

    abstract int getInterestRate();
}

class SBI extends Bank {

    @Override
    int getInterestRate() {
        return 7;
    }
}

class HDFC extends Bank {

    @Override
    int getInterestRate() {
        return 8;
    }
}
```

---

# 14. Abstraction vs Encapsulation

| Abstraction                             | Encapsulation                    |
| --------------------------------------- | -------------------------------- |
| Hides implementation                    | Hides data                       |
| Focuses on what object does             | Focuses on data protection       |
| Achieved using abstract class/interface | Achieved using private variables |

---

# Example

## Abstraction

```java
abstract class Vehicle {
    abstract void start();
}
```

User only knows start functionality.

---

## Encapsulation

```java
class Student {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

Data is protected.

---

# 15. Abstraction vs Interface

| Abstract Class             | Interface                      |
| -------------------------- | ------------------------------ |
| Partial abstraction        | Full abstraction               |
| Can contain normal methods | Mostly abstract methods        |
| Uses `extends`             | Uses `implements`              |
| Supports constructors      | No constructors                |
| Variables can change       | Variables are final by default |

---

# 16. Interfaces in Java

## Definition

Interface is a blueprint of class.

---

# Syntax

```java
interface Animal {

    void sound();
}
```

---

# Example

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# Output

```text
Dog barks
```

---

# Important Points About Interface

* Cannot create objects
* All methods are public and abstract by default
* Variables are public static final
* Supports multiple inheritance

---

# 17. Multiple Inheritance Using Interface

Java does not support multiple inheritance using classes.

But it supports using interfaces.

---

# Example

```java
interface A {
    void show();
}

interface B {
    void print();
}

class Demo implements A, B {

    public void show() {
        System.out.println("Show method");
    }

    public void print() {
        System.out.println("Print method");
    }
}
```

---

# 18. Runtime Polymorphism with Abstraction

```java
abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}
```

---

# Output

```text
Dog barks
```

---

# Explanation

Reference type:

```java
Animal
```

Object type:

```java
Dog
```

Method call decided at runtime.

---

# 19. Important Interview Questions

# Q1. Can we create object of abstract class?

No.

---

# Q2. Can abstract class contain constructor?

Yes.

---

# Q3. Can abstract class contain normal methods?

Yes.

---

# Q4. Why use abstraction?

To hide implementation details and reduce complexity.

---

# Q5. Difference between interface and abstract class?

Interface provides full abstraction.
Abstract class provides partial abstraction.

---

# Q6. Can abstract method have body?

No.

---

# Q7. Can final method be abstract?

No.

Because:

* abstract method must be overridden
* final method cannot be overridden

---

# 20. Advantages of Abstraction

| Advantage       | Description           |
| --------------- | --------------------- |
| Security        | Hides sensitive logic |
| Simplicity      | Reduces complexity    |
| Flexibility     | Easier modifications  |
| Maintainability | Cleaner code          |
| Reusability     | Better code reuse     |

---

# 21. Disadvantages of Abstraction

| Disadvantage        | Description                        |
| ------------------- | ---------------------------------- |
| More classes        | Increased code size                |
| Complexity          | Can become difficult for beginners |
| Extra design effort | Planning required                  |

---

# 22. Real-World Use Cases

| Domain          | Example           |
| --------------- | ----------------- |
| Banking         | Payment systems   |
| Automobile      | Vehicle controls  |
| Mobile Apps     | API abstraction   |
| Web Development | Frameworks        |
| Games           | Character systems |

---

# 23. Complete Notes Section

# Abstraction Quick Notes

## Definition

Hiding implementation details and showing only functionality.

---

# Achieved Using

* Abstract Class
* Interface

---

# Abstract Class

* Declared using `abstract`
* Cannot create object
* Can contain:

  * abstract methods
  * normal methods
  * constructors
  * variables

---

# Abstract Method

* No body
* Ends with `;`
* Must be overridden

Example:

```java
abstract void show();
```

---

# Interface

* Blueprint of class
* Supports multiple inheritance
* Methods are public abstract by default

---

# Difference

| Abstract Class      | Interface        |
| ------------------- | ---------------- |
| Partial abstraction | Full abstraction |
| extends             | implements       |

---

# Important Keywords

| Keyword    | Use                          |
| ---------- | ---------------------------- |
| abstract   | Create abstract class/method |
| extends    | Inherit class                |
| implements | Implement interface          |
| @Override  | Override method              |

---

# Important Rules

* Cannot create object of abstract class
* Abstract method cannot have body
* Child class must implement abstract methods
* Interface methods are public abstract

---

# 24. Final Revision Notes

# One-Line Definitions

## Abstraction

Hiding implementation and showing only functionality.

---

## Abstract Class

Class declared using abstract keyword.

---

## Abstract Method

Method without body.

---

## Interface

Blueprint of class used for full abstraction.

---

# Most Important Interview Point

## Abstract Class

Can have:

* abstract methods
* normal methods
* constructors
* variables

---

## Interface

Supports multiple inheritance.

---

# Most Common Syntax

```java
abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# End of README
