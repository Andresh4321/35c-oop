package zzalltaskfrom1to100;
class Student {
    private String name;
    private String idNumber;
    private final double gpa;

    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }
}

public class taskweek8_three {
    public static void main(String[] args) {
        Student student = new Student("Alice", "S123456", 3.85);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getIdNumber());
        System.out.println("Student GPA: " + student.getGpa());

        student.setName("Alicia");
        student.setIdNumber("S654321");
        System.out.println("Updated Student Name: " + student.getName());
        System.out.println("Updated Student ID: " + student.getIdNumber());
    }
}


