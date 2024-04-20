package exceptions.hard;

import exceptions.medium.BankAccount;
import exceptions.medium.InsufficientBalance;
import inheritance.Persoon;

import java.util.TreeSet;

public class UniversalBankAccount extends BankAccount {

    private static TreeSet<Persoon> proxy;

    public UniversalBankAccount(double balance, TreeSet<Persoon> proxy) {
        super(balance);
        this.proxy = proxy;
    }

    public UniversalBankAccount(TreeSet<Persoon> proxy) {
        super();
        this.proxy = proxy;
    }

    public void addProxy(Persoon persoon) {
        proxy.add(persoon);
    }

    public void removeProxy(Persoon persoon) {
        if (proxy.contains(persoon)) {
            proxy.remove(persoon);
        } else {
            throw new NullPointerException("Persoon niet in de lijst van volmachthebbers.");
        }
    }

    public boolean checkProxy(Persoon persoon) {
        boolean okProxy = true;
        if (!proxy.contains(persoon)) {
            okProxy = false;
        }
        return okProxy;
    }

    public void showProxy() {
        System.out.println(proxy);
    }

    @Override
    public static void withdraw(Double money, Persoon persoon) throws NoProxyException, InsufficientBalance {
        if (proxy.contains(persoon)) {
            double balance = getBalance();
            balance -= money;
            if (balance < -1000) {
                balance += money;
                throw new InsufficientBalance("Balance: " + balance + " insufficient for a withdraw of " + money);
            }
        } else {
            throw new NoProxyException("This person: " + persoon + "\nis not a proxy of this account.");
        }
    }
}
