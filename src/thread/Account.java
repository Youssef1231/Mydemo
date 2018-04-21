package thread;

import java.util.Objects;

public class Account {
    //package the account information:accountNo,balance

    private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {

        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getAccountNo() == account.getAccountNo() &&
                Double.compare(account.getBalance(), getBalance()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAccountNo());
    }
}

