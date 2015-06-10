package view.interfaceTool2.button;

import view.interfaceTool2.AbstractComponent;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Created by xlo on 15-6-11.
 *
 */
public abstract class AbstractButtons extends AbstractComponent {

    Vector<JButton> buttons;

    public JButton addButton(String name, int width, ActionListener action){
        JButton now = getNewButton(name);
        now.setBounds(0, 0, width, 0);
        now.addActionListener(action);
        this.add(now);
        buttons.addElement(now);
        updateBounds();
        return now;
    }

    public JButton addButton(String name, ActionListener action){
        JButton now = getNewButton(name);
        now.setBounds(0, 0, 100, 0);
        now.addActionListener(action);
        this.add(now);
        buttons.addElement(now);
        updateBounds();
        return now;
    }

    public JButton addButton(String name){
        JButton now = getNewButton(name);
        now.setBounds(0, 0, 100, 0);
        this.add(now);
        buttons.addElement(now);
        updateBounds();
        return now;
    }

    public JButton addButton(String name, int width){
        JButton now = getNewButton(name);
        now.setBounds(0, 0, width, 0);
        this.add(now);
        buttons.addElement(now);
        updateBounds();
        return now;
    }

    private JButton getNewButton(String name) {
        JButton now=new JButton(name);
        now.setName(name);
        return now;
    }

    public JButton addBreak(int width){
        JButton now=new JButton();
        now.setBounds(0, 0, width, 0);
        this.add(now);
        now.setVisible(false);
        buttons.addElement(now);
        updateBounds();
        return now;
    }

    public JButton addBreak(){
        JButton now=new JButton();
        now.setBounds(0, 0, 20, 0);
        this.add(now);
        now.setVisible(false);
        buttons.addElement(now);
        updateBounds();
        return now;
    }

    public void removeButton(JButton button) {
        this.remove(button);
        buttons.removeElement(button);
        updateBounds();
    }

    @Override
    protected void updateVisitableBounds() {
        this.visitablePanel.setBounds(this.getBounds());
    }
}
