package control.action;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xlo on 2015/8/18.
 * it's the abstract action
 */
public abstract class AbstractAction implements Action {
    protected List<Action> doneAction, finishedAction, failedAction;
    private boolean isDone, isFinished;

    public AbstractAction() {
        this.isDone = false;
        this.isFinished = false;
        this.doneAction = new LinkedList<>();
        this.finishedAction = new LinkedList<>();
        this.failedAction = new LinkedList<>();
    }

    @Override
    public boolean isDone() {
        return this.isDone;
    }

    @Override
    public boolean isFailed() {
        return this.isFinished && !this.isDone;
    }

    @Override
    public boolean isFinished() {
        return this.isFinished;
    }

    @Override
    public void run() {
        try {
            this.isDone = this.call();
        } catch (Exception ignored) {

        } finally {
            this.isFinished = true;
            loadNextEvents();
            this.startWhenFinished();
            if (this.isDone) {
                this.startWhenDone();
            } else {
                this.startWhenFailed();
            }
        }
    }

    public void addDoneEvent(Action action) {
        this.doneAction.add(action);
    }

    public void addFailedEvent(Action action) {
        this.failedAction.add(action);
    }

    public void addFinishEvent(Action action) {
        this.finishedAction.add(action);
    }

    protected abstract void loadNextEvents();

}
