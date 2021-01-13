package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse.lwjglmodule;

import org.lwjgl.input.Mouse;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse.Click;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse.MouseHandleModule;
import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.Const.CELL_SIZE;

import java.util.LinkedList;

public class LwjglMouseHandleModule implements MouseHandleModule {

    LinkedList<Click> stack;

    @Override
    public void update() {
        resetValues();

        while(Mouse.next()){
            ///Если это было нажатие кнопки мыши, а не
            ///перемещение...
            if(Mouse.getEventButton()>=0 && Mouse.getEventButtonState()){
                int x = Mouse.getEventX()/CELL_SIZE;
                int y = Mouse.getEventY()/CELL_SIZE;
                int button = Mouse.getEventButton();

                stack.add(new Click(x, y, button));
            }
        }
    }

    private void resetValues(){
        stack = new LinkedList<>();
    }

    public LinkedList<Click> getClicksStack() {
        return stack;
    }

}
