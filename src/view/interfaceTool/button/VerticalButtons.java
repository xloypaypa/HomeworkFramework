package view.interfaceTool.button;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by xlo on 15-6-11.
 *
 */
public class VerticalButtons extends AbstractButtons {

    public AbstractButton addButton(String name, int height, ActionListener action){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, 0, height);
        now.addActionListener(action);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addButton(String name, ActionListener action){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, 0, 20);
        now.addActionListener(action);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addButton(String name){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, 0, 20);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addButton(String name, int height){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, 0, height);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addBreak(int height){
        AbstractButton now=new JButton();
        now.setBounds(0, 0, 0, height);
        now.setVisible(false);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addBreak(){
        AbstractButton now=new JButton();
        now.setBounds(0, 0, 0, 20);
        now.setVisible(false);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    @Override
    protected void updateBounds() {
        if (buttons.size()==0) return ;

        int width=this.getWidth();
        int height;

        AbstractButton now= buttons.get(0);
        AbstractButton past;
        height=now.getHeight();
        now.setBounds(0, 0, width, height);
        System.out.print(width + " " + height);

        for (int i=1;i<buttons.size();i++){
            past= buttons.get(i-1);
            now= buttons.get(i);
            height=now.getHeight();
            now.setBounds(0, past.getLocation().y+past.getHeight(), width, height);
        }
    }
}
