package zzalltaskfrom1to100;
class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class taskweek11_eight {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000);
        Manager mgr = new Manager("Jane Smith", 60000, 10000);

        System.out.println(emp.getName() + " Salary: $" + emp.calculateSalary());
        System.out.println(mgr.getName() + " Salary: $" + mgr.calculateSalary());
    }
}


