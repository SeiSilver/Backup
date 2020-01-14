// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1part1;

public class Main {
    public static void main(String[] args) {
        GenericCar<Car> g = new GenericCar<>();

        if (g.checkEmpty())
            System.out.println("is empty!");

        g.setObj(new Car("C1", 12, "A"));
        g.add();
        g.setObj(new Car("C2", 12, "C"));
        g.add();
        g.setObj(new Car("C3", 12, "B"));
        g.add();
        g.display();
        System.out.println("After delete: ");
        g.delete(1);
        g.display();

        if (!g.checkEmpty())
            System.out.println("is not empty!");

    }
}
