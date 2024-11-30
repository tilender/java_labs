import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private List<Product> products = new ArrayList<>(); // Список товарів у замовленні
    private double totalPrice; // Загальна вартість замовлення
    private String status = "Нове"; // Стандартний статус при створенні замовлення

    public Order(Cart cart) {
        this.products = new ArrayList<>(cart.getProducts()); // Копіювання товарів з кошика
        this.totalPrice = cart.getTotalPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Замовлення:\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Загальна вартість: ").append(totalPrice).append("\n");
        sb.append("Статус: ").append(status);
        return sb.toString();
    }
}
