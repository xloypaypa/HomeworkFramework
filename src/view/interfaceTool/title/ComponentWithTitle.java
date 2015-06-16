package view.interfaceTool.title;

import view.interfaceTool.AbstractComponent;

/**
 * Created by xlo on 15-6-10.
 *
 */
public abstract class ComponentWithTitle extends AbstractComponent implements TitleAbleComponent {

    private Title title;

    public ComponentWithTitle() {
        this.title = new Title();
        this.addSubComponent(title);
    }

    @Override
    public void setTitle(String title) {
        this.title.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.title.getTitle();
    }

    @Override
    protected void updateVisitableBounds() {
        this.visitablePanel.setBounds(0, 0, this.getWidth(), 20);
    }

}
