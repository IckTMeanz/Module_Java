package practiceUnit9_3;

public class Car extends Vehicle {
    private int seatCount;
    private String engineType;

    public Car(String number, String manufacturer, int year, String color, VehicleOwner owner,
               int seatCount, String engineType) {
        super(number, manufacturer, year, color, owner);
        this.seatCount = seatCount;
        this.engineType = engineType;
    }

    @Override
    public String getType() { return "Car"; }
}

