// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question1;

public class Molecules {
    private String structure;
    private String name;
    private double weight;

    public Molecules() {

    }

    public Molecules(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.printf("Structure: " + structure + "\nname: " + name + "\nweight: %.5f ", weight);
    }

    @Override
    public String toString() {
        return "Molecules [structure=" + structure + ", name=" + name + ", weight=" + weight + "]";
    }

}
