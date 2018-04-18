package thread;

import java.awt.image.ImageFilter;

public class PriorityTest extends Thread {
    //create a constructor with name by using super

    public PriorityTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(getName() + ",the priority is : " + getPriority() + "    the run method executes times:" + i);
        }
    }

    public static void main(String[] args) {
        //change the priority of main thread
        Thread.currentThread().setPriority(6);
        for (int i = 0; i <30 ; i++) {
            System.out.println(Thread.currentThread().getName() + "-"+Thread.currentThread().getPriority()+"-" + i);
            if (i == 10) {
                PriorityTest low = new PriorityTest("low");
                low.start();
                System.out.println("low thread priority used to be:" + low.getPriority());
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if (i == 20) {
                PriorityTest high = new PriorityTest("high");
                high.start();
                System.out.println("high thread priority used to be:" + high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
