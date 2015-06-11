package view.interfaceTool2.title;

/**
 * Created by xlo on 15-6-11.
 *
 */
public class InputWithLeftTitle extends InputWithTitle {

    private int titleWidth;

    public InputWithLeftTitle() {
        this.titleWidth = 0;
    }

    @Override
    protected void updateVisitableBounds() {
        this.visitablePanel.setBounds(0, 0, titleWidth, this.getHeight());
    }

    @Override
    protected void updateBounds() {
        textField.setBounds(titleWidth, 0, this.getWidth() - titleWidth, this.getHeight());
    }

    public void setTitleWidth(int width) {
        this.titleWidth = width;
        updateAllComponentSize();
    }

    public int getTitleWidth() {
        return titleWidth;
    }
}
