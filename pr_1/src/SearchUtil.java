import lombok.experimental.UtilityClass;
import java.util.List;

@UtilityClass
public class SearchUtil {

    // Пошук товару за назвою
    public void searchByName(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    // Пошук товару за категорією
    public void searchByCategory(List<Product> products, Category category) {
        for (Product product : products) {
            if (product.getCategory().getName().equalsIgnoreCase(category.getName())) {
                System.out.println(product);
            }
        }
    }
}
