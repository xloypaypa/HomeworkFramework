package model.database;

import model.database.io.IOManager;

public abstract class AbstractDatabase {
	
	protected String collectionName;
	
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	
	public String getCollectionName() {
		return collectionName;
	}
	
	public void clean() {
		IOManager.clean(collectionName);
	}

}
