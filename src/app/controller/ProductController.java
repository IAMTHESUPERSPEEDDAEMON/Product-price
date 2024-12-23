package app.controller;

import app.entity.Product;
import app.view.ProductView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductController {
    private List<Product> products;
    private ProductView view;


    public ProductController(List<Product> products) {
        this.products = products;
        this.view = new ProductView();

    }
    public void findAndDisplayMaxPricesByCategory() {
        Map<String, Double> maxPrices = calculateMaxPricesByCategory();
        view.displayMaxPricesPerCategory(maxPrices);
    }

    private Map<String, Double> calculateMaxPricesByCategory() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.collectingAndThen(
                        Collectors.maxBy((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())),
                        maxProduct -> maxProduct.map(Product::getPrice).orElse(0.0)
                )));
    }
}
