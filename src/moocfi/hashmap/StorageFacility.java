package moocfi.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageFacility {
    private final Map<String, List<String>> facility = new HashMap<>();

    public void add(String storageUnit, String item) {
        List<String> storage = facility.computeIfAbsent(storageUnit, k -> new ArrayList<>());

        storage.add(item);
    }

    public List<String> contents(String storageUnit) {
        return facility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        List<String> storage = facility.get(storageUnit);
        if (storage == null) {
            return;
        }

        storage.remove(item);

        if (storage.isEmpty()) {
            facility.remove(storageUnit);
        }
    }

    public List<String> storageUnits() {
        var storageUnits = new ArrayList<String>();

        for (var entry: facility.entrySet()) {
            List<String> storage = entry.getValue();

            if (storage == null || storage.isEmpty()) {
                continue;
            }

            storageUnits.add(entry.getKey());
        }

        return storageUnits;
    }

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
