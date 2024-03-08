package PackagesPrctice.ChallangeProblem02;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("Invalid deposit money");
        } else
            balance += money;
    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double withdrawMoney(double money){
        if(money <= 0){
            System.out.println("Invalid money withdraw");
        }
        else if (balance >= money){
            balance -= money;
        } else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
