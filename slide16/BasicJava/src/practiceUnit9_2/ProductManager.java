package practiceUnit9_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public boolean addProduct(Product p) {
        for (Product prod : products) {
            if (prod.getProductCode().equals(p.getProductCode())) {
                return false; // Trùng mã
            }
        }
        products.add(p);
        return true;
    }

    public void evaluateAll() {
        for (Product p : products) {
            System.out.println(p.getProductCode() + ": " + p.evaluate());
        }
    }
}
