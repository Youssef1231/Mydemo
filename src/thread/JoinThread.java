package thread;

public class JoinThread extends Thread{
    //Provide a constructor with name by extending the Thread class
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //start the SubProcess
        new JoinThread("new thread-1").start();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                JoinThread jt = new JoinThread("Joined thread");
                jt.start();
                jt.join();

            }
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
