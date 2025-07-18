package practiceUnit9_2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);

        // Thêm 1 sản phẩm thực phẩm
        Product food = new FoodProduct("F01", "Milk", 10, 20000,
                LocalDate.of(2024, 7, 1),
                LocalDate.of(2024, 8, 1),
                "Vinamilk");

        // Thêm 1 đồ điện
        Product elec = new ElectronicProduct("E01", "Kettle", 2, 500000, 12, 2.0);

        // Thêm 1 đồ gốm
        Product crock = new CrockeryProduct("C01", "Ceramic Bowl", 60, 100000,
                "Minh Long", LocalDate.now().minusDays(11));

        manager.addProduct(food);
        manager.addProduct(elec);
        manager.addProduct(crock);

        System.out.println("Kết quả đánh giá:");
        manager.evaluateAll();
    }
}

