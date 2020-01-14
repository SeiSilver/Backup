// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1;

public class PhoneNumber {
    private String number;
    private String area;

    public PhoneNumber(String number, String area) {
        this.number = number;
        this.area = area;
    }

    public PhoneNumber() {
    }

    @Override
    public String toString() {
        return area + " - " + number;
    }

    public PhoneNumber inputData() {
        System.out.println("Enter area code: ");
        String a = Validation.checkInputString();
        System.out.println("Enter Number: ");
        String n = Validation.checkInputPhone();
        PhoneNumber res = new PhoneNumber(n, a);

        return res;
    }

    public void display() {
        System.out.println("Phone number: " + number);
        System.out.println("Area: " + area);
    }

    public String getNumber() {
        return number;
    }

    public String getArea() {
        return area;
    }

}
