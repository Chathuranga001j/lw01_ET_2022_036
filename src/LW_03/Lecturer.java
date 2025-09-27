package LW_03;

public class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public Lecturer() { }

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }

    @Override
    public String toString() {
        return lecturerName + " (teaches: " + courseTeaching + ")";
    }
}

