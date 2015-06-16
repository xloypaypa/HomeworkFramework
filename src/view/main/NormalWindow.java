package view.main;

import javax.swing.*;
import java.util.*;

/**
 * Created by xlo on 15-6-16.
 *
 */
public abstract class NormalWindow implements UIWindow {

    protected JFrame window;
    protected Map<String, UIDialog> dialog;
    protected Map<String, UIPage> page;

    private UIPage nowPage;

    @Override
    public void getInstance(String windowName) {
        window = new JFrame(windowName);
        dialog = new HashMap<>();
        page = new HashMap<>();
    }

    @Override
    public void addDialog(UIDialog dialog) {
        this.dialog.put(dialog.getClassName(), dialog);
    }

    @Override
    public void removeDialog(UIDialog dialog) {
        removeDialog(dialog.getClassName());
    }

    @Override
    public void removeDialog(String name) {
        if (this.dialog.containsKey(name)) {
            this.dialog.remove(name);
        }
    }

    @Override
    public void removeAllDialog() {
        this.dialog.clear();
    }

    @Override
    public void showDialog(String name) {
        this.dialog.get(name).show();
    }

    @Override
    public void addPage(UIPage page) {
        this.page.put(page.getClassName(), page);
    }

    @Override
    public void removePage(String name) {
        if (this.page.containsKey(name)) {
            this.page.remove(name);
        }
    }

    @Override
    public void removePage(UIPage page) {
        removePage(page.getClassName());
    }

    @Override
    public void removeAllPage() {
        this.page.clear();
    }

    @Override
    public void showPage(String name) {
        if (nowPage != null) {
            window.remove(nowPage.getPage());
            window.repaint();
        }

        nowPage = this.page.get(name);
        if (nowPage != null) {
            nowPage.getInstance();
            window.add(nowPage.getPage());
            window.repaint();
        }
    }

    @Override
    public void repaint() {
        nowPage.repaint();
    }

    @Override
    public void repaintAllPage() {
        for (Map.Entry<String, UIPage> page1 : this.page.entrySet()) {
            UIPage now = page1.getValue();
            now.getInstance();
            now.repaint();
        }
    }
}
