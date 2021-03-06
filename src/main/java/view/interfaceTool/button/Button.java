package view.interfaceTool.button;

import view.interfaceTool.AbstractExtraComponent;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by xlo on 15-6-10.
 *
 */
public class Button extends AbstractExtraComponent {

    JButton button;

    public Button() {
        button = new JButton();
        this.add(button);
    }

    public void addActionListener(ActionListener actionListener) {
        button.addActionListener(actionListener);
    }

    public void removeActionListener(ActionListener actionListener) {
        button.removeActionListener(actionListener);
    }

    @Override
    public void updateBoundsWithCallBackComponent() {
        button.setBounds(this.getBounds());
    }

}
