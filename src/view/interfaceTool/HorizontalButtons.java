package view.interfaceTool;

import javax.swing.*;

import java.awt.event.*;
import java.util.*;

public class HorizontalButtons implements ToolInterface {
	
	JPanel show;
	Vector <JButton> buttons;
	
	public HorizontalButtons(){
		show=new JPanel();
		show.setLayout(null);
		show.setBackground(null);
		
		buttons=new Vector<JButton>();
	}
	
	public void addButton(String name, int width, ActionListener action){
		JButton now = getNewButton(name);
		now.setBounds(0, 0, width, 0);
		now.addActionListener(action);
		show.add(now);
		buttons.addElement(now);
		updateBounds();
	}
	
	public void addButton(String name, ActionListener action){
		JButton now = getNewButton(name);
		now.setBounds(0, 0, 100, 0);
		now.addActionListener(action);
		show.add(now);
		buttons.addElement(now);
		updateBounds();
	}
	
	public void addButton(String name){
		JButton now = getNewButton(name);
		now.setBounds(0, 0, 100, 0);
		show.add(now);
		buttons.addElement(now);
		updateBounds();
	}
	
	public void addButton(String name, int width){
		JButton now = getNewButton(name);
		now.setBounds(0, 0, width, 0);
		show.add(now);
		buttons.addElement(now);
		updateBounds();
	}

	private JButton getNewButton(String name) {
		JButton now=new JButton(name);
		now.setName(name);
		return now;
	}
	
	public void addBreak(int width){
		JButton now=new JButton();
		now.setBounds(0, 0, width, 0);
		show.add(now);
		now.setVisible(false);
		buttons.addElement(now);
		updateBounds();
	}
	
	public void addBreak(){
		JButton now=new JButton();
		now.setBounds(0, 0, 20, 0);
		show.add(now);
		now.setVisible(false);
		buttons.addElement(now);
		updateBounds();
	}

	@Override
	public JPanel getPanel() {
		return show;
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		show.setBounds(x, y, width, height);
		updateBounds();
	}

	@Override
	public void updateBounds() {
		if (buttons.size()==0) return ;
		
		int width;
		int height=show.getHeight();
		
		JButton now=buttons.get(0);
		JButton past;
		width=now.getWidth();
		now.setBounds(0, 0, width, height);
		
		for (int i=1;i<buttons.size();i++){
			past=buttons.get(i-1);
			now=buttons.get(i);
			width=now.getWidth();
			now.setBounds(past.getLocation().x+past.getWidth(), 0, width, height);
		}
	}

	public void setWidgetName(String name) {
		for (int i=0;i<buttons.size();i++){
			buttons.get(i).setName(name+":"+buttons.get(i).getText());
		}
	}
	
}
