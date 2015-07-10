package control.event.tool;

import control.event.AbstractSteep;
import javafx.util.Pair;

import java.text.Format;
import java.text.ParseException;

/**
 * Created by xlo on 15-6-17.
 *
 */
public abstract class DataFormatSteep extends AbstractSteep {

    protected String key;
    protected Format format;

    private String value;
    private Object ans;

    public void setFormat(String key, Format format) {
        this.key = key;
        this.format = format;
    }

    @Override
    protected boolean checkNeedData() {
        ValueChecker valueChecker = new ValueChecker();
        valueChecker.setEventCallBack(this.eventCallBack);
        valueChecker.addItem(new Pair<>(key, String.class));
        return valueChecker.checkAllItem();
    }

    @Override
    protected boolean steep() {
        value = (String) this.eventCallBack.getValue(key);
        try {
            ans = format.parseObject(value);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    @Override
    protected void putData() {
        this.eventCallBack.putValue(key, ans);
    }
}
