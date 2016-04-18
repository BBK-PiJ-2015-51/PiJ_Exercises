import java.util.Scanner;
import java.util.concurrent.*;


/**
 * Created by stevenjenkins on 04/04/2016.
 */

public class ResponsiveUIApplication implements Runnable {

    int taskId;
    Integer waitTime;


    public ResponsiveUIApplication(Integer n, int t) {
        this.waitTime = n;
        this.taskId = t;
    }

    public static void main(String args[]) {
        Executor ex = new MyExecutorExtended();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the duration (in ms) of task " + i + ":");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            Integer n = Integer.parseInt(s);
            ResponsiveUIApplication r = new ResponsiveUIApplication(n,i);
            ex.execute(r);
        }
    }

    public void run() {
        try {Thread.sleep(waitTime);
        } catch (InterruptedException ex) {
            System.out.println("thread problem");
        }
        System.out.println("Task " + taskId + "completed");
    }
}