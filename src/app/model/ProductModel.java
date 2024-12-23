package app.model;

import app.entity.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductModel {
    public List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 1200.0),
            new Product("Coffee Maker", "Appliances", 80.0),
            new Product("Headphones", "Electronics", 150.0),
            new Product("Blender", "Appliances", 50.0)
    );

    public List<Product> getProducts() {
        return products;
    }

    public static Map<String, Double> calculateMaxPricesByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.collectingAndThen(
                        Collectors.maxBy((p1, p2) ->
                                Double.compare(p1.getPrice(), p2.getPrice())),
                        maxProduct -> maxProduct.map(Product::getPrice).orElse(0.0)
                )));
    }

}
