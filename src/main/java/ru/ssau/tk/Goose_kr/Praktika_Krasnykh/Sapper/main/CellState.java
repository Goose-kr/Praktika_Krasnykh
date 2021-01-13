package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main;

public enum CellState {
    EMPTY, /* В клетке нет мины */
    MINE, /* В клетке есть мина, но она не взорвана */
    EXPLOSED; /* В клетке есть мина и она взорвана*/
}
