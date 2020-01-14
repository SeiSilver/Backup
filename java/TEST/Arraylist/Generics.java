// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Arraylist;

class GenericsClass<T> {
    private T obj;

    public GenericsClass(T obj) {
        this.obj = obj;
    }

    public GenericsClass() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}

class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Customer() {
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
        return name + " - " + address;
    }
}

public class Generics {
    public static void main(String[] args) {
        GenericsClass<String> s = new GenericsClass<>();
        s.setObj("Apple");
        System.out.println(s.getObj());

        GenericsClass<Integer> s1 = new GenericsClass<>();
        s1.setObj(1);
        System.out.println(s1.getObj());

        GenericsClass<Customer> s2 = new GenericsClass<>();
        Customer customer = new Customer();
        s2.setObj(customer);
        s2.getObj().setName("Pham Duy Dat");
        s2.getObj().setAddress("Nguyen huu tho");

        System.out.println(s2.getObj());
        System.out.println(s2.getObj().getAddress());
        System.out.println(s2.getObj().getName());

    }
}
