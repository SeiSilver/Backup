/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/
package J1SP0054;

public class Contact {
    private int ID;
    private String fullname;
    private String group;
    private String address;
    private String phone;
    private String lastName;
    private String firstname;

    public Contact(int iD, String fullname, String group, String address, String phone, String lastName,
            String firstname) {
        ID = iD;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstname = firstname;
    }

    public Contact(int iD, String fullname, String group, String address, String phone) {
        getFirstAndLast(fullname);
        this.ID = iD;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public Contact() {
    }

    public void getFirstAndLast(String name) {
        String s = name;
        String[] arr = s.split(" ", 2);
        firstname = arr[0];
        try {
            lastName = arr[1];
            if (lastName.isEmpty())
                lastName = "";
        } catch (Exception e) {
            lastName = "";
        }

    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-18s %-20s %-20s %-10s %-20s %s ", ID, fullname, firstname, lastName, group,
                address, phone);
    }

}
