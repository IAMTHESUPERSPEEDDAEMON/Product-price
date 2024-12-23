package app.controller;

import app.entity.Product;
import app.model.ProductModel;
import app.view.ProductView;

import java.util.List;
import java.util.Map;

public class ProductController {
    private List<Product> products;
    private ProductView view;


    public ProductController() {
        this.products = new ProductModel().getProducts();
        this.view = new ProductView();

    }
    public void findAndDisplayMaxPricesByCategory() {
        Map<String, Double> maxPrices = ProductModel.calculateMaxPricesByCategory(products);
        view.displayMaxPricesPerCategory(maxPrices);
    }

}
