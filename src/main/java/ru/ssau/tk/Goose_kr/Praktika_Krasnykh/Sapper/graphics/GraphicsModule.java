package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.graphics;

import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.GameField;

public interface GraphicsModule {
    void draw(GameField field);

    boolean isCloseRequested();

    void destroy();

}
