package control.listener;

public class ListenerManager {
	protected static LogicMessageListener message=new LogicMessageListener() {
		@Override
		public void UIAction() {}
	};
	
	public static void setListenser(LogicMessageListener message){
		ListenerManager.message=message;
	}
	
	public static void setErrorMessage(String msg){
		message.setErrorFlag(true);
		message.setMessage(msg);
	}
	
	public static void setOKMessage(){
		message.setErrorFlag(false);
		message.setMessage("ok.");
	}
	
	public static void UIAction(){
		message.UIAction();
	}
	
}
