package view.interfaceTool.button;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by xlo on 15-6-11.
 *
 */
public class HorizontalButtons extends AbstractButtons {

    public AbstractButton addButton(String name, int width, ActionListener action){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, width, 0);
        now.addActionListener(action);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addButton(String name, ActionListener action){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, 100, 0);
        now.addActionListener(action);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addButton(String name){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, 100, 0);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addButton(String name, int width){
        AbstractButton now = getNewButton(name);
        now.setBounds(0, 0, width, 0);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addBreak(int width){
        AbstractButton now=new JButton();
        now.setBounds(0, 0, width, 0);
        now.setVisible(false);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    public AbstractButton addBreak(){
        AbstractButton now=new JButton();
        now.setBounds(0, 0, 20, 0);
        now.setVisible(false);
        addButtonToThis(now);
        updateBounds();
        return now;
    }

    @Override
    protected void updateBounds() {
        if (buttons.size()==0) return ;

        int width;
        int height=this.getHeight();

        AbstractButton now= buttons.get(0);
        AbstractButton past;
        width=now.getWidth();
        now.setBounds(0, 0, width, height);

        for (int i=1;i<buttons.size();i++){
            past= buttons.get(i-1);
            now= buttons.get(i);
            width=now.getWidth();
            now.setBounds(past.getLocation().x+past.getWidth(), 0, width, height);
        }
    }
}
