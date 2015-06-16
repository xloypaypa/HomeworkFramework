package control.event;

import java.util.Vector;

public class NormalEvent {
	
	Vector<AbstractSteep> steeps;
	
	public NormalEvent() {
		steeps = new Vector<>();
	}
	
	public void addSteep(AbstractSteep steep) {
		steeps.addElement(steep);
	}
	
	public void cleanSteep() {
		steeps.removeAllElements();
	}
	
	public boolean runEvent() {
		for (AbstractSteep steep : steeps) {
			if (!steep.action()) {
				return false;
			}
		}
		return true;
	}

}
