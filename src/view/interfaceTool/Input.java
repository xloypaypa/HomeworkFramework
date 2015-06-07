package view.interfaceTool;

import javax.swing.*;

public class Input extends Title {
	JTextField inputer;
	
	public Input() {
		super();
		
		inputer=new JTextField();
		inputer.setBounds(0, 20, 0, 20);
		
		show.add(inputer);
	}
	
	public void setWord(String s){
		inputer.setText(s);
	}
	
	public String getWord(){
		return inputer.getText();
	}
	
	public void clear(){
		setWord("");
	}
	
	public void setFocus(){
		inputer.grabFocus();
		inputer.requestFocus();
		inputer.requestFocusInWindow();
	}
	
	@Override
	public void updateBounds() {
		super.updateBounds();
		inputer.setBounds(0, this.titleHeight, show.getWidth(), show.getHeight()-this.titleHeight);
	}
	
	@Override
	public void setWidgetName(String name){
		inputer.setName(name);
	}

}
