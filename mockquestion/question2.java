package mockquestion;
public class question2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("A001", "Bob", 1000);
        account1.checkBalance(); 

        account1.deposit(500);
        account1.checkBalance();  

        account1.withdraw(200);
        account1.checkBalance(); 

        account1.withdraw(1500); 
        account1.checkBalance();  
    }
}

/* question 2 */
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Balance: " + balance);
    }
}
