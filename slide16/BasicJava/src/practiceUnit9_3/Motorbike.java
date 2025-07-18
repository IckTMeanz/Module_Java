package practiceUnit9_3;

public class Motorbike extends Vehicle {
    private int capacity; // phân khối

    public Motorbike(String number, String manufacturer, int year, String color, VehicleOwner owner, int capacity) {
    	super(number, manufacturer, year, color, owner);
        this.capacity = capacity;
    }

    @Override
    public String getType() { return "Motorbike"; }
}


