package view.interfaceTool;

import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Title implements ToolInterface{
	JPanel show;
	JLabel name;
	int titleHeight;
	
	public abstract void setWidgetName(String name);
	
	public Title(){
		show=new JPanel();
		show.setLayout(null);
		show.setBackground(null);
		
		name=new JLabel();
		name.setBounds(0, 0, 700, 20);
		name.setBackground(null);
		
		show.add(name);
		
		titleHeight=20;
	}
	
	public void setName(String s){
		this.setWidgetName(s);
		name.setText(s);
	}
	
	public String getName(){
		return name.getText();
	}
	
	public void setTitleHeight(int height){
		this.titleHeight=height;
	}

	@Override
	public JPanel getPanel() {
		return this.show;
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		this.show.setBounds(x, y, width, height);
		this.updateBounds();
	}

	@Override
	public void updateBounds() {
		name.setBounds(0, 0, show.getWidth(), titleHeight);
	}

}
