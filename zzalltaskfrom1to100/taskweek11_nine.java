package zzalltaskfrom1to100;
class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.03; // Default interest rate of 3%
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // Savings account interest rate of 4%
    }
}

class FixedDepositAccount extends Account {
    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.06; // Fixed deposit interest rate of 6%
    }
}

public class taskweek11_nine {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1000);
        Account fixedDeposit = new FixedDepositAccount(1000);

        System.out.println("Savings Account Interest: $" + savings.calculateInterest());
        System.out.println("Fixed Deposit Account Interest: $" + fixedDeposit.calculateInterest());
    }
}


