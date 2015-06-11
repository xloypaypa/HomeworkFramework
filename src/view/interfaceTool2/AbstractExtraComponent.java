package view.interfaceTool2;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public abstract class AbstractExtraComponent extends JPanel {

    protected JComponent componentCallBack;

    public AbstractExtraComponent() {
        this.setLayout(null);
        this.setBackground(null);
    }

    public void setComponentCallBack(JComponent component) {
        this.componentCallBack = component;
    }

    public abstract void updateBoundsWithCallBackComponent();

}
