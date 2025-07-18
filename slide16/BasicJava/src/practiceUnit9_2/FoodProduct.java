package practiceUnit9_2;

import java.time.LocalDate;

public class FoodProduct extends Product {
    private LocalDate manufactureDate;
    private LocalDate expiryDate;
    private String supplier;

    public FoodProduct(String code, String name, int qty, double price,
                       LocalDate mfgDate, LocalDate expDate, String supplier) {
        super(code, name, qty, price);
        if (expDate.isBefore(mfgDate)) throw new IllegalArgumentException("HSD phải sau NSX");
        this.manufactureDate = mfgDate;
        this.expiryDate = expDate;
        this.supplier = supplier;
    }

    @Override
    public double getVAT() {
        return unitPrice * 0.05;
    }

    @Override
    public String evaluate() {
        if (quantity > 0 && expiryDate.isBefore(LocalDate.now())) return "Hard to sell";
        return "Not evaluated";
    }
}

