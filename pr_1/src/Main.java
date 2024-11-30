import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Оголошення товарів і категорій
        Category electronics = new Category("Електроніка");
        Category clothing = new Category("Одяг");

        Product product1 = new Product(1, "Телефон", 100.0, "Опис телефону", electronics);
        Product product2 = new Product(2, "Футболка", 20.0, "Опис футболки", clothing);
        Product product3 = new Product(3, "Ноутбук", 800.0, "Опис ноутбука", electronics);

        Cart cart = new Cart();
        UserHistory userHistory = new UserHistory();

        while (true) {
            System.out.println("\nВиберіть опцію:");
            System.out.println("1 - Переглянути список товарів");
            System.out.println("2 - Додати товар до кошика");
            System.out.println("3 - Видалити товар з кошика");
            System.out.println("4 - Переглянути кошик");
            System.out.println("5 - Оформити замовлення");
            System.out.println("6 - Переглянути історію замовлень");
            System.out.println("7 - Пошук товару за назвою");
            System.out.println("8 - Пошук товару за категорією");
            System.out.println("0 - Вийти");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(product1);
                    System.out.println(product2);
                    System.out.println(product3);
                    break;
                case 2:
                    System.out.println("Введіть ID товару для додавання до кошика:");
                    int id = scanner.nextInt();
                    if (id == 1) cart.addProduct(product1);
                    else if (id == 2) cart.addProduct(product2);
                    else if (id == 3) cart.addProduct(product3);
                    else System.out.println("Товар з таким ID не знайдено");
                    break;
                case 3:
                    System.out.println("Введіть ID товару для видалення з кошика:");
                    int removeId = scanner.nextInt();
                    cart.removeProduct(removeId);
                    break;
                case 4:
                    System.out.println(cart);
                    break;
                case 5:
                    Order order = new Order(cart);
                    userHistory.addOrder(order);
                    System.out.println("Замовлення оформлено!");
                    cart = new Cart(); // Очищення кошика після оформлення замовлення
                    break;
                case 6:
                    userHistory.showOrderHistory();
                    break;
                case 7:
                    System.out.println("Введіть назву товару для пошуку:");
                    String name = scanner.next();
                    SearchUtil.searchByName(List.of(product1, product2, product3), name);
                    break;
                case 8:
                    System.out.println("Введіть назву категорії для пошуку:");
                    String categoryName = scanner.next();
                    Category searchCategory = new Category(categoryName);
                    SearchUtil.searchByCategory(List.of(product1, product2, product3), searchCategory);
                    break;
                case 0:
                    System.out.println("Дякуємо, що використовували наш магазин!");
                    return;
                default:
                    System.out.println("Невідома опція. Спробуйте ще раз.");
                    break;
            }
        }
    }
}
