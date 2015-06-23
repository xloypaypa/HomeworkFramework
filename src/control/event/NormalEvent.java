package control.event;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class NormalEvent {
	
	protected Vector<AbstractSteep> steeps;
	protected Map<String, Object> values;
	
	public NormalEvent() {
		steeps = new Vector<>();
		values = new HashMap<>();
	}
	
	public void addSteep(AbstractSteep steep) {
		steep.setEventCallBack(this);
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

	public void putValue(String key, Object value) {
		values.put(key, value);
	}

	public Object getValue(String key) {
		return values.get(key);
	}

	public Class getValueClass(String key) {
		return this.values.get(key).getClass();
	}

	public boolean containsKey(String key) {
		return this.values.containsKey(key);
	}

	public void cleanValues() {
		values.clear();
	}

}
