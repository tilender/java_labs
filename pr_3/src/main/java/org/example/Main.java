package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть перше число: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double b = scanner.nextDouble();

            System.out.print("Виберіть операцію (+, -, *, /): ");
            String operation = scanner.next();

            double result;
            switch (operation) {
                case "+":
                    result = Calculator.add(a, b);
                    break;
                case "-":
                    result = Calculator.subtract(a, b);
                    break;
                case "*":
                    result = Calculator.multiply(a, b);
                    break;
                case "/":
                    result = Calculator.divide(a, b);
                    break;
                default:
                    throw new InvalidInputException("Невідома операція.");
            }
            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Помилка вводу: Введені значення мають бути числами.");
        } finally {
            System.out.println("Завершення обробки запиту.");
            scanner.close();
        }
    }
}
