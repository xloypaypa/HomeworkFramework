package control.event;

public abstract class AbstractSteep {

	protected NormalEvent eventCallBack;

	public boolean action() {
		if (!this.checkNeedData()) return false;
		if (!this.steep()) return false;
		this.putData();
		return true;
	}

	public void setEventCallBack(NormalEvent eventCallBack) {
		this.eventCallBack = eventCallBack;
	}

	public NormalEvent getEventCallBack() {
		return eventCallBack;
	}

	protected abstract boolean checkNeedData();
	protected abstract boolean steep();
	protected abstract void putData();
	protected abstract String getNextSteep();

}
