package app;

import app.model.ProductModel;
import app.controller.ProductController;



public class Main {
    public static void main(String[] args) {
        ProductModel productModel = new ProductModel();

        ProductController controller = new ProductController(productModel.getProducts());

        controller.findAndDisplayMaxPricesByCategory();

    }
}