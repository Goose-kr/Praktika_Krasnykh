package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main;

import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.graphics.GraphicsModule;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.graphics.lwjglmodule.LwjglGraphicsModule;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.keyboard.KeyboardHandleModule;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.keyboard.lwjglmodule.LwjglKeyboardHandleModule;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.GameField;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse.Click;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse.MouseHandleModule;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.mouse.lwjglmodule.LwjglMouseHandleModule;

import java.util.LinkedList;

public class Main {

    private static boolean endOfGame; //Флаг для завершения основного цикла программы
    private static GraphicsModule graphicsModule;
    private static KeyboardHandleModule keyboardModule;
    private static MouseHandleModule mouseModule;
    private static LinkedList<Click> clicksStack;
    private static GameField gameField;

    public static void main(String[] args) {
        initFields();

        while (!endOfGame) {
            input();
            logic();

            graphicsModule.draw(gameField);
        }

        graphicsModule.destroy();
    }

    /**
     * Задаёт значения полей для начала игры
     */
    private static void initFields() {
        endOfGame = false;
        graphicsModule = new LwjglGraphicsModule();
        keyboardModule = new LwjglKeyboardHandleModule();
        mouseModule = new LwjglMouseHandleModule();
        gameField = new GameField();
        clicksStack = new LinkedList<>();
    }


    /**
     * Считывает пользовательский ввод.
     */
    private static void input() {
        keyboardModule.update();
        mouseModule.update();

        clicksStack = mouseModule.getClicksStack();

        endOfGame = endOfGame || graphicsModule.isCloseRequested() || keyboardModule.wasEscPressed();
    }

    /**
     * Основная логика игры.
     */
    private static void logic() {
        for (Click click : clicksStack) {
            gameField.recieveClick(click);
        }
    }
}

