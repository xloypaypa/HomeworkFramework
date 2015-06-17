package control.event.tool;

import control.event.NormalEvent;
import control.listener.ListenerManager;
import javafx.util.Pair;
import tool.FrameWorkStrings;

import java.util.Vector;

/**
 * Created by xlo on 15-6-16.
 *
 */
public class ValueChecker {

    protected NormalEvent eventCallBack;
    protected Vector<Pair<String, Class>> checkItems;

    public ValueChecker() {
        checkItems = new Vector<>();
    }

    public void setEventCallBack(NormalEvent eventCallBack) {
        this.eventCallBack = eventCallBack;
    }

    public NormalEvent getEventCallBack() {
        return eventCallBack;
    }

    public void addItem(Pair<String, Class> item) {
        checkItems.addElement(item);
    }

    public void cleanItem() {
        checkItems.removeAllElements();
    }

    public boolean checkAllItem() {
        for (Pair<String, Class> now : checkItems) {
            if (!this.eventCallBack.containsKey(now.getKey())) {
                ListenerManager.setErrorMessage(FrameWorkStrings.doNotHaveValue);
                ListenerManager.logAction();
                return false;
            }
            if (!this.eventCallBack.getValueClass(now.getKey()).equals(now.getValue())) {
                ListenerManager.setErrorMessage(FrameWorkStrings.valueClassError);
                ListenerManager.logAction();
                return false;
            }
        }
        return true;
    }

}
