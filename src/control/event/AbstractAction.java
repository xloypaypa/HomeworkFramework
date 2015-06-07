package control.event;

import control.event.AbstractSteep;

public abstract class AbstractAction implements AbstractSteep {

	@Override
	public boolean action() {
		run();
		return true;
	}
	
	protected abstract void run();

}
