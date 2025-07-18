package practiceUnit9_2;

public abstract class Product {
    protected String productCode;
    protected String name;
    protected int quantity;
    protected double unitPrice;

    public Product(String productCode, String name, int quantity, double unitPrice) {
        this.productCode = productCode;
        this.name = name;
        this.quantity = Math.max(quantity, 0);
        this.unitPrice = unitPrice;
    }

    public abstract double getVAT(); // Phương thức tính VAT
    public abstract String evaluate(); // Đánh giá tiêu thụ
    public String getProductCode() { return productCode; }
}

