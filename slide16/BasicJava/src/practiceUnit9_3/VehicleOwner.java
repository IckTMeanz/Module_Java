package practiceUnit9_3;

public class VehicleOwner {
    private String id; // cmnd (12 số)
    private String name;
    private String email;

    public VehicleOwner(String id, String name, String email) {
        if (!id.matches("\\d{12}")) throw new IllegalArgumentException("CMND phải 12 số");
        if (!email.matches("\\w+@\\w+(\\.\\w+)+")) throw new IllegalArgumentException("Email không hợp lệ");
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}

