package view.interfaceTool2.title.date;

import view.interfaceTool2.AbstractExtraComponent;
import view.interfaceTool2.title.InputAbleComponent;
import view.interfaceTool2.title.InputWithLeftTitle;
import view.interfaceTool2.title.TitleAbleComponent;

/**
 * Created by xlo on 15-6-11.
 *
 */
public class DateItem extends AbstractExtraComponent implements InputAbleComponent, TitleAbleComponent {

    InputWithLeftTitle inputWithLeftTitle;

    public DateItem() {
        inputWithLeftTitle = new InputWithLeftTitle();
        inputWithLeftTitle.setTitleWidth(7);
        this.add(inputWithLeftTitle);
    }

    @Override
    public void updateBoundsWithCallBackComponent() {
        this.setBounds(this.componentCallBack.getX() + this.componentCallBack.getWidth(), this.componentCallBack.getY()
                , this.getWidth(), this.componentCallBack.getHeight());
        inputWithLeftTitle.setBounds(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
    public void setWords(String words) {
        this.inputWithLeftTitle.setWords(words);
    }

    @Override
    public String getWords() {
        return this.inputWithLeftTitle.getWords();
    }

    @Override
    public void clearWords() {
        this.inputWithLeftTitle.clearWords();
    }

    @Override
    public void setTitle(String title) {
        this.inputWithLeftTitle.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.inputWithLeftTitle.getTitle();
    }

    public void setTitleWidth(int width) {
        this.inputWithLeftTitle.setTitleWidth(width);
    }
}
