package thread;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
    //the process will end here while the main method is over
}
