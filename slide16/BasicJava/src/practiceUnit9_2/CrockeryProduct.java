package practiceUnit9_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrockeryProduct extends Product {
    private String manufacturer;
    private LocalDate arrivalDate;

    public CrockeryProduct(String code, String name, int qty, double price,
                           String manufacturer, LocalDate arrivalDate) {
        super(code, name, qty, price);
        this.manufacturer = manufacturer;
        this.arrivalDate = arrivalDate;
    }

    @Override
    public double getVAT() {
        return unitPrice * 0.10;
    }

    @Override
    public String evaluate() {
        long daysStored = ChronoUnit.DAYS.between(arrivalDate, LocalDate.now());
        if (quantity > 50 && daysStored > 10) return "Slow sale";
        return "Not evaluated";
    }
}

