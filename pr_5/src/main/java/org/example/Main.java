package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "TTEST"; // Вхідний рядок для перевірки

        // Створення нового екземпляра кінцевого автомата
        FiniteStateMachine fsm = new FiniteStateMachine();

        // Проходимо по кожному символу вхідного рядка
        for (char c : input.toCharArray()) {
            fsm.process(c); // Обробка символу

            // Виводимо оброблений символ і поточний стан автомата
            System.out.println("Processed '" + c + "', Current State: " + fsm.getCurrentState());
        }

        // Виводимо фінальний стан автомата після обробки всіх символів
        System.out.println("Final State: " + fsm.getCurrentState());

        // Перевіряємо, чи знайдено слово "TEST" (стан F)
        System.out.println("Is 'TEST' found: " + fsm.isFinal());
    }
}
