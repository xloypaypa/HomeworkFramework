package model.database;

import java.util.Vector;

import model.database.io.IOType;

public interface DataBase extends DataOperator {
	
	void addItem(IOType type);
	boolean itemExist(IOType type);
	void removeItem(IOType type);
	void updateItem(IOType past, IOType now);
	IOType getNewType();
	Vector <IOType> getAllItem();

}
