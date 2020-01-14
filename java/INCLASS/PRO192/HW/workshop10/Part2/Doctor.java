// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop10.Part2;

public class Doctor {
    private String name;
    private String code;
    private String specialization;
    private int availability;

    public Doctor(String code, String name, String specialization, int availability) {
        this.name = name;
        this.code = code;
        this.specialization = specialization;
        this.availability = availability;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-30s %-30s %d", code, name, specialization, availability);
    }

}
