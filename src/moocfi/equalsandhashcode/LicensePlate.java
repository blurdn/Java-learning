package moocfi.equalsandhashcode;

import java.util.Objects;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LicensePlate plate)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        return Objects.equals(this.liNumber, plate.liNumber) && Objects.equals(this.country, plate.country);
    }

    @Override
    public int hashCode() {
        return liNumber.hashCode()^2 + country.hashCode()^3;
    }
}