import java.util.ArrayList;
import java.util.List;

public class BankService {
    private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public void addAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }
    public BankAccount findAccount(String accountNumber){
        for(BankAccount bankAccount : bankAccounts){
            if(bankAccount.getAccountNumber().equals(accountNumber)){
                return bankAccount;
            }
        }
        throw new IllegalArgumentException("Account not found: " + accountNumber);
    }

    public void transfer(String accountFrom, String accountTo, double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        BankAccount fromBankAccount = findAccount(accountFrom);
        BankAccount toBankAccount = findAccount(accountTo);
        fromBankAccount.withdraw(amount);
        toBankAccount.deposit(amount);

    }
}
