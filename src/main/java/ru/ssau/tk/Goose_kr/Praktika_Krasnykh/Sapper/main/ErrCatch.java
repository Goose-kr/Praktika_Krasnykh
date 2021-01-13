package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main;

public class ErrCatch {

    public static void cantDisplayCellWrongMinesNear() {
        System.err.println("Failed to display a cell -- wrong mines near param.");
        System.exit(-2);
    }

    public static void graphicsFailure(Exception e) {
        System.err.println("GraphicsModule failed.");
        e.printStackTrace();
        System.exit(-3);
    }
}
