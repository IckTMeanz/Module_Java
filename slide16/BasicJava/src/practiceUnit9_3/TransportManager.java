package practiceUnit9_3;

import java.util.*;
import java.util.stream.Collectors;

public class TransportManager {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle v) {
        for (Vehicle existing : vehicles) {
            if (existing.getNumber().equals(v.getNumber()))
                return false; // trùng số xe
        }
        vehicles.add(v);
        return true;
    }

    public Vehicle searchByNumber(String number) {
        return vehicles.stream()
                .filter(v -> v.getNumber().equals(number))
                .findFirst().orElse(null);
    }

    public List<Vehicle> findByOwner(String cmnd) {
        return vehicles.stream()
                .filter(v -> v.getOwner().getId().equals(cmnd))
                .toList();
    }

    public void deleteByManufacturer(String name) {
        vehicles.removeIf(v -> v.getManufacturer().equalsIgnoreCase(name));
    }

    public String mostOwnedManufacturer() {
        return vehicles.stream()
                .collect(Collectors.groupingBy(Vehicle::getManufacturer, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("None");
    }

    public void sortByDescendingCount() {
        Map<String, Long> countMap = vehicles.stream()
                .collect(Collectors.groupingBy(Vehicle::getManufacturer, Collectors.counting()));

        countMap.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    public void typeStatistics() {
        Map<String, Long> typeMap = vehicles.stream()
                .collect(Collectors.groupingBy(Vehicle::getType, Collectors.counting()));
        typeMap.forEach((type, count) -> System.out.println(type + ": " + count));
    }
}

