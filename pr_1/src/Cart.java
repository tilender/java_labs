import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products; // Список товарів у кошику
    private double totalPrice; // Загальна ціна товарів у кошику

    public Cart() {
        this.products = new ArrayList<>(); // Ініціалізація списку товарів
        this.totalPrice = 0.0;
    }

    // Додаємо товар до кошика
    public void addProduct(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    // Видаляємо товар з кошика за ID
    public void removeProduct(int productId) {
        Product toRemove = null;
        for (Product product : products) {
            if (product.getId() == productId) {
                toRemove = product;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            totalPrice -= toRemove.getPrice();
        } else {
            System.out.println("Товар не знайдено!");
        }
    }

    // Отримуємо список товарів у кошику
    public List<Product> getProducts() {
        return products;
    }

    // Отримуємо загальну ціну товарів у кошику
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Кошик:\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Загальна ціна: ").append(totalPrice);
        return sb.toString();
    }
}
