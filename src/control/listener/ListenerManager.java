package control.listener;

import java.util.HashMap;
import java.util.Map;

public class ListenerManager {
	protected static LogicMessageListener defaultListener =new LogicMessageListener() {
		@Override
		public void UIAction() {}

		@Override
		public void logAction() {}
	};
	protected static Map<String, LogicMessageListener> allListeners = new HashMap<>();

	public static void addListener(String key, LogicMessageListener listener) {
		allListeners.put(key, listener);
	}

	public static void removeListener(String key) {
		if (allListeners.containsKey(key)) {
			allListeners.remove(key);
		}
	}

	public static void removeAllListener() {
		allListeners.clear();
	}
	
	public static void useListenser(String name){
		if (allListeners.containsKey(name)) {
			ListenerManager.defaultListener = allListeners.get(name);
		} else {
			ListenerManager.defaultListener = null;
		}
	}
	
	public static void setErrorMessage(String msg){
		defaultListener.setErrorFlag(true);
		defaultListener.setMessage(msg);
	}

	public static void setInfoMessage(String message) {
		defaultListener.setErrorFlag(false);
		defaultListener.setMessage(message);
	}
	
	public static void setOKMessage(){
		defaultListener.setErrorFlag(false);
		defaultListener.setMessage("ok.");
	}
	
	public static void UIAction(){
		defaultListener.UIAction();
	}

	public static void logAction() {
		defaultListener.logAction();
	}
	
}
