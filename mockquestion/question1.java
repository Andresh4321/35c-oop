package mockquestion;

public class question1 {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "Alice", 3.5);
        student1.printProfile(); 

        student1.updateGPA(3.8);
        student1.printProfile();  
    }
}
/* question 1 */
class Student {
    private String studentId;
    private String name;
    private double gpa;

    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public void updateGPA(double newGpa) {
        this.gpa = newGpa;
    }

    public void printProfile() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", GPA: " + gpa);
    }
}
