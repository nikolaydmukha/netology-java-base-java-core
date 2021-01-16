package home.netology.javabase.collections.treeset.products;

import java.util.Comparator;
import java.util.Map;

public class ProductComparator implements Comparator<Product> {

    Map<String, Double> relevantMap;

    public ProductComparator(Map<String, Double> relevantMap) {
        this.relevantMap = relevantMap;
    }

    @Override
    public int compare(Product o1, Product o2) {
        double product1 = relevantMap.get(o1.getName());
        double product2 = relevantMap.get(o2.getName());
        if (product1 > product2) {
            return 1;
        } else if (product1 == product2) {
            return 0;
        }
        return -1;
    }
}
