// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package PRO192.Exrcises;

class Student extends Person {
    private String name;
    private int year;
    private double fee;

    public Student(String name, String address, String birthday, String name2, int year, double fee) {
        super(name, address, birthday);
        name = name2;
        this.year = year;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [fee=" + fee + ", name=" + name + ", year=" + year + "]";
    }

}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String birthday, String school, double pay) {
        super(name, address, birthday);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [pay=" + pay + ", school=" + school + "]";
    }

}

public class Person {
    private String name;
    private String address;
    private String birthday;

    public Person(String name, String address, String birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", birthday=" + birthday + ", name=" + name + "]";
    }

}
