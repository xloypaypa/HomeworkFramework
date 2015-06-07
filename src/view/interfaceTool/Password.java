package view.interfaceTool;

import javax.swing.*;

public class Password extends Title {
	JPasswordField inputer;
	
	public Password() {
		super();
		
		inputer=new JPasswordField();
		inputer.setBounds(0, 20, 0, 20);
		
		show.add(inputer);
	}
	
	public void setWord(String s){
		inputer.setText(s);
	}
	
	public String getWord(){
		return new String(inputer.getPassword());
	}
	
	public void clear(){
		setWord("");
	}

	@Override
	public void updateBounds() {
		super.updateBounds();
		inputer.setBounds(0, this.titleHeight, show.getWidth(), show.getHeight()-this.titleHeight);
	}

	@Override
	public void setWidgetName(String name) {
		inputer.setName(name);
	}
}
