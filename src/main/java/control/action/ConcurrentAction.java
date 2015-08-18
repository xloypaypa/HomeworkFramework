package control.action;

/**
 * Created by xlo on 2015/8/18.
 * it's the action start next action concurrently
 */
public abstract class ConcurrentAction extends AbstractAction {
    protected ActionRunner actionRunnerCallback;

    public ConcurrentAction(ActionRunner actionRunnerCallback) {
        this.actionRunnerCallback = actionRunnerCallback;
    }

    @Override
    public void startWhenDone() {
        this.doneAction.forEach(this.actionRunnerCallback::startEvent);
    }

    @Override
    public void startWhenFailed() {
        this.failedAction.forEach(this.actionRunnerCallback::startEvent);
    }

    @Override
    public void startWhenFinished() {
        this.finishedAction.forEach(this.actionRunnerCallback::startEvent);
    }
}
