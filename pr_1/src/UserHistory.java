import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserHistory {
    private List<Order> orderHistory = new ArrayList<>(); // Список замовлень користувача

    // Додаємо нове замовлення до історії
    public void addOrder(Order order) {
        this.orderHistory.add(order);
    }

    // Показуємо всю історію замовлень
    public void showOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("Історія замовлень порожня.");
        } else {
            for (Order order : orderHistory) {
                System.out.println(order.toString());
                System.out.println("------------------------");
            }
        }
    }
}
