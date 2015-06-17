package control.event.tool.action;

import control.event.AbstractAction;
import control.event.tool.ValueChecker;
import javafx.util.Pair;
import model.database.DBOperatorManager;
import model.database.IDDatabase;

public class RemoveIDAction extends AbstractAction {

    String db, id;

    @Override
    protected void run() {
        ((IDDatabase) DBOperatorManager.getDataBase(db)).removeItem(id);
    }

    @Override
    protected boolean checkNeedData() {
        ValueChecker valueChecker = new ValueChecker();
        valueChecker.setEventCallBack(this.eventCallBack);
        valueChecker.addItem(new Pair<>("db", String.class));
        valueChecker.addItem(new Pair<>("id", String.class));
        if (!valueChecker.checkAllItem()) return false;

        db = (String) this.eventCallBack.getValue("db");
        id = (String) this.eventCallBack.getValue("id");
        return true;
    }

    @Override
    protected void putData() {
    }
}
