package view.interfaceTool2.title;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Created by xlo on 15-6-10.
 *
 */
public class ChoiceBarWithTitle extends ComponentWithTitle {

    protected JComboBox<String> comboBox;

    public ChoiceBarWithTitle() {
        comboBox =new JComboBox<>();
        this.add(comboBox);
    }

    public void addChoice(String item){
        comboBox.addItem(item);
        if (comboBox.getItemCount()==1){
            comboBox.setSelectedItem(item);
        }
    }
    public void removeChoice(String item){
        comboBox.removeItem(item);
        if (comboBox.getItemCount()==0){
            comboBox.setSelectedItem(null);
        }
    }
    public void setChoices(Vector<String> a){
        for (String now : a) {
            comboBox.addItem(now);
        }
        if (a.size()!=0) comboBox.setSelectedItem(a.get(0));
    }
    public String getChoosenItem(){
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

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    @Override
    protected void updateBounds() {
        comboBox.setBounds(0, 20, this.getWidth(), 20);
    }

}
