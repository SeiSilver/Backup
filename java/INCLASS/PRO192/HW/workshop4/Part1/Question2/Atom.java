// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop4.Part1.Question2;

public class Atom {

    private int number;
    private String symbol;
    private String fullname;
    private double weight;

    public Atom(int number, String symbol, String fullname, double weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void display() {
        System.out.printf("%-10d%-10s%-20s%-10f\n", number, symbol, fullname, weight);
    }

    @Override
    public String toString() {
        return "Atom [fullname=" + fullname + ", number=" + number + ", symbol=" + symbol + ", weight=" + weight + "]";
    }
}
