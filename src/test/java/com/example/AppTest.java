package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the App class.
 */
class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    @DisplayName("getGreeting returns expected message")
    void testGetGreeting() {
        assertEquals("Hello from Java with Gradle!", app.getGreeting());
    }

    @Nested
    @DisplayName("Math operations")
    class MathOperations {

        @Test
        @DisplayName("add returns correct sum")
        void testAdd() {
            assertEquals(8, app.add(5, 3));
            assertEquals(0, app.add(-5, 5));
            assertEquals(-8, app.add(-5, -3));
        }

        @Test
        @DisplayName("subtract returns correct difference")
        void testSubtract() {
            assertEquals(2, app.subtract(5, 3));
            assertEquals(-10, app.subtract(-5, 5));
            assertEquals(-2, app.subtract(-5, -3));
        }

        @Test
        @DisplayName("multiply returns correct product")
        void testMultiply() {
            assertEquals(15, app.multiply(5, 3));
            assertEquals(-25, app.multiply(-5, 5));
            assertEquals(15, app.multiply(-5, -3));
            assertEquals(0, app.multiply(5, 0));
        }

        @Test
        @DisplayName("divide returns correct quotient")
        void testDivide() {
            assertEquals(2, app.divide(6, 3));
            assertEquals(-2, app.divide(-6, 3));
            assertEquals(2, app.divide(-6, -3));
        }

        @Test
        @DisplayName("divide by zero throws exception")
        void testDivideByZero() {
            IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> app.divide(5, 0)
            );
            assertEquals("Cannot divide by zero", exception.getMessage());
        }
    }

    @Nested
    @DisplayName("Prime number checks")
    class PrimeNumberChecks {

        @Test
        @DisplayName("isPrime returns true for prime numbers")
        void testIsPrimeTrue() {
            assertTrue(app.isPrime(2));
            assertTrue(app.isPrime(3));
            assertTrue(app.isPrime(5));
            assertTrue(app.isPrime(7));
            assertTrue(app.isPrime(11));
            assertTrue(app.isPrime(13));
            assertTrue(app.isPrime(97));
        }

        @Test
        @DisplayName("isPrime returns false for non-prime numbers")
        void testIsPrimeFalse() {
            assertFalse(app.isPrime(0));
            assertFalse(app.isPrime(1));
            assertFalse(app.isPrime(4));
            assertFalse(app.isPrime(6));
            assertFalse(app.isPrime(9));
            assertFalse(app.isPrime(100));
        }

        @Test
        @DisplayName("isPrime returns false for negative numbers")
        void testIsPrimeNegative() {
            assertFalse(app.isPrime(-1));
            assertFalse(app.isPrime(-7));
        }
    }

    @Nested
    @DisplayName("Factorial calculations")
    class FactorialCalculations {

        @Test
        @DisplayName("factorial returns correct values")
        void testFactorial() {
            assertEquals(1, app.factorial(0));
            assertEquals(1, app.factorial(1));
            assertEquals(2, app.factorial(2));
            assertEquals(6, app.factorial(3));
            assertEquals(24, app.factorial(4));
            assertEquals(120, app.factorial(5));
            assertEquals(3628800, app.factorial(10));
        }

        @Test
        @DisplayName("factorial throws exception for negative numbers")
        void testFactorialNegative() {
            IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> app.factorial(-1)
            );
            assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
        }
    }
}
