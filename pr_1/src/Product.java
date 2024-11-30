import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id; // Унікальний ідентифікатор товару
    private String name; // Назва товару
    private double price; // Ціна товару
    private String description; // Опис товару
    private Category category; // Категорія товару

    @Override
    public String toString() {
        return "ID: " + id + ", Товар: " + name + ", Ціна: " + price + ", Категорія: " + category.getName() + ", Опис: " + description;
    }
}
