package org.example;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // Створення об'єкта Electronics
        Electronics electronics = Electronics.builder()
                .name(faker.commerce().productName()) // випадкова назва
                .brand(faker.company().name()) // Генеруємо випадкову назву компанії для бренду
                .model(faker.code().ean8()) // випадковий код моделі
                .build();

        Clothing clothing = Clothing.builder()
                .name(faker.commerce().productName())
                .size(faker.number().digit())
                .color(faker.color().name())
                .build();

        System.out.println("Electronics: " + electronics);
        System.out.println("Clothing: " + clothing);
    }
}
