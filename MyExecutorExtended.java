import java.util.concurrent.Executor;

/**
 * Created by stevenjenkins on 04/04/2016.
 */
public class MyExecutorExtended extends MyExecutor{

    public MyExecutorExtended() {
    }

    public int getMaxPendingTime() {
        int result = tasks.size() * 1000;
        return result;
    }
}