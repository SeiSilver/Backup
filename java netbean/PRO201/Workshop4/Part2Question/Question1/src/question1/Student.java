// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question1;

public class Student {
    private String id;
    private String studentName;
    private String courseName;
    private String Semester;

    public Student() {
    }

    public Student(String id, String studentName, String courseName, String semester) {
        this.id = id;
        this.studentName = studentName;
        this.courseName = courseName;
        this.Semester = semester;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public void print() {
        System.out.printf("%-15s%-15s%-15s\n", studentName, Semester, courseName);
    }
}
