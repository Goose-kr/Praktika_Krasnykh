package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse;

import java.util.LinkedList;

public interface MouseHandleModule {
    void update();
    LinkedList<Click> getClicksStack();

}
