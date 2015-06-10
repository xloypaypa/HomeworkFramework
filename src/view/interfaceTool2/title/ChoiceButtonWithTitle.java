package view.interfaceTool2.title;

import javax.swing.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by xlo on 15-6-10.
 *
 */
public class ChoiceButtonWithTitle extends ComponentWithTitle {

    ButtonGroup group;
    Vector <JRadioButton> buttons;

    public ChoiceButtonWithTitle() {
        this.group=new ButtonGroup();
        this.buttons=new Vector<>();
    }

    public JRadioButton addChoose(String name,int width,int height){
        JRadioButton now=new JRadioButton(name);
        now.setName(name);
        if (this.buttons.size()==0){
            now.setBounds(0, 20, width, height);
            now.setSelected(true);
        }else {
            JRadioButton last = this.buttons.get(this.buttons.size() - 1);
            int need = last.getX() + last.getWidth() + width;
            if (need <= this.getWidth()) {
                now.setBounds(last.getX() + last.getWidth(), last.getY(), width, height);
            } else {
                now.setBounds(0, last.getY() + last.getHeight(), width, height);
            }
        }
        this.buttons.addElement(now);
        this.add(now);
        this.group.add(now);
        return now;
    }
    public void removeChoose(String name){
        for (int i=0;i<this.group.getButtonCount();i++){
            if (this.buttons.get(i).getName().equals(name)){
                this.remove(this.buttons.get(i));
                this.group.remove(this.buttons.get(i));
                this.buttons.remove(i);
                i--;
            }
        }
    }
    public void removeChoose(JRadioButton b){
        for (int i=0;i<this.buttons.size();i++){
            if (this.buttons.get(i).equals(b)){
                this.remove(this.buttons.get(i));
                this.group.remove(this.buttons.get(i));
                this.buttons.remove(i);
                i--;
            }
        }
    }

    public String getChoosen(){
        Enumeration<AbstractButton> choose=group.getElements();
        while (choose.hasMoreElements()){
            AbstractButton nowButton = choose.nextElement();
            if (nowButton.isSelected()) return nowButton.getName();
        }
        return null;
    }

    @Override
    protected void updateBounds() {
        if (this.buttons.size()==0) return ;

        this.buttons.get(0).setBounds(0, 20, buttons.get(0).getWidth(), buttons.get(0).getHeight());
        for (int i=1;i<this.buttons.size();i++){
            JRadioButton last=this.buttons.get(i-1);
            JRadioButton now=this.buttons.get(i);
            int width=this.buttons.get(i).getWidth();
            int height=this.buttons.get(i).getHeight();
            int need=last.getX()+last.getWidth()+width;
            if (need<=this.getWidth()){
                now.setBounds(last.getX()+last.getWidth(), last.getY(), width, height);
            }else{
                now.setBounds(0, last.getY()+last.getHeight(), width, height);
            }
        }
    }
}
