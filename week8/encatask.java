public class BankingSystem{
    public static void main(String[] args){
        BankAccount ba = new BankAccount(
            "10001", "Albert", 10
        );
        System.out.println(ba.getAccountPrice());
        ba.deposit(100);
        System.out.println(ba.getAccountPrice());
        ba.withdraw(10);
        System.out.println(ba.getAccountPrice());
        ba.withdraw(5000);
        System.out.println(ba.getAccountPrice());
    }
}
// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double accountPrice;
    public String getAccountNumer(){
        return this.accountNumber;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public double getAccountPrice(){
        return this.accountPrice;
    }
    BankAccount(
        String accountNumber, String accountHolderName, double accountPrice
    ){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountPrice = accountPrice;
    }
    public void deposit(double money){
        this.accountPrice += money;
    }
    public void withdraw(double money){
        if(money > accountPrice){
            System.out.println("You are poor");
        }else{
            accountPrice -= money;
        }
    }
} 