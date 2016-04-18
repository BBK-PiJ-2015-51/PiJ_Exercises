import java.util.Scanner;

/**
 * Created by stevenjenkins on 04/04/2016.
 */
public class ResponsiveUI implements Runnable {

    int task;
    Integer waitTime;

    public ResponsiveUI(Integer n, int t) {
        this.waitTime = n;
        this.task = t;
    }

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the duration (in ms) of task " + i + ":");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            //String s = System.console().readLine();
            Integer n = Integer.parseInt(s);
            ResponsiveUI r = new ResponsiveUI(n,i);
            Thread t = new Thread(r);
            t.start();
        }
    }

    public void run() {
        try {Thread.sleep(waitTime);
        } catch (InterruptedException ex) {
            System.out.println("thread problem");
        }
    System.out.println("Task " + task + "completed");
    }

}