package view.interfaceTool2;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public abstract class AbstractExtraComponent extends JPanel {

    protected AbstractComponent abstractComponentCallBack;

    public AbstractExtraComponent() {
        this.setLayout(null);
        this.setBackground(null);
    }

    public void setComponentCallBack(AbstractComponent abstractComponent) {
        this.abstractComponentCallBack = abstractComponent;
    }

    public abstract void updateBoundsWithMainComponent();

}
