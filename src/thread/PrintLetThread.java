package thread;

public class PrintLetThread extends Thread{
    Print pr;

    public PrintLetThread(Print pr) {
        this.pr = pr;
    }

    @Override
    public void run() {
        for (int i = 0; i <26; i++) {
//            System.out.println(Thread.currentThread().getName()+"-");
            pr.printLet();
        }
    }
}
