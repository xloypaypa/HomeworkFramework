package control.event.tool.action;

import control.event.AbstractAction;
import control.event.tool.ValueChecker;
import control.listener.ListenerManager;
import javafx.util.Pair;
import model.database.DBOperatorManager;
import model.database.io.IOType;

public class RemoveItemAction extends AbstractAction {

	String db;
	IOType item;

	@Override
	protected void run() {
		DBOperatorManager.getDataBase(db).removeItem(item);
	}

	@Override
	protected boolean checkNeedData() {
		ValueChecker valueChecker = new ValueChecker();
		valueChecker.setEventCallBack(this.eventCallBack);
		valueChecker.addItem(new Pair<>("db",String.class));
		valueChecker.addItem(new Pair<>("item", IOType.class));
		if (!valueChecker.checkAllItem()) return false;

		db = (String) this.eventCallBack.getValue("db");
		item = (IOType) this.eventCallBack.getValue("item");
		return true;
	}

	@Override
	protected void putData() {}

}
