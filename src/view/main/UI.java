package view.main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.JFrame;

public class UI {
	
	public static JFrame window;
	public static Vector<UIDialog> dialog;
	public static Vector<UIPage> page;
	public static boolean resizeAble=false;
	
	private static UIPage nowPage=null;
	
	public static void getInstance(){
		window=new JFrame("Adress 1.0");
		dialog=new Vector<>();
		page=new Vector<>();
	}
	
	public static void createWindow(){
		window.setSize(800, 600);
		window.setLocation(200, 100);
		window.setResizable(resizeAble);
		window.setLayout(null);
		window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		window.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		window.setVisible(true);
	}
	
	public static void addDialog(UIDialog dialog){
		UI.dialog.addElement(dialog);
	}
	
	public static void addPage(UIPage page){
		UI.page.addElement(page);
	}
	
	public static void showDialog(String name){
		for (int i=0;i<dialog.size();i++){
			if (dialog.get(i).isThisDialog(name)){
				dialog.get(i).getInstance();
				dialog.get(i).show();
			}
		}
	}
	
	public static void showPage(String name){
		for (int i=0;i<page.size();i++){
			if (page.get(i).isThisPage(name)){
				if (nowPage!=null) {
					window.remove(nowPage.getPage());
					window.repaint();
				}
				page.get(i).getInstance();
				nowPage=page.get(i);
				window.add(nowPage.getPage());
				UI.repaint();
			}
		}
	}
	
	public static void repaint(){
		nowPage.repaint();
	}
	
	public static void allPageInstance() {
		for (int i=0;i<page.size();i++) {
			page.get(i).getInstance();
			page.get(i).repaint();
		}
	}

}
