package practiceUnit9_3;

public abstract class Vehicle {
    protected String number;  // mã số 5 ký tự duy nhất
    protected String manufacturer; // Honda, Yamaha, Toyota, Suzuki
    protected int year;
    protected String color;
    protected VehicleOwner owner;

    public Vehicle(String number, String manufacturer, int year, String color, VehicleOwner owner) {
        if (!number.matches("\\w{5}")) throw new IllegalArgumentException("Số xe phải 5 ký tự");
        if (!manufacturer.matches("(?i)Honda|Yamaha|Toyota|Suzuki"))
            throw new IllegalArgumentException("NSX không hợp lệ");
        if (year < 2000 || year > java.time.LocalDate.now().getYear())
            throw new IllegalArgumentException("Năm sản xuất không hợp lệ");
        this.number = number;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.owner = owner;
    }

    public String getNumber() { return number; }
    public String getManufacturer() { return manufacturer; }
    public VehicleOwner getOwner() { return owner; }

    public abstract String getType(); // "Car", "Motorbike", "Truck"
}

