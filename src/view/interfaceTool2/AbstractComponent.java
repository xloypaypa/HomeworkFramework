package view.interfaceTool2;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xlo on 15-6-8.
 *
 */
public abstract class AbstractComponent extends JPanel {

    protected Set<AbstractExtraComponent> extraComponentSet;
    protected JPanel visitablePanel;

    public AbstractComponent() {
        this.setLayout(null);
        this.setBackground(null);
        this.extraComponentSet = new HashSet<>();

        this.visitablePanel = new JPanel();
        this.visitablePanel.setLayout(null);
        this.visitablePanel.setBackground(null);
        this.add(this.visitablePanel);
    }

    public void addSubComponent (AbstractExtraComponent subComponent) {
        subComponent.setComponentCallBack(this);
        subComponent.updateBoundsWithCallBackComponent();
        this.extraComponentSet.add(subComponent);
        this.visitablePanel.add(subComponent);
    }

    public void removeSubComponent (AbstractExtraComponent subComponent) {
        subComponent.setComponentCallBack(null);
        this.extraComponentSet.remove(subComponent);
        this.visitablePanel.remove(subComponent);
    }

    public void removeAllSubComponent() {
        for (AbstractExtraComponent now : this.extraComponentSet) {
            now.setComponentCallBack(null);
            this.visitablePanel.remove(now);
        }
        this.extraComponentSet.clear();
    }

    public AbstractExtraComponent getSubComponent(String componentName) {
        for (AbstractExtraComponent now : this.extraComponentSet) {
            if (now.getName().equals(componentName)) {
                return now;
            }
        }
        return null;
    }

    public void setVisitableBounds(Rectangle r) {
        this.visitablePanel.setBounds(r);
    }

    public void setVisitableBounds(int x, int y, int width, int height) {
        this.visitablePanel.setBounds(x, y, width, height);
    }

    public Rectangle getVisitableBounds() {
        return this.visitablePanel.getBounds();
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
        updateAllComponentSize();
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
        updateAllComponentSize();
    }

    @Override
    public void setBounds(Rectangle r) {
        super.setBounds(r);
        updateAllComponentSize();
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        updateAllComponentSize();
    }

    protected void updateAllComponentSize() {
        updateBounds();
        updateVisitableBounds();
        this.extraComponentSet.forEach(AbstractExtraComponent::updateBoundsWithCallBackComponent);
    }

    protected abstract void updateBounds();
    protected abstract void updateVisitableBounds();
}
