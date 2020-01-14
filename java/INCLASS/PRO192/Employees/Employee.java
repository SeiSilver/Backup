// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PRO192.Employees;

public class Employee {
    private int id;
    private String firstName;
    private String LastName;
    private static String Company;
    private double salary;
    private static int per;

    public Employee(int id, String firstName, String lastName, String Company, double salary2) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = lastName;
        Employee.Company = Company;
        this.salary = salary2;
    }

    public Employee() {
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

    public static void setCompany(String n) {
        Employee.Company = n;
    }

    public void setSalary(int n) {
        this.salary = n;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return Company;
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

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary() {
        return salary + salary * per / 100;
    }

    public double getSalary() {
        return salary;
    }

    public static int getPer() {
        return per;
    }

    public static void setPer(int per) {
        Employee.per = per;
    }

    public Employee input() {

        Employee data = new Employee();

        System.out.println("Enter Last Name: ");
        LastName = Validation.checkString();

        System.out.println("Enter First name: ");
        firstName = Validation.checkString();

        System.out.println("Enter ID: ");
        id = Main.sc.nextInt();

        System.out.println("Enter Salary: ");
        salary = Validation.checkDouble();

        System.out.println("Enter company: ");
        Company = Validation.checkString();

        data = new Employee(id, firstName, LastName, Company, salary);

        return data;
    }

    @Override
    public String toString() {
        return "Employee [ ID = " + id + " ,FirstName = " + firstName + " ,LastName = " + LastName + " ,Company = "
                + Company + " ,Salary = " + raiseSalary() + "]";
    }
}