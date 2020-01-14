// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Arraylist.lecture;

import java.util.Arrays;

public class Lecture {
    private int id;
    private String name;
    private String course;
    private String[] cclass;

    public Lecture(int id, String name, String course, String[] cclass) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.cclass = cclass;
    }

    public Lecture() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String[] getCclass() {
        return cclass;
    }

    public void setCclass(String[] cclass) {
        this.cclass = cclass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nLecture [cclass=" + Arrays.toString(cclass) + ", course=" + course + ", id=" + id + ", name=" + name
                + "]\n";
    }

}
