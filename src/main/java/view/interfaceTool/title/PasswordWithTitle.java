package view.interfaceTool.title;

import javax.swing.*;

/**
 * Created by xlo on 15-6-9.
 *
 */
public class PasswordWithTitle extends InputWithTitle {

    @Override
    protected void buildTextField() {
        this.textField = new JPasswordField();
    }
}
