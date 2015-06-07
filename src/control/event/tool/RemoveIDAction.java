package control.event.tool;

import control.event.AbstractAction;
import model.database.DBOperatorManager;
import model.database.IDDatabase;

public class RemoveIDAction extends AbstractAction {
	
	String db, id;
	
	public void setValue(String db, String id) {
		this.db = db;
		this.id = id;
	}

	@Override
	protected void run() {
		((IDDatabase)DBOperatorManager.getDataBase(db)).removeItem(id);
	}

}
