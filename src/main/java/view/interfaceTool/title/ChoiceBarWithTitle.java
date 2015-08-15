package view.interfaceTool.title;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Created by xlo on 15-6-10.
 *
 */
public class ChoiceBarWithTitle extends ComponentWithTitle {

    protected JComboBox<Object> comboBox;

    public ChoiceBarWithTitle() {
        comboBox =new JComboBox<>();
        this.add(comboBox);
    }

    public void addChoice(Object item){
        comboBox.addItem(item);
        if (comboBox.getItemCount()==1){
            comboBox.setSelectedItem(item);
        }
    }
    public void removeChoice(Object item){
        comboBox.removeItem(item);
        if (comboBox.getItemCount()==0){
            comboBox.setSelectedItem(null);
        }
    }

    public void removeAllChoice() {
        comboBox.removeAllItems();
    }

    public void setChoices(Vector<Object> a){
        for (Object now : a) {
            comboBox.addItem(now);
        }
        if (a.size()!=0) comboBox.setSelectedItem(a.get(0));
    }
    public Object getChoosenItem(){
        try{
            return comboBox.getSelectedItem().toString();
        }catch(Exception e){
            return null;
        }
    }

    public void addSelectAction(ActionListener listener){
        comboBox.addActionListener(listener);
    }

    public void setSelectedItem(String item){
        comboBox.setSelectedItem(item);
    }

    public JComboBox<Object> getComboBox() {
        return comboBox;
    }

    @Override
    protected void updateBounds() {
        comboBox.setBounds(0, 20, this.getWidth(), 20);
    }

}
