package org.example;
import org.example.Clothing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClothingTest {


    @Test
    public void testClothingCreation() {

        Clothing clothing = Clothing.builder()
                .name("T-Shirt") //назви продукту
                .size("M") // Встановлення розміру
                .color("Red") // Встановлення кольору
                .build(); // Створення об'єкта

        assertEquals("T-Shirt", clothing.getName());
        assertEquals("M", clothing.getSize());
        assertEquals("Red", clothing.getColor());
    }

    @Test
    public void testValidSize() {
        Clothing clothing = Clothing.builder()
                .name("T-Shirt")
                .size("M")
                .color("Blue")
                .build();

        assertDoesNotThrow(clothing::validateSize);
    }

    @Test
    public void testInvalidSize() {
        Clothing clothing = Clothing.builder()
                .name("T-Shirt")
                .size("XL")
                .color("Green")
                .build();


        assertThrows(IllegalArgumentException.class, clothing::validateSize);
    }
}
