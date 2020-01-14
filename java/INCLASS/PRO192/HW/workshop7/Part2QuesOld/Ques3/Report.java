// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2QuesOld.Ques3;

public class Report extends Student {
    private int totalCourse;

    public Report(Student i) {
        super.setCourseName(i.getCourseName());
        super.setId(i.getId());
        super.setSemester(i.getSemester());
        super.setStudentName(i.getStudentName());
    }

    public Report(String studentName, String courseName, int totalCourse) {
        super(studentName, courseName);
        this.totalCourse = totalCourse;
    }

    public String getStudentName() {
        return super.getStudentName();
    }

    public void setStudentName(String studentName) {
        super.setStudentName(studentName);
    }

    public String getCourseName() {
        return super.getCourseName();
    }

    public void setCourseName(String courseName) {
        super.setCourseName(courseName);
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }

    @Override
    public String toString() {
        return "Report [courseName=" + getCourseName() + ", studentName=" + getStudentName() + ", totalCourse="
                + totalCourse + "]";
    }
}
