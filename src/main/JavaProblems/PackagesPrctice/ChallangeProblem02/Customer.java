package PackagesPrctice.ChallangeProblem02;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Ayush Yadav");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.withdrawMoney(0);

    }
}
