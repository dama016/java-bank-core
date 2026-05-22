public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("KZ123456", "Damir");

        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.withdraw(10000);
        System.out.println(acc1.getBalance());
    }
}