package control.event.tool;

import control.event.AbstractAction;
import model.database.DBOperatorManager;
import model.database.io.IOType;

public class UpdateItemAction extends AbstractAction {
	
	String db;
	IOType past, item;
	
	public void setValue(String db, IOType past, IOType item) {
		this.db = db;
		this.past = past;
		this.item = item;
	}

	@Override
	protected void run() {
		DBOperatorManager.getDataBase(db).updateItem(past, item);
	}

}
