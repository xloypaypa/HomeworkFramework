package view.interfaceTool.title;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public class InputWithTitle extends ComponentWithTitle implements InputAbleComponent {

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

    @Override
    public void setWords(String words) {
        this.textField.setText(words);
    }

    @Override
    public String getWords() {
        return this.textField.getText();
    }

    @Override
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
