package control.event.tool;

import control.event.AbstractAction;
import model.database.DBOperatorManager;
import model.database.io.IOType;

public class AddItemAction extends AbstractAction {
	
	String db;
	IOType item;
	
	public void setValue(String db, IOType item) {
		this.db = db;
		this.item = item;
	}

	@Override
	protected void run() {
		DBOperatorManager.getDataBase(db).addItem(item);
	}

}
