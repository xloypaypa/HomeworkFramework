package view.interfaceTool.title;

import view.interfaceTool.AbstractComponent;
import view.interfaceTool.AbstractExtraComponent;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public class Title extends AbstractExtraComponent implements TitleAbleComponent {

    JLabel label;

    public Title() {
        this.label = new JLabel();
        this.add(label);
    }

    @Override
    public void setTitle(String title) {
        this.label.setText(title);
    }

    @Override
    public String getTitle() {
        return this.label.getText();
    }

    @Override
    public void updateBoundsWithCallBackComponent() {
        this.setBounds(0, 0, ((AbstractComponent) this.componentCallBack).getVisitableBounds().width, 20);
        label.setBounds(0, 0, this.getBounds().width, 20);
    }
}
