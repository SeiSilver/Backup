// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part2Question.Question1;

public class Employee {
    private int id;
    private String firstName;
    private String LastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = lastName;
        this.salary = salary;
    }

    public void setId(int n) {
        this.id = n;
    }

    public void setFirstName(String n) {
        this.firstName = n;
    }

    public void setLastName(String n) {
        this.LastName = n;
    }

    public void setSalary(int n) {
        this.salary = n;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return firstName + " " + LastName;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int per) {
        return salary + salary * per / 100;
    }

    @Override
    public String toString() {
        return "Employee [ ID = " + id + " ,FirstName = " + firstName + " ,LastName = " + LastName + ", salary = "
                + salary + "]";
    }

}
