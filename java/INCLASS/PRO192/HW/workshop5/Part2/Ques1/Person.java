// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part2.Ques1;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[address = " + address + " ,name = " + name + "]";
    }

}
