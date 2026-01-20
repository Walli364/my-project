package com.example;

/**
 * Main application class for CI/CD practice.
 */
public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("Sum of 5 and 3: " + app.add(5, 3));
        System.out.println("Is 7 prime? " + app.isPrime(7));
    }

    /**
     * Returns a greeting message.
     */
    public String getGreeting() {
        return "Hello from Java with Gradle!";
    }

    /**
     * Adds two numbers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second number from first.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides first number by second.
     * @throws IllegalArgumentException if divisor is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Checks if a number is prime.
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns factorial of a number.
     * @throws IllegalArgumentException if n is negative
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n <= 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
