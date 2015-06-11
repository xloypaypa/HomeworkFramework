package view.interfaceTool2.title.date;

import view.interfaceTool.Input;
import view.interfaceTool2.AbstractComponent;
import view.interfaceTool2.title.Title;
import view.interfaceTool2.title.TitleAbleComponent;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by xlo on 15-6-11.
 *
 */
public class TimeInput extends AbstractComponent implements TitleAbleComponent {

    protected JLabel title;
    protected Vector<DateItem> items;
    int inputWidth, titleWidth;

    public TimeInput() {
        titleWidth = 40;
        inputWidth = 100;

        title = new JLabel();
        title.setBounds(0, 0 ,titleWidth, 20);
        this.add(title);

        items = new Vector<>();
    }

    @Override
    protected void updateBounds() {
        title.setBounds(0, 0, titleWidth, this.getHeight());
        for (DateItem now : items) {
            now.setBounds(0, 0, inputWidth, 20);
        }
        items.forEach(view.interfaceTool2.title.date.DateItem::updateBoundsWithCallBackComponent);
    }

    @Override
    protected void updateVisitableBounds() {}

    @Override
    public void setTitle(String title) {
        this.title.setText(title);
    }

    @Override
    public String getTitle() {
        return this.title.getText();
    }

    public void setTitleWidth(int width) {
        this.titleWidth = width;
    }

    public void addDateItem(String title) {
        addDateItem(title, 7);
    }

    public void addDateItem(String title, int width) {
        DateItem item = new DateItem();
        item.setTitle(title);
        item.setTitleWidth(width);
        item.setBounds(0, 0, inputWidth, 20);
        if (items.size() == 0) {
            item.setComponentCallBack(this.title);
        } else {
            item.setComponentCallBack(items.lastElement());
        }
        this.add(item);
        items.addElement(item);
    }

    public void setItemWords(int index, String words) {
        items.get(index).setWords(words);
    }

    public String getItemWords(int index) {
        return items.get(index).getWords();
    }

    public void setInputWidth(int inputWidth) {
        this.inputWidth = inputWidth;
    }

    public int getInputWidth() {
        return inputWidth;
    }

}
