package zzalltaskfrom1to100;
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }
}

// Example usage:
public class taskweek9_two  {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
        System.out.println("Salary: " + hrManager.getSalary());
    }
}

