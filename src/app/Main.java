package app;

import app.model.Product;
import app.view.ProductView;
import app.controller.ProductController;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0)
        );

        ProductView view = new ProductView();

        ProductController controller = new ProductController(products,view);

        controller.findAndDisplayMaxPricesByCategory();

    }
}