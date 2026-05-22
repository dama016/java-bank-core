public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
        else{
            throw new IllegalArgumentException("Incorrect type of deposit!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0) {
            if(amount <= this.balance) {
                this.balance -= amount;
            }
            else {
                throw new IllegalArgumentException("Not enough balance!");
            }
        }
        else{
            throw new IllegalArgumentException("Incorrect type of amount");
        }
    }

    public double getBalance(){
        return this.balance;
    }

}
