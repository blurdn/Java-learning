package moocfi.equalsandhashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRegistry {
    private final Map<LicensePlate, String> registry = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }

        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        System.out.println(registry.keySet());
    }

    public void printOwners() {
        List<String> printedOwners = new ArrayList<>();

        for(String owner : registry.values()) {
            if (!printedOwners.contains(owner)) {
                printedOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
