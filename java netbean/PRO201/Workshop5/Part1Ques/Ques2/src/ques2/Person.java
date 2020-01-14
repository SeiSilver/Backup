// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques2;

public abstract class Person {
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();

    public abstract double getSalary();

    @Override
    public String toString() {
        return "name = " + name + "\n";
    }

}
