// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Arraylist.trash;

public class Fruit {
    private int id;
    private String name;
    private String origin;

    public Fruit(int id, String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "id=" + id + " name=" + name + " origin=" + origin;
    }

}
