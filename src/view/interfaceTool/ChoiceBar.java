package view.interfaceTool;

import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class ChoiceBar extends Title {
	JComboBox<String> choice;
	
	public ChoiceBar(){
		super();
		
		choice=new JComboBox<String>();
		this.show.add(choice);
	}
	
	public void addChoice(String item){
		choice.addItem(item);
		if (choice.getItemCount()==1){
			choice.setSelectedItem(item);
		}
	}
	public void removeChoice(String item){
		choice.removeItem(item);
		if (choice.getItemCount()==0){
			choice.setSelectedItem(null);
		}
	}
	public void setChoices(Vector <String> a){
		for (int i=0;i<a.size();i++){
			choice.addItem(a.get(i));
		}
		if (a.size()!=0) choice.setSelectedItem(a.get(0));
	}
	public String getChoosenItem(){
		String ans=new String();
		try{
			ans=choice.getSelectedItem().toString();
		}catch(Exception e){
			ans="null";
		}
		return ans;
	}
	
	public void addSelectAction(ActionListener listener){
		choice.addActionListener(listener);
	}
	
	public void setSelectedItem(String item){
		choice.setSelectedItem(item);
	}
	
	@Override
	public void updateBounds() {
		super.updateBounds();
		choice.setBounds(0, this.titleHeight, show.getWidth(), show.getHeight()-this.titleHeight);
	}
	
	@Override
	public void setWidgetName(String name){
		choice.setName(name);
	}
}
