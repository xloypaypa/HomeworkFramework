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
		for (int i=0;i<steeps.size();i++){
			if (!steeps.get(i).action()) {
				return false;
			}
		}
		return true;
	}

}
