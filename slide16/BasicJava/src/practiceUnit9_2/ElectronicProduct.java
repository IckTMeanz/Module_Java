package practiceUnit9_2;

public class ElectronicProduct extends Product {
    private int warrantyMonths;
    private double capacityKW;

    public ElectronicProduct(String code, String name, int qty, double price,
                             int warrantyMonths, double capacityKW) {
        super(code, name, qty, price);
        this.warrantyMonths = Math.max(warrantyMonths, 0);
        this.capacityKW = Math.max(capacityKW, 0);
    }

    @Override
    public double getVAT() {
        return unitPrice * 0.10;
    }

    @Override
    public String evaluate() {
        return (quantity < 3) ? "Sold out" : "Not evaluated";
    }
}

