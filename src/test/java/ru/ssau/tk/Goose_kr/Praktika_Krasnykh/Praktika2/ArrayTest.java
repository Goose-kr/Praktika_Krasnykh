package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    @Test
    public void testArray() {
        assertEquals(Array.createArray(2), new int[2]);
        assertEquals(Array.createArray(10), new int[10]);
        assertEquals(Array.createArray(1), new int[1]);
    }

    @Test
    public void testGenerateOnesArray() {
        assertEquals(Array.generateOnesArray(2), new int[]{2, 2});
        assertEquals(Array.generateOnesArray(1), new int[]{2});
        assertEquals(Array.generateOnesArray(5), new int[]{2, 1, 1, 1, 2});
    }

    @Test
    public void testGenerateOddNumbers() {
        assertEquals(Array.generateOddNumbers(2), new int[]{1, 3});
        assertEquals(Array.generateOddNumbers(1), new int[]{1});
        assertEquals(Array.generateOddNumbers(5), new int[]{1, 3, 5, 7, 9});
    }

    @Test
    public void testGenerateEvenNumbers() {
        assertEquals(Array.generateFlippedEvenNumbers(2), new int[]{4, 2});
        assertEquals(Array.generateFlippedEvenNumbers(1), new int[]{2});
        assertEquals(Array.generateFlippedEvenNumbers(5), new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testGenerateFibonacci() {
        assertEquals(Array.generateFibonacci(2), new int[]{1, 1});
        assertEquals(Array.generateFibonacci(1), new int[]{1});
        assertEquals(Array.generateFibonacci(5), new int[]{1, 1, 2, 3, 5});
    }

    @Test
    public void testGenerateSqrIndex() {
        assertEquals(Array.generatePowIndex(2), new int[]{0, 1});
        assertEquals(Array.generatePowIndex(1), new int[]{0});
        assertEquals(Array.generatePowIndex(5), new int[]{0, 1, 4, 9, 16});
    }

    @Test
    public void testSolveQuadraticEquation() {
        assertEquals(Array.solveQuadraticEquation(0, 2, -4), new double[]{2});
        assertEquals(Array.solveQuadraticEquation(10, 200, 1654), new double[]{});
        assertEquals(Array.solveQuadraticEquation(1, -2, 1), new double[]{1});
        assertEquals(Array.solveQuadraticEquation(1, 0, -9), new double[]{3, -3});
    }

    @Test
    public void testGetWithoutMultiplesOfThree() {
        assertEquals(Array.getWithoutMultiplesOfThree(1), new int[]{1});
        assertEquals(Array.getWithoutMultiplesOfThree(6), new int[]{1, 2, 4, 5, 7, 8});
    }

    @Test
    public void testGetArithmeticProgression() {
        assertEquals(Array.getArithmeticProgression(4, 5, 0), new double[]{5, 5, 5, 5});
        assertEquals(Array.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(Array.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }

    @Test
    public void testGetGeometricProgression() {
        assertEquals(Array.getGeometricProgression(5, 2, 2), new double[]{2, 4, 8, 16, 32});
        assertEquals(Array.getGeometricProgression(2, 1, 5), new double[]{1, 5});
        assertEquals(Array.getGeometricProgression(3, 400, 0.5), new double[]{400, 200, 100});
    }

    @Test
    public void testGetDividersOfNumbers() {
        assertEquals(Array.getDividersOfNumbers(6), new double[]{1, 2, 3, 6});
        assertEquals(Array.getDividersOfNumbers(7), new double[]{1, 7});
    }

    @Test
    public void testGetArr() {
        int[] arr = Array.getArr(11);
        double accuracy = 0.0001;
        assertEquals(arr[0], 1, accuracy);
        assertEquals(arr[10], 1, accuracy);
        assertEquals(arr[1], 2, accuracy);
        assertEquals(arr[9], 2, accuracy);
        assertEquals(arr[5], 6, accuracy);
    }

    @Test
    public void testSetArray() {
        int array[] = new int[]{1, 2, -3};
        Array.setArray(array);
        assertEquals((array[0]), -1);
        assertEquals((array[1]), -2);
        assertEquals(array[2], 3);
    }

    @Test
    public void testSettArray() {
        int[] arr = {1, 2, 3};
        assertEquals(Array.settArray(arr, 3), true);
        assertEquals(Array.settArray(arr, -1), false);
    }

    @Test
    public void testSetFunction() {
        Integer[] array = new Integer[2];
        array[1] = null;
        array[0] = 1;
        assertTrue(Array.setFunction(array));
    }

    @Test
    public void testNumberEven() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        assertEquals(Array.numberEven(array), 5);
    }

    @Test
    public void testMaxvalue() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Array.Maxvalue(new int[]{}), null);

    }

    @Test
    public void testSetArrayEven() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        //  0 1 2 3 4 5 6 7 8 9
        assertEquals(Array.setArrayEven(array), 25);//1+3+5+7+9
    }

    @Test
    public void testWhoBestDivider() {
        int[] array1 = new int[]{1, 2, 4, 8, 16, 2};
        int[] array2 = new int[]{10, 2, 4, 8, 2};
        assertTrue(Array.whoBestDivider(array1));
        assertFalse(Array.whoBestDivider(array2));
    }

    @Test
    public void testGetNumber() {
        int[] array = new int[]{1, 2, 3, 3, 2, 1, 3};
        assertEquals(Array.getNumber(array), 3);
        int[] temp = new int[]{1, 1, 1, 1, 0, 0, 0, -1};
        assertEquals(Array.getNumber(temp), 1);
    }

    @Test
    public void testGetIndexOftenNumber() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(Array.getIndexOftenNumber(array, 1), 0);
        assertEquals(Array.getIndexOftenNumber(array, 3), 2);
        assertEquals(Array.getIndexOftenNumber(array, 7), 6);
    }

    @Test
    public void testExchangedMaxAndMin() {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        Array.exchangedMaxAndMin(array1);
        assertEquals(array1, new int[]{6, 2, 3, 4, 5, 1});
        int[] array2 = {5};
        Array.exchangedMaxAndMin(array2);
        assertEquals(array2, new int[]{5});
        int[] array3 = {0, -10, 2, 0, 7};
        Array.exchangedMaxAndMin(array3);
        assertEquals(array3, new int[]{0, 7, 2, 0, -10});
    }

    @Test
    public void testGetNot() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Array.getNot(array);
        assertEquals(array[0], -2);
        Array.getNot(array);
        assertEquals(array[0], 1);
    }

    @Test
    public void testGetArrayNot() {
        int[] array = new int[]{1,2,3,4,5};
        int[] arrayNot = Array.getArrayNot(array);
        assertEquals(arrayNot[0],-2);
        assertEquals(array[0],1);

    }

    @Test
    public void testGetPairwiseSum() {
        assertEquals(Array.getPairwiseSum(new int[]{10, 4, 8, 2, 9}), new int[]{14, 10, 9});
        assertEquals(Array.getPairwiseSum(new int[]{10, 4, 8, 2, 9, 1, 2, 5}), new int[]{14, 10, 10, 7});

    }


    @Test
    public void testIsEven() {
        assertEquals(Array.isEven(new int[]{1,2,3,4}), new boolean[]{false,true,false,true});
    }

    @Test
    public void testLongToInt() {
        assertEquals(Array.intToLong(Array.longToInt(65L)), 65L);
        assertEquals(Array.longToInt(Array.intToLong(new int[]{1615, 5})), new int[]{1615, 5});
    }

    @Test
    public void testGetNaturalArrayWithIndex() {
        assertEquals(Array.getNaturalArrayWithIndex(5, 3), new int[]{3, 4, 5, 1, 2});
        assertEquals(Array.getNaturalArrayWithIndex(6, 6), new int[]{6, 1, 2, 3, 4, 5});
    }

   /* @Test
    public void testMassive() {
        assertEquals(Array.massive(3), new int[][]{{2, 2, 1}, {3, 2}, {6}});
    }*/

    @Test
    public void testGetArraySting2_33() {
        String[] array = new String[]{"hello","world"};
        Array.getArraySting2_33(array);
    }

    @Test
    public void testMultiply2_34() {
        assertEquals(Array.multiply2_34(new Double[]{1., 2., Double.NaN,
                        Double.NEGATIVE_INFINITY,
                        Double.POSITIVE_INFINITY}).doubleValue(),
                10.);
    }
}