package zzalltaskfrom1to100;
class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
        System.out.println("Salary increased by $" + amount);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}

public class taskweek7_four {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 75000);
        emp.printDetails();

        emp.setJobTitle("Senior Software Engineer");
        emp.increaseSalary(5000);

        System.out.println("Updated Employee Details:");
        emp.printDetails();
    }
}

