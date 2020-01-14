// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part2Question.Question1;

public class Main {
    public static void main(String[] args) {
        Employee f1 = new Employee(001, "Sei", "Silver", 100);
        Employee f2 = new Employee(002, "Anna", "Silvevr", 200);
        System.out.println(f1.toString() + "\n");

        f1.setFirstName("Kasuke");
        f1.setId(0);
        f1.setLastName("Silford");
        f1.setSalary(9999);
        System.out.println(f1.toString() + "\n");

        System.out.println(f2.toString() + "\n");
    }
}
