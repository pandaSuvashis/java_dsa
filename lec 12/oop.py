# =========================================================
# COMPLETE OOP CONCEPTS IN PYTHON (ONE FILE)
# =========================================================

from abc import ABC, abstractmethod


# =========================================================
# 1. CLASS AND OBJECT
# =========================================================

class Student:
    school = "ABC School"   # Class Variable

    def __init__(self, name, age):
        self.name = name    # Instance Variable
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")


print("\n===== CLASS & OBJECT =====")
s1 = Student("Rahul", 22)
s1.display()


# =========================================================
# 2. INSTANCE METHOD, CLASS METHOD, STATIC METHOD
# =========================================================

class DemoMethods:

    company = "Google"

    def __init__(self, name):
        self.name = name

    # Instance Method
    def show(self):
        print(f"Employee: {self.name}")

    # Class Method
    @classmethod
    def change_company(cls, new_company):
        cls.company = new_company

    # Static Method
    @staticmethod
    def add(a, b):
        return a + b


print("\n===== METHODS =====")
d1 = DemoMethods("Aman")
d1.show()

DemoMethods.change_company("Microsoft")
print(DemoMethods.company)

print("Addition:", DemoMethods.add(10, 20))


# =========================================================
# 3. ENCAPSULATION
# =========================================================

class BankAccount:

    def __init__(self, balance):
        self.__balance = balance   # Private Variable

    def deposit(self, amount):
        self.__balance += amount

    def show_balance(self):
        print("Balance:", self.__balance)


print("\n===== ENCAPSULATION =====")
b1 = BankAccount(5000)
b1.deposit(2000)
b1.show_balance()


# =========================================================
# 4. INHERITANCE
# =========================================================

class Animal:

    def sound(self):
        print("Animal makes sound")


class Dog(Animal):

    def bark(self):
        print("Dog barks")


print("\n===== INHERITANCE =====")
d1 = Dog()
d1.sound()
d1.bark()


# =========================================================
# 5. MULTIPLE INHERITANCE
# =========================================================

class Father:

    def skills(self):
        print("Programming")


class Mother:

    def talent(self):
        print("Cooking")


class Child(Father, Mother):
    pass


print("\n===== MULTIPLE INHERITANCE =====")
c1 = Child()
c1.skills()
c1.talent()


# =========================================================
# 6. MULTILEVEL INHERITANCE
# =========================================================

class GrandFather:

    def land(self):
        print("Owns Land")


class Father2(GrandFather):

    def house(self):
        print("Owns House")


class Son(Father2):

    def bike(self):
        print("Owns Bike")


print("\n===== MULTILEVEL INHERITANCE =====")
s1 = Son()
s1.land()
s1.house()
s1.bike()


# =========================================================
# 7. POLYMORPHISM (METHOD OVERRIDING)
# =========================================================

class Bird:

    def fly(self):
        print("Bird flies")


class Sparrow(Bird):

    def fly(self):
        print("Sparrow flies fast")


print("\n===== POLYMORPHISM =====")
b1 = Sparrow()
b1.fly()


# =========================================================
# 8. METHOD OVERLOADING (USING DEFAULT ARGUMENTS)
# =========================================================

class Calculator:

    def add(self, a, b, c=0):
        return a + b + c


print("\n===== METHOD OVERLOADING =====")
cal = Calculator()

print(cal.add(2, 3))
print(cal.add(2, 3, 4))


# =========================================================
# 9. ABSTRACTION
# =========================================================

class Vehicle(ABC):

    @abstractmethod
    def start(self):
        pass


class Car(Vehicle):

    def start(self):
        print("Car Started")


print("\n===== ABSTRACTION =====")
c1 = Car()
c1.start()


# =========================================================
# 10. SUPER KEYWORD
# =========================================================

class Parent:

    def __init__(self):
        print("Parent Constructor")


class Child2(Parent):

    def __init__(self):
        super().__init__()
        print("Child Constructor")


print("\n===== SUPER KEYWORD =====")
c2 = Child2()


# =========================================================
# 11. ACCESS MODIFIERS
# =========================================================

class Access:

    def __init__(self):
        self.public = "Public"
        self._protected = "Protected"
        self.__private = "Private"

    def show_private(self):
        print(self.__private)


print("\n===== ACCESS MODIFIERS =====")
a1 = Access()

print(a1.public)
print(a1._protected)

a1.show_private()


# =========================================================
# 12. MAGIC / DUNDER METHODS
# =========================================================

class Book:

    def __init__(self, pages):
        self.pages = pages

    def __str__(self):
        return f"Book with {self.pages} pages"

    def __len__(self):
        return self.pages


print("\n===== DUNDER METHODS =====")
b1 = Book(150)

print(b1)
print(len(b1))


# =========================================================
# 13. OPERATOR OVERLOADING
# =========================================================

class Point:

    def __init__(self, x):
        self.x = x

    def __add__(self, other):
        return self.x + other.x


print("\n===== OPERATOR OVERLOADING =====")
p1 = Point(10)
p2 = Point(20)

print(p1 + p2)


# =========================================================
# 14. COMPOSITION
# =========================================================

class Engine:

    def start(self):
        print("Engine Started")


class Car2:

    def __init__(self):
        self.engine = Engine()


print("\n===== COMPOSITION =====")
car = Car2()
car.engine.start()


# =========================================================
# 15. AGGREGATION
# =========================================================

class Teacher:

    def teach(self):
        print("Teaching")


class Student2:

    def __init__(self, teacher):
        self.teacher = teacher


print("\n===== AGGREGATION =====")
t1 = Teacher()
s2 = Student2(t1)

s2.teacher.teach()


# =========================================================
# 16. GETTER AND SETTER
# =========================================================

class Employee:

    def __init__(self):
        self.__salary = 0

    def set_salary(self, salary):
        self.__salary = salary

    def get_salary(self):
        return self.__salary


print("\n===== GETTER & SETTER =====")
e1 = Employee()

e1.set_salary(50000)

print(e1.get_salary())


# =========================================================
# 17. PROPERTY DECORATOR
# =========================================================

class Product:

    def __init__(self):
        self.__price = 0

    @property
    def price(self):
        return self.__price

    @price.setter
    def price(self, value):
        self.__price = value


print("\n===== PROPERTY DECORATOR =====")
p1 = Product()

p1.price = 999

print(p1.price)


# =========================================================
# 18. MRO (METHOD RESOLUTION ORDER)
# =========================================================

class A:
    pass


class B(A):
    pass


class C(A):
    pass


class D(B, C):
    pass


print("\n===== MRO =====")
print(D.mro())


# =========================================================
# 19. OBJECT INTROSPECTION
# =========================================================

print("\n===== OBJECT INTROSPECTION =====")

print(type(10))
print(isinstance(10, int))
print(issubclass(D, A))


# =========================================================
# 20. FINAL MINI PROJECT (BANK SYSTEM)
# =========================================================

class FinalBank:

    bank_name = "SBI"

    def __init__(self, name, balance):
        self.name = name
        self.__balance = balance

    def deposit(self, amount):
        self.__balance += amount
        print(f"{amount} Deposited")

    def withdraw(self, amount):

        if amount <= self.__balance:
            self.__balance -= amount
            print(f"{amount} Withdrawn")

        else:
            print("Insufficient Balance")

    def show_balance(self):
        print("Current Balance:", self.__balance)


print("\n===== FINAL MINI PROJECT =====")

acc1 = FinalBank("Rahul", 10000)

acc1.deposit(5000)
acc1.withdraw(3000)

acc1.show_balance()


# =========================================================
# END OF FILE
# =========================================================
print("\n===== ALL OOP CONCEPTS COMPLETED =====")