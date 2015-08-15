package model.database.io;

import java.util.Vector;

public class IOManager {
	
	public static IOInterface io;
	
	public static void loadDB(String dbName) {
		io.loadDB(dbName);
	}
	
	public static Vector<String> getMessage(String collectionName) {
		return io.getMessage(collectionName);
	}
	
	public static Vector<String> findMessage(String collectionName, String item) {
		return io.findMessage(collectionName, item);
	}
	
	public static void addMessage(String collectionName, String item) {
		io.addMessage(collectionName, item);
	}
	
	public static void removeMessage(String collectionName, String item) {
		io.removeMessage(collectionName, item);
	}
	
	public static void updateMessage(String collectionName, String now, String item) {
		io.updateMessage(collectionName, now, item);
	}
	
	public static void clean(String collectionName) {
		io.clean(collectionName);
	}

}
