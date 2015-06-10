package view.interfaceTool2.title;

import view.interfaceTool2.AbstractComponent;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public class InputWithTitle extends ComponentWithTitle {

    protected JTextField textField;

    public InputWithTitle() {
        buildTextField();
        this.add(textField);
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

    public void setWords(String words) {
        this.textField.setText(words);
    }

    public String getWords() {
        return this.textField.getText();
    }

    public void clearWords() {
        this.setWords("");
    }

    public JTextField getTextField() {
        return this.textField;
    }

    public void setFocus(){
        this.textField.grabFocus();
        this.textField.requestFocus();
        this.textField.requestFocusInWindow();
    }
}
