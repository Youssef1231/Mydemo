package thread;

import javax.swing.plaf.BorderUIResource;

public class Print{
    private boolean flag = false;
    int num = 1;
    char ch = 'A';
    //create synchronize method
    public synchronized void printNum() {
        try {
            while (flag) {
                wait();
            }
                System.out.print(num++);
                System.out.print(num++);
                flag = true;
                notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printLet() {
        try {
            while (!flag) {
                wait();
            }
                System.out.print((char)(ch++));
                flag = false;
                notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
