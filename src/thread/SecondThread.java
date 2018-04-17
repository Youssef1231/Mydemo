package thread;

public class SecondThread implements Runnable {

    private int i ;

    public void run() {
        //when implements the runnable interface,
        //the only way to get the thread name is to use the static method :currentThread().getName()
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
    public static void main(String[] args) {
        //overwrite the run method
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ "  "+ i);
            if (i == 20) {
                //create the first thread
                SecondThread st  = new SecondThread();
                new Thread(st,"new thread one").start();
                //create the second thread
                new Thread(st, "new thread two").start();

            }
        }
    }
}
