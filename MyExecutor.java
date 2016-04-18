import java.util.Queue;
import java.util.ArrayDeque;
import java.util.concurrent.*;
import java.util.ArrayList;

/**
 * Created by stevenjenkins on 04/04/2016.
 */
public class MyExecutor implements Executor {

    final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
    Runnable task;

    public MyExecutor() {
    }


    public synchronized void execute(Runnable r) {
        task = r;
        tasks.offer(task);
        run();
        scheduleNext();
    }


    public void run() {
        try {
            task.run();
        } finally {
            scheduleNext();
        }
    }


    protected synchronized void scheduleNext() {
        if ((task = tasks.poll()) != null) {
            execute(task);
        }
    }
}