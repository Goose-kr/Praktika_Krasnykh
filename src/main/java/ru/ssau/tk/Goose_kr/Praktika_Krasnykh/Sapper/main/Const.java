package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main;

public class Const {

    /* Размер одной плитки */
    public static final int CELL_SIZE = 32;

    /* Количество ячеек на экране по горизонтали и вертикали */
    public static final int COUNT_CELLS_X = 10;
    public static final int COUNT_CELLS_Y = 10;

    /* Параметры окна */
    public static final int SCREEN_WIDTH = COUNT_CELLS_X *CELL_SIZE;
    public static final int SCREEN_HEIGHT = COUNT_CELLS_Y *CELL_SIZE;
    public static final String SCREEN_NAME = "Сапер";

    /* Шанс спавна мины */
    public static final int SPAWN_CHANCE_OF_MINE = 15; //%
}
