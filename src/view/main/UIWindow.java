package view.main;

import tool.StringNameClass;

/**
 * Created by xlo on 15-6-16.
 *
 */
public interface UIWindow extends StringNameClass {

    void getInstance(String windowName);
    void createWindow();
    void repaint();
    void repaintAllPage();

    void addDialog(UIDialog dialog);
    void removeDialog(UIDialog dialog);
    void removeDialog(String name);
    void removeAllDialog();
    void showDialog(String name);

    void addPage(UIPage page);
    void removePage(UIPage page);
    void removePage(String name);
    void removeAllPage();
    void showPage(String name);

}
