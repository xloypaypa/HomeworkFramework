package control.action;

import java.util.concurrent.Callable;

/**
 * Created by xlo on 2015/8/18.
 * it's the interface of action.
 */
public interface Action extends Runnable, Callable<Boolean> {
    /**
     * @return {@code true} if the action is done, {@code false} if action is running or failed.
     */
    boolean isDone();

    /**
     * @return {@code true} if the action is failed, {@code false} if action is running or done.
     */
    boolean isFailed();

    /**
     * @return {@code true} if the action is finished, {@code false} if action is running.
     */
    boolean isFinished();

    /**
     * add events who would be start when action done
     */
    void startWhenDone();

    /**
     * add events who would be start when action finished
     */
    void startWhenFinished();

    /**
     * add events who would be start when action failed
     */
    void startWhenFailed();
}
