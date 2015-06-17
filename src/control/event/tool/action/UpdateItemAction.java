package control.event.tool.action;

import control.event.AbstractAction;
import control.event.tool.ValueChecker;
import javafx.util.Pair;
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

	@Override
	protected boolean checkNeedData() {
		ValueChecker valueChecker = new ValueChecker();
		valueChecker.setEventCallBack(this.eventCallBack);
		valueChecker.addItem(new Pair<>("db", String.class));
		valueChecker.addItem(new Pair<>("past", IOType.class));
		valueChecker.addItem(new Pair<>("item", IOType.class));
		if (!valueChecker.checkAllItem()) return false;

		db = (String) this.eventCallBack.getValue("db");
		past = (IOType) this.eventCallBack.getValue("past");
		item = (IOType) this.eventCallBack.getValue("item");
		return true;
	}

	@Override
	protected void putData() {

	}
}
