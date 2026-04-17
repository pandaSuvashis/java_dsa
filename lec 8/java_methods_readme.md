# Java Methods Explained Simply

## What is a Method?

A method in Java is like a small machine that does one specific job. You
give it some input, it works on it, and sometimes it gives you back a
result.

Think of it like making tea: - You follow steps - You use ingredients -
You get tea at the end

That whole process is like a method.

------------------------------------------------------------------------

## Basic Syntax

``` java
returnType methodName(parameters) {
    // code
}
```

Example:

``` java
int add(int a, int b) {
    return a + b;
}
```

------------------------------------------------------------------------

## Types of Methods

### 1. Predefined Methods

These are already written in Java.

Example:

``` java
Math.max(10, 20);
```

### 2. User Defined Methods

You create these methods.

Example:

``` java
void greet() {
    System.out.println("Hello!");
}
```

------------------------------------------------------------------------

## Method Parameters

Parameters are inputs to a method.

Example:

``` java
void display(String name) {
    System.out.println(name);
}
```

------------------------------------------------------------------------

## Return Type

A method can return a value.

Example:

``` java
int square(int x) {
    return x * x;
}
```

If a method does not return anything, we use:

``` java
void sayHi() {
    System.out.println("Hi");
}
```

------------------------------------------------------------------------

## Method Overloading

You can have multiple methods with the same name but different
parameters.

Example:

``` java
int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}
```

------------------------------------------------------------------------

## Static vs Non Static Methods

### Static Method

Belongs to the class.

``` java
static void show() {
    System.out.println("Static method");
}
```

### Non Static Method

Belongs to an object.

``` java
void display() {
    System.out.println("Instance method");
}
```

------------------------------------------------------------------------

## Recursion

A method calling itself.

Example:

``` java
int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n - 1);
}
```

------------------------------------------------------------------------

## Why Methods are Important

-   Makes code reusable
-   Reduces repetition
-   Makes code easier to read
-   Helps in debugging

------------------------------------------------------------------------

## Final Thoughts

Methods are the building blocks of Java programs. Once you understand
methods well, everything else in Java becomes much easier.

Keep practicing by writing small methods every day.
