package thread;

public class PrintTest {
    public static void main(String[] args) {
        //create thread
        Print pr= new Print();
        PrintNumThread pn  = new PrintNumThread(pr);
        PrintLetThread pl = new PrintLetThread(pr);
        pn.start();
        pl.start();

    }
}
