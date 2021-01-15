package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika2;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4.Task4_7_IncompatibleDimensionsExeption;

import static org.testng.Assert.*;

public class MatricesTest {
    @Test
    public void testGetMatrixMultiplyOnNumber() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 1);
        matrix.setAt(1, 1, 1);
        matrix.setAt(1, 0, 1);
        Matrices.getMatrixMultiplyOnNumber(matrix, 5);
        assertEquals(matrix.getAt(0, 0), 1);
        assertEquals(Matrices.getMatrixMultiplyOnNumber(matrix, 5).getAt(0, 0), matrix.getAt(0, 0) * 5);

    }

    @Test
    public void testGetMatrixPlus() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 1);
        matrix1.setAt(1, 1, 1);
        matrix1.setAt(1, 0, 1);
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 1);
        matrix2.setAt(0, 1, 1);
        matrix2.setAt(1, 1, 1);
        matrix2.setAt(1, 0, 1);
        Matrix matrix3 = new Matrix(2, 1);
        matrix3.setAt(0, 0, 1);
        matrix3.setAt(1, 0, 1);

        try {
            Matrices.getMatrixPlus(matrix1, matrix3);
            Matrices.getMatrixPlus(matrix3, matrix1);
        } catch (Task4_7_IncompatibleDimensionsExeption e) {
            System.out.println("Получено исключение IncompatibleDimensionsException.\n" + matrix1.getN() + ", " + matrix1.getM()
                    + "\n" + "2)" + matrix2.getN() + ", " + matrix2.getM());
        }

        assertEquals(Matrices.getMatrixPlus(matrix1, matrix2).getAt(0, 0), matrix1.getAt(0, 0) + matrix2.getAt(0, 0));
    }

    @Test
    public void testChekMatrixSize() {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(3, 3);

        assertTrue(Matrices.chekDifferentMatrixSize(matrix1, matrix2));
    }

    @Test
    public void testGetMatrixMultiply() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 4);
        matrix1.setAt(0, 1, 1);
        matrix1.setAt(1, 1, 6);
        matrix1.setAt(1, 0, 8);
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 0);
        matrix2.setAt(0, 1, 1);
        matrix2.setAt(1, 1, 0);
        matrix2.setAt(1, 0, 1);

        Matrix matrix3 = new Matrix(1, 2);
        matrix3.setAt(0, 0, 1);
        matrix3.setAt(0, 1, 1);
        try {
            Matrices.getMatrixMultiply(matrix1, matrix3);
            Matrices.getMatrixMultiply(matrix3, matrix1);
        } catch (Task4_7_IncompatibleDimensionsExeption e) {
            System.out.println("Получено исключение IncompatibleDimensionsException");
        }
        Matrix result = Matrices.getMatrixMultiply(matrix1, matrix2);
        assertEquals(result.getAt(0, 0), 1);
        assertEquals(result.getAt(0, 1), 0);
        assertEquals(result.getAt(1, 0), 6);
        assertEquals(result.getAt(1, 1), 0);

    }

}