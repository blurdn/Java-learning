package moocfi.equalsandhashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        List<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list again

        Map<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        vehicleRegistry.add(li1, "Arto");
        vehicleRegistry.add(li2, "Arto");
        vehicleRegistry.add(li3, "Jürgen");

        vehicleRegistry.printLicensePlates();
        vehicleRegistry.printOwners();
    }
}
