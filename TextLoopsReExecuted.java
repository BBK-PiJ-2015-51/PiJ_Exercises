import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by stevenjenkins on 04/04/2016.
 */
public class TextLoopsReExecuted implements Runnable {

    public static final int COUNT = 10;
    private final String name;

    public TextLoopsReExecuted(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }

    public static void main(String args[]) {
        String[] args2 = new String[5];
        args2[0] = "1";

        if (args2.length < 1 || (!args2[0].equals("0") && !args2[0].equals("1"))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } else if (args2[0].equals("0")) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoopsReExecuted("Thread0 " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoopsReExecuted("Thread1 " + i);
                ExecutorService ex = Executors.newFixedThreadPool(10);
                ex.execute(r);
            }
        }
    }
}