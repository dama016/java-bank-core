public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited " + amount + " tg!");
        }
        else if(amount < 0) {
            System.out.println("Error: insufficient funds!");
        }
        else{
            System.out.println("Error type");
        }
    }

    public void withdraw(double amount){
        if(amount > 0) {
            if(amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Successfully withdraw " + amount + " tg!");
            }
            else {
                System.out.println("Error: insufficient funds!");
            }
        }
        else{
            System.out.println("Error: type correct number of amount");
        }
    }

    public double getBalance(){
        return this.balance;
    }

}
