package model.database.io;

import java.util.Vector;

public interface IOInterface {
	
	public void loadDB(String dbName);
	public Vector<String> getMessage(String collectionName);
	public Vector<String> findMessage(String collectionName, String item);
	public void addMessage(String collectionName, String item);
	public void removeMessage(String collectionName, String item);
	public void updateMessage(String collectionName, String now, String item);
	public void clean(String collectionName);

}
