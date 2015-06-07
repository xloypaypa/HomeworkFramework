package control.event.tool;

import control.event.AbstractAction;
import model.database.DBOperatorManager;
import model.database.IDDatabase;
import model.database.io.IOType;

public class UpdateIDAction extends AbstractAction {
	
	String db, id;
	IOType item;
	
	public void setValue(String db, String id, IOType item) {
		this.db = db;
		this.id = id;
		this.item = item;
	}

	@Override
	protected void run() {
		((IDDatabase)DBOperatorManager.getDataBase(db)).updateItem(id, item);
	}

}
