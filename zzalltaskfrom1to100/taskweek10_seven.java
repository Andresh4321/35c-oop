package zzalltaskfrom1to100;
interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("The chef is cooking.");
    }

    @Override
    public double getSalary() {
        return 50000.00;
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("The waiter is serving food.");
    }

    @Override
    public double getSalary() {
        return 30000.00;
    }
}

public class taskweek10_seven {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        chef.work();
        System.out.println("Chef Salary: $" + chef.getSalary());

        waiter.work();
        System.out.println("Waiter Salary: $" + waiter.getSalary());
    }
}


