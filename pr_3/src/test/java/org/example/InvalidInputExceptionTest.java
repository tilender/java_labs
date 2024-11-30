package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalidInputExceptionTest {

    @Test
    void testInvalidInputExceptionMessage() {
        String message = "Невідома операція";
        InvalidInputException exception = new InvalidInputException(message);
        assertEquals(message, exception.getMessage(), "Повідомлення про помилку не співпадає");
    }
}
