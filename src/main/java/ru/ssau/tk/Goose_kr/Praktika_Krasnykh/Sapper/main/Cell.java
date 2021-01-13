package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Sapper.main;

public class Cell {

    private CellState state;

    private boolean isHiden;

    private boolean isMarked;

    public Cell(boolean isMine) {
        this.isHiden = true;
        this.isMarked = false;
        this.state = isMine ? CellState.MINE : CellState.EMPTY;
    }

    public ClickResult recieveClick(int button) {
        if (isHiden) { ///Нет смысла обрабатывать клики по уже открытым полям

            /* Если клик был сделан левой кнопкой */
            if (button == 0 && !this.isMarked) { ///Заметим: щелчёк левой кнопкой по флагу не даст никакого результата

                /* Если это была мина, меняем состояние на взорванную и передаём сигнал назад */
                if (this.state == CellState.MINE) {
                    this.state = CellState.EXPLOSED;
                    return ClickResult.EXPLOSED;
                }

                /* Иначе открываем клетку и передаём сигнал об открытии назад */
                if (this.state == CellState.EMPTY) {
                    this.isHiden = false;
                    return ClickResult.OPENED;
                }

                /* Если клик был сделан правой кнопкой */
            } else if (button == 1) {
                this.isMarked = !this.isMarked;
            }
        }
        return ClickResult.REGULAR;
    }

    public boolean isHiden() {
        return isHiden;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public CellState getState() {
        return state;
    }

    public void show() {
        this.isHiden = false;
    }

}
