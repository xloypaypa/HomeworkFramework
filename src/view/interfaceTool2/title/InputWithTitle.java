package view.interfaceTool2.title;

import view.interfaceTool2.AbstractComponent;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public class InputWithTitle extends AbstractComponent implements TitleAbleComponent {

    protected JTextField textField;
    private Title title;

    public InputWithTitle() {
        buildTextField();
        this.add(textField);

        this.title = new Title();
        this.addSubComponent(title);
    }

    protected void buildTextField() {
        this.textField = new JTextField();
    }

    @Override
    public void setName(String name) {
        textField.setName(name);
    }

    @Override
    protected void updateBounds() {
        textField.setBounds(0, 20, this.getWidth(), 20);
    }

    @Override
    protected void updateVisitableBounds() {
        this.visitablePanel.setBounds(0, 0, this.getWidth(), 20);
    }

    @Override
    public void setTitle(String title) {
        this.title.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.title.getTitle();
    }

    public void setWords(String words) {
        this.textField.setText(words);
    }

    public String getWords() {
        return this.textField.getText();
    }

    public void clearWords() {
        this.setWords("");
    }

    public void setFocus(){
        this.textField.grabFocus();
        this.textField.requestFocus();
        this.textField.requestFocusInWindow();
    }
}
