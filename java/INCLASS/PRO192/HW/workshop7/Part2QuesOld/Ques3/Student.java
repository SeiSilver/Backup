// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2QuesOld.Ques3;

public class Student implements Comparable<Student> {
    private String id;
    private String semester;
    private String studentName;
    private String courseName;

    public Student(String id, String semester, String studentName, String courseName) {
        this.id = id;
        this.semester = semester;
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public Student() {
    }

    public Student(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
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

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void print() {
        System.out.printf("%-15s%-15s%-15s\n", studentName, semester, courseName);
    }

    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }

    @Override
    public String toString() {
        return "Student [" + "id=" + id + ", studentName=" + studentName + ", courseName=" + courseName + ", semester="
                + semester + "]";
    }

}
