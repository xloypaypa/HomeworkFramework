package view.interfaceTool2.button;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by xlo on 15-6-11.
 *
 */
public interface ComponentWithButtons {

    AbstractButton addButton(String name, int width, ActionListener action);
    AbstractButton addButton(String name, ActionListener action);
    AbstractButton addButton(String name);
    AbstractButton addButton(String name, int width);
    AbstractButton addBreak(int width);
    AbstractButton addBreak();
    void removeButton(AbstractButton button);
    void removeButton(String buttonName);
    void removeAllButtons();
}
