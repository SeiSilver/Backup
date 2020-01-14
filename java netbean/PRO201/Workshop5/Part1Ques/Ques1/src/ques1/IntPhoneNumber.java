// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1;

public class IntPhoneNumber extends PhoneNumber {
    private String countrycode;

    public IntPhoneNumber(String number, String area, String countrycode) {
        super(number, area);
        this.countrycode = countrycode;
    }

    public IntPhoneNumber(String number, String area) {
        super(number, area);
    }

    public IntPhoneNumber(String countrycode) {
        this.countrycode = countrycode;
    }

    public IntPhoneNumber() {
        super();
    }

    public String getCountryCode() {
        return countrycode;
    }

    public void setCountryCode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Override
    public void display() {

        System.out.println("Country Code: " + getCountryCode());
        System.out.println("Area: " + super.getArea());
        System.out.println("Phone number: " + super.getNumber());

        System.out.println(this.countrycode + " - " + super.toString());
    }

    public IntPhoneNumber inputData() {
        System.out.println("Enter Country Code: ");
        String c = Validation.checkInputString();
        System.out.println("Enter area code: ");
        String a = Validation.checkInputString();
        System.out.println("Enter Number: ");
        String n = Validation.checkInputPhone();
        IntPhoneNumber res = new IntPhoneNumber(n, a, c);

        return res;
    }

    @Override
    public String toString() {
        return this.countrycode + " - " + super.toString();
    }

}
