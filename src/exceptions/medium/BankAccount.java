package exceptions.medium;

public class BankAccount {

    private static double balance;

    public  BankAccount(double balance) {
        if(balance <= 0.0){
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public BankAccount(){
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double saldo) {
        this.balance = saldo;
    }

    public void deposit(double money){
        balance += money;
    }

    public static void withdraw(double money) throws InsufficientBalance {
        balance -= money;
        if(balance < -1000){
            balance += money;
            throw new InsufficientBalance("Balance: " + balance + " insufficient for a withdraw of " + money);
        }
    }

    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(523);
        try {
            withdraw(9688);
        } catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }
}
