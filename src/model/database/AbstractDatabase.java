package model.database;

import model.database.io.IOManager;

public abstract class AbstractDatabase {
	
	protected String path;

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void clean() {
		IOManager.clean(path);
	}

}
