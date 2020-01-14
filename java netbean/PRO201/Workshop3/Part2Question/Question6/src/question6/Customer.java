package question6;

public class Customer {
    private String ID;
    private String name;
    private String gender;

    public Customer(String ID, String name, String gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "[ ID = " + ID + " ,Name = " + name + " ,Gender = " + gender + " ]";
    }
}
