package mockquestion;

public class question4 {
    public static void main(String[] args) {
        Transaction deposit = new DepositTransaction(100, 500);
        System.out.println("Deposit is valid: " + deposit.isValid());

        Transaction withdrawal = new WithdrawalTransaction(600, 500);
        System.out.println("Withdrawal is valid: " + withdrawal.isValid());
    }
}
// question 4

interface Transaction {
    double getAmount();
    boolean isValid();
}

class DepositTransaction implements Transaction {
    private double amount;
    private double limit;

    public DepositTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

class WithdrawalTransaction implements Transaction {
    private double amount;
    private double limit;

    public WithdrawalTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

