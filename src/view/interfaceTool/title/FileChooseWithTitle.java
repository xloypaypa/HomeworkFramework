package view.interfaceTool.title;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by xlo on 15-8-4.
 *
 */
public class FileChooseWithTitle extends InputWithTitle {
    protected JButton chooseAction;

    public FileChooseWithTitle() {
        super();
        this.chooseAction = new JButton();
        this.chooseAction.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (chooser.showOpenDialog(chooser) == JFileChooser.APPROVE_OPTION) {
                    FileChooseWithTitle.this.textField.setText(chooser.getSelectedFile().getPath());
                }
            }
        });
        this.chooseAction.setText("..");
        this.add(this.chooseAction);
    }

    @Override
    protected void updateBounds() {
        this.textField.setBounds(0, 20, this.getWidth() - 25, 20);
        this.chooseAction.setBounds(this.getWidth() - 20, 20, 20, 20);
    }
}
