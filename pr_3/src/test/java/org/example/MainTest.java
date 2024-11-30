package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainAddition() {
        String input = "2\n3\n+\n"; // Ввід для тесту: перше число, друге число, операція
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{}); // Викликаємо головний метод

        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Результат: 5.0"), "Операція додавання в Main не працює правильно");
    }

    @Test
    void testMainInvalidOperation() {
        String input = "2\n3\n#\n"; // Невідома операція
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{}); // Викликаємо головний метод

        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Помилка: Невідома операція."), "Обробка невідомої операції не працює");
    }

    @Test
    void testMainDivisionByZero() {
        String input = "2\n0\n/\n"; // Ділення на нуль
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{}); // Викликаємо головний метод

        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Помилка: Ділення на нуль неможливе."), "Обробка ділення на нуль не працює");
    }
}
