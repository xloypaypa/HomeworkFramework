package model.database.io;

import java.util.Vector;

public interface IOInterface {
	
	void loadDB(String dbName);
	Vector<String> getMessage(String collectionName);
	Vector<String> findMessage(String collectionName, String item);
	void addMessage(String collectionName, String item);
	void removeMessage(String collectionName, String item);
	void updateMessage(String collectionName, String now, String item);
	void clean(String collectionName);

}
