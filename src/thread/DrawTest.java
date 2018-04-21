package thread;

public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("1234567", 1000.0);
        new DrawThread("A-", acct, 800).start();
        new DrawThread("B-", acct, 900).start();

    }
}
