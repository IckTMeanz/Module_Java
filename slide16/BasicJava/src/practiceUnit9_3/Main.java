package practiceUnit9_3;

public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();

        VehicleOwner a = new VehicleOwner("123456789012", "Nguyen Van A", "a@gmail.com");
        VehicleOwner b = new VehicleOwner("234567890123", "Tran Thi B", "b@gmail.com");

        Vehicle car = new Car("A1234", "Toyota", 2020, "Red", a, 4, "Gasoline");
        Vehicle bike = new Motorbike("B5678", "Honda", 2022, "Black", b, 150);
        Vehicle truck = new Truck("C9999", "Suzuki", 2021, "White", a, 5.5);

        manager.addVehicle(car);
        manager.addVehicle(bike);
        manager.addVehicle(truck);

        System.out.println("Tìm xe theo số: " + manager.searchByNumber("B5678").getType());
        System.out.println("Xe của A: " + manager.findByOwner("123456789012").size());
        manager.deleteByManufacturer("Honda");
        System.out.println("Hãng có nhiều xe nhất: " + manager.mostOwnedManufacturer());
        manager.sortByDescendingCount();
        manager.typeStatistics();
    }
}

