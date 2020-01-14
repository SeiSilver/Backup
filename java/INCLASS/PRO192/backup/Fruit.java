package PRO192.backup;

public class Fruit implements Comparable<Fruit> {
    private int no;
    private String name;
    private String country;

    public Fruit(int no, String name, String country) {
        this.no = no;
        this.name = name;
        this.country = country;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Fruit [country=" + country + ", name=" + name + ", no=" + no + "]";
    }

    @Override
    public int compareTo(Fruit x) {
        return this.name.compareTo(x.name);
    }

}