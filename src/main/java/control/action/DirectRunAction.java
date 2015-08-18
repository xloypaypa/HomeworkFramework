package control.action;

/**
 * Created by xlo on 2015/8/18.
 * it's the action who start next events directly
 */
public abstract class DirectRunAction extends AbstractAction {
    @Override
    public void startWhenDone() {
        this.doneAction.forEach(Action::run);
    }

    @Override
    public void startWhenFinished() {
        this.finishedAction.forEach(Action::run);
    }

    @Override
    public void startWhenFailed() {
        this.failedAction.forEach(Action::run);
    }
}
