package view.interfaceTool2.title;

import view.interfaceTool2.button.HorizontalRadioButtons;

import javax.swing.*;

/**
 * Created by xlo on 15-6-10.
 *
 */
public class ChoiceButtonWithTitle extends ComponentWithTitle {

    HorizontalRadioButtons horizontalRadioButtons;

    public ChoiceButtonWithTitle() {
        horizontalRadioButtons = new HorizontalRadioButtons();
        this.add(horizontalRadioButtons);
    }

    public JRadioButton addChoose(String name,int width){
        return (JRadioButton) horizontalRadioButtons.addButton(name, width);
    }
    public void removeChoose(String name){
        horizontalRadioButtons.removeButton(name);
    }
    public void removeChoose(JRadioButton b){
        horizontalRadioButtons.removeButton(b);
    }

    public JRadioButton getChoosen(){
        return horizontalRadioButtons.getChoosen();
    }

    @Override
    protected void updateBounds() {
        horizontalRadioButtons.setBounds(0, 20, this.getWidth(), this.getHeight() - 20);
    }
}
