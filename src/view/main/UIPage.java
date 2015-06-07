package view.main;

import javax.swing.JComponent;

public interface UIPage {
	
	void getInstance();
	void repaint();
	JComponent getPage();
	boolean isThisPage(String name);

}
