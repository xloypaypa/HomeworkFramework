package view.interfaceTool.button;

import javax.swing.*;
import java.util.Enumeration;

/**
 * Created by xlo on 15-6-11.
 *
 */
public class HorizontalRadioButtons extends HorizontalButtons {

    ButtonGroup group;

    public HorizontalRadioButtons() {
        group = new ButtonGroup();
    }

    @Override
    public void removeButton(AbstractButton button) {
        group.remove(button);
        super.removeButton(button);
    }

    @Override
    public void removeAllButtons() {
        buttons.forEach(group::remove);
        super.removeAllButtons();
    }

    @Override
    protected AbstractButton getNewButton(String name) {
        JRadioButton now = new JRadioButton(name);
        now.setName(name);
        now.setText(name);
        return now;
    }

    @Override
    protected void addButtonToThis(AbstractButton button) {
        this.add(button);
        buttons.addElement(button);
        group.add(button);
    }

    public void setChoosen(String name) {
        for (AbstractButton now : this.buttons) {
            if (now.getName().equals(name)) {
                now.setSelected(true);
            } else {
                now.setSelected(false);
            }
        }

    }

    public JRadioButton getChoosen(){
        Enumeration<AbstractButton> choose=group.getElements();
        while (choose.hasMoreElements()){
            AbstractButton nowButton = choose.nextElement();
            if (nowButton.isSelected()) return (JRadioButton) nowButton;
        }
        return null;
    }

}
