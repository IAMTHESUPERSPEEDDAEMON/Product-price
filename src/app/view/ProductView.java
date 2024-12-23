package app.view;

import java.util.Map;

public class ProductView {
    public void displayMaxPricesPerCategory(Map<String, Double> maxPrices) {
        System.out.println("Maximum price in categories: " + maxPrices);
    }
}