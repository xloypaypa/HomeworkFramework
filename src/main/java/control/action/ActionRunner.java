package control.action;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xlo on 2015/8/18.
 * it's the runner of action.
 */
public class ActionRunner {
    protected ExecutorService executorService;

    private ActionRunner(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public static ActionRunner newEventRunner() {
        return new ActionRunner(Executors.newCachedThreadPool());
    }

    public static ActionRunner newEventRunner(ExecutorService executorService) {
        return new ActionRunner(executorService);
    }

    public void startEvent(Action action) {
        executorService.execute(action);
    }

    public void shutdown() {
        this.executorService.shutdown();
    }

    public void shutdownNow() {
        this.executorService.shutdownNow();
    }
}
