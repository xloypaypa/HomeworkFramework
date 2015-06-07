package model.database;

import java.util.Vector;

import model.database.io.IOType;

public interface IDDatabase extends DataBase {
	
	void removeItem(String id);
	void updateItem(String id, IOType type);
	boolean ItemExist(String id);
	IOType getItem(String id);
	Vector<String> getAllID();

}
