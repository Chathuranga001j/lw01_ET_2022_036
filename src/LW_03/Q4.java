package LW_03;

public class Q4 {
    public static void main(String[] args) {
        Lecturer lect = new Lecturer("Dr. Nimal Fernando", "OOP");
        Course course = new Course("Object Oriented Programming", "CS101", lect);

        StudentCourse student = new StudentCourse("Saman Perera", "BSc Computer Science", "CS101");

        System.out.println("Course: " + course);
        System.out.println("Student: " + student);
    }
}
