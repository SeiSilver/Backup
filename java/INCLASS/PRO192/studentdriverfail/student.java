package PRO192.studentdriverfail;

public class student {

    String name;
    String classid;
    String studentID;
    int year;
    double mark;

    student(String n, String c, String id, int y, double m) {
        this.name = n;
        this.classid = c;
        this.studentID = id;
        this.year = y;
        this.mark = m;
    }

    void gotoschool() {
        System.out.println("every morning, we go to FPTU");
    }

    float takingtest() {
        float finaltest = 9;
        return finaltest;
    }

    void sport() {
        System.out.println("in FPT, WE PLAY CHESS");
    }

    void hobbies() {
        System.out.println("vovinam");
    }

    public String toString() {
        return name + " " + classid + " " + studentID + " " + year + " " + mark;
    }

    void printall() {
        // System.out.println("Student name: " + name);
        // System.out.println(classid);
        // System.out.println(studentID);
        // System.out.println(year);
        // System.out.println(mark);
        System.out.println(toString());
    }
}