package view.interfaceTool.button;

import view.interfaceTool.AbstractComponent;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by xlo on 15-6-11.
 *
 */
public abstract class AbstractButtons extends AbstractComponent implements ComponentWithButtons {

    Vector<AbstractButton> buttons;

    AbstractButtons() {
        buttons = new Vector<>();
    }

    @Override
    public void removeButton(AbstractButton button) {
        this.remove(button);
        buttons.removeElement(button);
        updateBounds();
    }

    @Override
    public void removeButton(String buttonName) {
        this.buttons.stream().filter(now -> now.getName().equals(buttonName)).forEach(this::removeButton);
    }

    @Override
    public void removeAllButtons() {
        this.buttons.forEach(this::remove);
        this.buttons.removeAllElements();
        this.repaint();
    }

    @Override
    protected void updateAllComponentSize() {
        super.updateAllComponentSize();
    }

    @Override
    protected void updateVisitableBounds() {
        this.visitablePanel.setBounds(0, 0, 0, 0);
    }

    protected AbstractButton getNewButton(String name) {
        JButton now=new JButton(name);
        now.setName(name);
        now.setText(name);
        return now;
    }

    protected void addButtonToThis(AbstractButton button) {
        this.add(button);
        buttons.addElement(button);
    }
}
