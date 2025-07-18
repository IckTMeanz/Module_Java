package practiceUnit9_3;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String number, String manufacturer, int year, String color, VehicleOwner owner,
                 double tonnage) {
        super(number, manufacturer, year, color, owner);
        this.tonnage = tonnage;
    }

    @Override
    public String getType() { return "Truck"; }
}

