// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques2;

public class Course implements Comparable<Course> {
    private String name;
    private String id;
    private int credit;

    public Course(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int compareTo(Course o) {
        return o.getCredit() == this.getCredit() ? 0 : (o.getCredit() > this.getCredit() ? 1 : -1);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15d", getId(), getName(), getCredit());
    }

}
