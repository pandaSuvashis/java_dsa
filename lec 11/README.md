# BasicMath.java

A simple Java program that demonstrates common number-based operations using loops and basic arithmetic.

## What this program does

This class contains methods for:

- printing the digits of a number
- counting digits
- summing digits
- reversing a number
- checking palindrome numbers
- checking prime numbers
- finding GCD and LCM
- checking Armstrong numbers
- checking perfect numbers
- printing all primes up to a limit

---

## Class Name

`BasicMath`

---

## Methods

### 1. `PrintNumbers(int num)`
Prints each digit of the given number one by one.

**Example:**
`12345` → `5 4 3 2 1`  
This works because the method extracts digits from the last digit using `% 10`.

---

### 2. `CountDigits(int num)`
Counts how many digits are present in the given number.

**Example:**
`12345` → `5`

---

### 3. `SumOfDigits(int num)`
Adds all digits of the number.

**Example:**
`12345` → `1 + 2 + 3 + 4 + 5 = 15`

---

### 4. `ReverseNumbers(int num)`
Reverses the digits of the given number.

**Example:**
`12345` → `54321`

---

### 5. `Palindrome(int num)`
Checks whether the number is a palindrome.

A palindrome number reads the same forward and backward.

**Example:**
`1221` → `true`  
`1234` → `false`

---

### 6. `CheckPrime(int num)`
Checks whether the given number is prime.

A prime number is divisible only by `1` and itself.

**Returns:**
- `true` if prime
- `false` if not prime

**Example:**
`21` → `false`  
`13` → `true`

---

### 7. `GCD(int num1, int num2)`
Finds the Greatest Common Divisor using the Euclidean algorithm.

**Example:**
`GCD(18, 12)` → `6`

---

### 8. `LCM(int num1, int num2)`
Finds the Least Common Multiple using:

`LCM = (num1 * num2) / GCD`

**Example:**
`LCM(18, 12)` → `36`

---

### 9. `Armstrong(int num)`
Checks whether a number is an Armstrong number.

For a 3-digit Armstrong number, the sum of the cubes of its digits equals the number itself.

**Example:**
`153` → `1^3 + 5^3 + 3^3 = 153`

---

### 10. `PerfectNumber(int num)`
Checks whether the number is a perfect number.

A perfect number is equal to the sum of its proper divisors.

**Example:**
`6` → `1 + 2 + 3 = 6`

---

### 11. `printPrimes(int num)`
Prints all prime numbers from `2` to `num`.

**Example:**
`printPrimes(10)` → `2 3 5 7`

---

## `main()` Method

The `main()` method runs and tests all the above functions with sample inputs:

- `PrintNumbers(12345)`
- `CountDigits(12345)`
- `SumOfDigits(12345)`
- `ReverseNumbers(12345)`
- `Palindrome(1221)`
- `CheckPrime(21)`
- `GCD(18, 12)`
- `LCM(18, 12)`
- `Armstrong(153)`
- `PerfectNumber(6)`
- `printPrimes(10)`

---

## Output Style

The program prints results directly to the console using `System.out.println()` and `System.out.print()`.

---

## How to Run

1. Save the file as `BasicMath.java`
2. Compile it:

```bash
javac BasicMath.java
```

3. Run it:

```bash
java BasicMath
```

---

## Notes

- The `CheckPrime()` method uses `Math.sqrt(num)` for better performance.
- The `LCM()` method depends on the GCD calculation.
- Some methods like `PerfectNumber()` and `Armstrong()` are written for basic learning purposes and can be improved for edge cases.

---

## Example Console Output

Running the program will display results for each method in the terminal.

---

## Purpose

This program is useful for beginners learning:

- loops
- conditional statements
- number manipulation
- function writing in Java
- basic algorithmic thinking
