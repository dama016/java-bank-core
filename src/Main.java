import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        bankService.addAccount(new BankAccount("KZ0001", "Almas"));
        bankService.addAccount(new BankAccount("KZ0002", "Dias"));

        try {
            bankService.findAccount("KZ0001").deposit(10000);
            bankService.transfer("KZ0001", "HUI-200", 3000);
        }catch(IllegalArgumentException e){
            System.out.println("Error on transfer: " +  e.getMessage());
        }
        System.out.println(bankService.findAccount("KZ0001").getBalance());
        System.out.println(bankService.findAccount("KZ0002").getBalance());
    }
}