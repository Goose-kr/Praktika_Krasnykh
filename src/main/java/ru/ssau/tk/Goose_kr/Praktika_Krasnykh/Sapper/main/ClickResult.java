package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main;

public enum ClickResult {
    REGULAR, /* Ничего специфического не произшло */
    OPENED, /* Клетка была открыта, но в ней не оказалось мины */
    EXPLOSED; /* Клетка была открыта и в ней оказалась мина */
}
