package app;

import app.controller.ProductController;



public class Main {
    public static void main(String[] args) {

        ProductController controller = new ProductController();
        controller.findAndDisplayMaxPricesByCategory();

    }
}