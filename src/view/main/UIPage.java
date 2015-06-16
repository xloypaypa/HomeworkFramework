package view.main;

import tool.StringNameClass;

import javax.swing.JComponent;

public interface UIPage extends StringNameClass {
	
	void getInstance();
	void repaint();
	JComponent getPage();

}
