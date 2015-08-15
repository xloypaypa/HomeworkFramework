package control.event.tool.action;

import control.event.AbstractAction;
import control.event.tool.ValueChecker;
import javafx.util.Pair;
import model.database.DBOperatorManager;
import model.database.IDDatabase;
import model.database.io.IOType;

public abstract class UpdateIDAction extends AbstractAction {

    String db, id;
    IOType item;

    @Override
    protected void run() {
        ((IDDatabase) DBOperatorManager.getDataBase(db)).updateItem(id, item);
    }

    @Override
    protected boolean checkNeedData() {
        ValueChecker valueChecker = new ValueChecker();
        valueChecker.setEventCallBack(this.eventCallBack);
        valueChecker.addItem(new Pair<>("db", String.class));
        valueChecker.addItem(new Pair<>("id", String.class));
        valueChecker.addItem(new Pair<>("item", IOType.class));
        if (!valueChecker.checkAllItem()) return false;

        db = (String) this.eventCallBack.getValue("db");
        id = (String) this.eventCallBack.getValue("id");
        item = (IOType) this.eventCallBack.getValue("item");
        return true;
    }

    @Override
    protected void putData() {

    }
}
