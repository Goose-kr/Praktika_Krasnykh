package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.graphics.lwjglmodule;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.graphics.GraphicsModule;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.*;

import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.Const.CELL_SIZE;
import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.Const.COUNT_CELLS_X;
import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main.Const.COUNT_CELLS_Y;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glClearColor;

public class LwjglGraphicsModule implements GraphicsModule {

    private LwjglSpriteSystem spriteSystem;

    public LwjglGraphicsModule() {
        initOpengl();
        spriteSystem = new LwjglSpriteSystem();
    }

    private void initOpengl() {
        try {
            /* Задаём размер будущего окна */
            Display.setDisplayMode(new DisplayMode(Const.SCREEN_WIDTH, Const.SCREEN_HEIGHT));

            /* Задаём имя будущего окна */
            Display.setTitle(Const.SCREEN_NAME);

            /* Создаём окно */
            Display.create();
        } catch (LWJGLException e) {
            ErrCatch.graphicsFailure(e);
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Const.SCREEN_WIDTH,0, Const.SCREEN_HEIGHT,1,-1);
        glMatrixMode(GL_MODELVIEW);

        /* Для поддержки текстур */
        glEnable(GL_TEXTURE_2D);

        /* Для поддержки прозрачности */
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

        /* Белый фоновый цвет */
        glClearColor(1,1,1,1);
    }
    @Override
    public void draw(GameField field) {
        glClear(GL_COLOR_BUFFER_BIT);

        for(int i = 0; i < COUNT_CELLS_X; i++) {
            for (int j = 0; j < COUNT_CELLS_Y; j++) {
                drawSprite(CELL_SIZE*i, CELL_SIZE*j, calculateSprite(field.getCell(i,j), field.getMinesNear(i,j)) );
            }
        }

        Display.update();
        Display.sync(60);
    }

    private LwjglSpriteSystem.LwjglSprite calculateSprite(Cell cell, int minesNear) {
        if(cell.isMarked()){
            if(!cell.isHiden() && (cell.getState() != CellState.MINE)){
                ///Если эта клетка не скрыта, и на ней
                ///ошибочно стоит флажок...
                return LwjglSpriteSystem.LwjglSprite.BROKEN_FLAG;
            }
            ///В другом случае --
            return LwjglSpriteSystem.LwjglSprite.FLAG;
        }else if(cell.isHiden()){
            ///Если клетка не помечена, притом скрыта...
            return LwjglSpriteSystem.LwjglSprite.SPACE;
        }else{
            ///Если не помечена и не скрыта, выводим как есть
            switch (cell.getState()){
                case EXPLOSED:
                    return LwjglSpriteSystem.LwjglSprite.EXPLOSION;
                case MINE:
                    return LwjglSpriteSystem.LwjglSprite.MINE;
                case EMPTY:
                default:
                    if(minesNear>8 || minesNear<0){
                        ErrCatch.cantDisplayCellWrongMinesNear();
                    }

                    return  LwjglSpriteSystem.spriteByNumber[minesNear];
            }
        }
    }
    private void drawSprite(int x, int y, LwjglSpriteSystem.LwjglSprite sprite) {
        sprite.getTexture().bind();

        glBegin(GL_QUADS);
        glTexCoord2f(0,0);
        glVertex2f(x,y+ Const.CELL_SIZE);
        glTexCoord2f(1,0);
        glVertex2f(x+ Const.CELL_SIZE,y+ Const.CELL_SIZE);
        glTexCoord2f(1,1);
        glVertex2f(x+ Const.CELL_SIZE, y);
        glTexCoord2f(0,1);
        glVertex2f(x, y);
        glEnd();
    }

    @Override
    public boolean isCloseRequested() {
        return Display.isCloseRequested();
    }

    @Override
    public void destroy() {
        Display.destroy();
    }
}
