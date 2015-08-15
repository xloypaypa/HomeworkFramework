package model.type;

import java.util.HashMap;
import java.util.Map;

import model.database.io.IOType;

public abstract class Type implements IOType {
	
	protected Map<String, String> element;
	
	public Type() {
		element = new HashMap<>();
	}
	
	public void addMessage(String title, String message) {
		element.put(title, message);
	}
	
	public void removeMessage(String title) {
		element.remove(title);
	}
	
	public String getMessage(String title) {
		if (element.containsKey(title)) {
			return element.get(title);
		} else {
			return null;
		}
	}

	protected abstract void loadMessage();

}
