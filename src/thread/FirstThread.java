package thread;

public class FirstThread extends Thread{
    private  int i ;

    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + "  " + i);

        }
    }

    public static void main(String[] args) {
        //overwrite the run method
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ "  "+ i);
            if (i == 20) {
                //create the first thread
                new FirstThread().start();
                //create the second thread
                new FirstThread().start();
                
            }
        }
    }
}
