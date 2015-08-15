package control.event;

public abstract class AbstractAction extends AbstractSteep {

	@Override
	protected boolean steep() {
		run();
		return true;
	}

	protected abstract void run();

}
