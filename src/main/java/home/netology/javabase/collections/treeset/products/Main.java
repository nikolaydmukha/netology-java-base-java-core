package home.netology.javabase.collections.treeset.products;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("samsung tv", BigDecimal.valueOf(55_000));
        Product product2 = new Product("radio sony", BigDecimal.valueOf(10_000));
        Product product3 = new Product("apple ipad", BigDecimal.valueOf(22_000));
        Product product4 = new Product("lg tv", BigDecimal.valueOf(50_000));
        Product product5 = new Product("apple iphone", BigDecimal.valueOf(85_000));

        Map<String, Double> relevantMap = new HashMap<>();
        relevantMap.put(product1.getName(), 2D);
        relevantMap.put(product2.getName(), 0.1D);
        relevantMap.put(product3.getName(), 0.2D);
        relevantMap.put(product4.getName(), 3D);
        relevantMap.put(product5.getName(), 1D);

        Set<Product> products = new TreeSet<>(new ProductComparator(relevantMap).reversed());

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        printTop3(products);

    }

    public static void printTop3(Set<Product> products) {
        Product[] productsArray = products.toArray(new Product[0]);
        System.out.println("Рекомендуем вам посмотреть также следующие товары:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s\n", i+1, productsArray[i]);
        }
    }
}
