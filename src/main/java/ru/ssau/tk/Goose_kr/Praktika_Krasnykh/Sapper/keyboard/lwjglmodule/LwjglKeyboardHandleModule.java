package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.keyboard.lwjglmodule;

import org.lwjgl.input.Keyboard;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.keyboard.KeyboardHandleModule;

public class LwjglKeyboardHandleModule implements KeyboardHandleModule {

    private boolean wasEscPressed;

    @Override
    public void update() {
        resetValues();

        while (Keyboard.next()) {
            if (Keyboard.getEventKeyState()) {
                switch(Keyboard.getEventKey()){
                    case Keyboard.KEY_ESCAPE:
                        wasEscPressed = true;
                        break;
                }
            }
        }
    }

    private void resetValues() {
        wasEscPressed = false;
    }

    public boolean wasEscPressed() {
        return wasEscPressed;
    }

}
