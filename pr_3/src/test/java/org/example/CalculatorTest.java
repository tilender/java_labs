package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0), "Додавання двох чисел не працює правильно");
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, Calculator.subtract(3.0, 2.0), "Віднімання двох чисел не працює правильно");
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0), "Множення двох чисел не працює правильно");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0), "Ділення двох чисел не працює правильно");
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1.0, 0.0), "Очікується виключення при діленні на нуль");
    }
}
