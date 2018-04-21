package thread;

public class DrawThread extends Thread{
    private Account account;
    private double drawAmount;

    public DrawThread(String name,Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        //use the account to be synchronize monitor
        synchronized (account) {
            //if the balance has enough money,draw cash
            if (account.getBalance() >= drawAmount) {
                System.out.println(getName() + "draw succeed, the amount is :" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // reset the balance
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("/t the balance is " + account.getBalance());
            } else {
                System.out.println(getName() + "draw money failed, the account has not enough money");
            }
        }
    }
}
