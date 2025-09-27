package LW_03;

public class StudentCourse {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public StudentCourse() { }

    public StudentCourse(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }

    @Override
    public String toString() {
        return studentName + " | Degree: " + degreeName + " | Following: " + courseFollowing;
    }
}
