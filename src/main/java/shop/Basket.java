package shop;

import products.Product;

import java.util.ArrayList;

public class Basket {

    private double total;
    private ArrayList<Product> products;

    public Basket() {
        this.total = 0.0;
        this.products = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }
}
