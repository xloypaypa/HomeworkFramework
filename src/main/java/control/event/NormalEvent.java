package control.event;

import java.util.HashMap;
import java.util.Map;

public class NormalEvent {

    protected Map<String, AbstractSteep> steeps;
    protected Map<String, Object> values;

    public NormalEvent() {
        steeps = new HashMap<>();
        values = new HashMap<>();
    }

    public void addSteep(AbstractSteep steep) {
        steep.setEventCallBack(this);
        steeps.put(steep.getClass().getSimpleName(), steep);
    }

    public void addSteep(String steepName, AbstractSteep steep) {
        steep.setEventCallBack(this);
        steeps.put(steepName, steep);
    }

    public void cleanSteep() {
        this.steeps.clear();
    }

    public boolean runEvent(String firstSteep) {
        if (!this.steeps.containsKey(firstSteep)) return false;
        AbstractSteep nowSteep = this.steeps.get(firstSteep);
        String nextSteep;
        while (nowSteep != null) {
            if (!nowSteep.action()) return false;
            nextSteep = nowSteep.getNextSteep();
            if (nextSteep == null) break;
            nowSteep = this.steeps.get(nextSteep);
        }
        return true;
    }

    public void putValue(String key, Object value) {
        values.put(key, value);
    }

    public Object getValue(String key) {
        return values.get(key);
    }

    public Class getValueClass(String key) {
        return this.values.get(key).getClass();
    }

    public boolean containsKey(String key) {
        return this.values.containsKey(key);
    }

    public void cleanValues() {
        values.clear();
    }

}
