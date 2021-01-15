package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Array {
    static int[] createArray(int n) {
        return new int[n];
    }

    static int[] generateOnesArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }
        array[0] = 2;
        array[n - 1] = 2;
        return array;
    }

    static int[] generateOddNumbers(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k + 2;
        }
        return array;
    }

    static int[] generateFlippedEvenNumbers(int n) {
        int[] array = new int[n];
        int k = n * 2;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k - 2;
        }
        return array;
    }

    static int[] generateFibonacci(int n) {
        if (n == 1) {
            return new int[]{1};
        } else if (n == 2) {
            return new int[]{1, 1};
        } else {
            int[] array = new int[n];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array;
        }
    }

    static int[] generatePowIndex(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        return array;
    }

    static double[] solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        }

        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[]{};
        } else if (D == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double[] array = new double[2];
            array[0] = (-b + Math.sqrt(D)) / 2;
            array[1] = (-b - Math.sqrt(D)) / 2;
            return array;
        }
    }

    static int[] getWithoutMultiplesOfThree(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return array;
    }

    static double[] getArithmeticProgression(int n, double first, double step) {
        double[] array = new double[n];
        array[0] = first;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + step;
        }
        return array;
    }

    static double[] getGeometricProgression(int n, double first, double denominator) {
        double[] array = new double[n];
        array[0] = first;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] * denominator;
        }
        return array;
    }

    static double[] getDividersOfNumbers(int n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        double[] array = new double[count * 2 + (Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            if (n % (i + 1) == 0) {
                array[j] = (i + 1);
                array[array.length - j - 1] = n / (i + 1);
                j++;
            }
        }
        return array;
    }

    public static int[] getArr(int size) {
        if (size == 0) {
            return null;
        }
        int[] array = new int[size];
        for (int i = 0; i < Math.ceil((double) size / 2); i++) {
            array[i] = i + 1;
            array[size - i - 1] = i + 1;
        }
        return array;
    }

    static void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -((Integer) array[i]);

        }
    }

    static boolean settArray(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

    static boolean setFunction(Integer[] array) {
        for (int i : array) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    static int numberEven(int[] array) {
        int count = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static Integer Maxvalue(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int temp = 0;
        for (int i : array) {
            if (array[i + 1] > array[i]) {
                temp = array[i + 1];
            }
        }
        return temp;
    }

    static int setArrayEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
    static boolean  whoBestDivider(int[] array) {
        int _1count = 0;
        int _2count = 0;
        for (int j : array) {
            if (j % array[0] == 0)
                _1count++;
        }
        for (int i : array) {
            if (i % array[array.length - 1] == 0)
                _2count++;
        }
        return _1count > _2count;
    }

    static int getNumber(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    static int getIndexOftenNumber(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }


    static void exchangedMaxAndMin(int[] array) {
        int min = array[0];
        int indexMin = 0;
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;
    }

    static void getNot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }

    }

    static int[] getArrayNot(int[] _1array) {
        int[] _2array = new int[_1array.length];
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = _1array[i];
        }
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = ~_2array[i];
        }
        return _2array;
    }


    static int[] getPairwiseSum(int[] array) {
        int[] _1array = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < _1array.length; i++) {
            _1array[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return _1array;
    }

    static boolean[] isEven(int[] array) {
        boolean[] _1array = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            _1array[i] = array[i] % 2 == 0;
        }
        return _1array;
    }

    static int[] longToInt(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    static long intToLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 4294967295L);
    }

    public static int[] getNaturalArrayWithIndex(int n, int index) {
        int[] array = new int[n];
        int j = 0;
        int h = 1;
        for (int i = 0; i < n; i++) {
            if (index + j <= n) {
                array[i] = index + j;
            } else {
                array[i] = h;
                h++;
            }
            j++;
        }
        return array;
    }


        static int[][] massive(int size) {
            int[][] array = new int[size][];
            int k = 1;
            for (int i = 0; i < size; i++) {
                array[i] = new int[size - i];
                for (int j = 0; j < size - i; j++) {
                    array[i][j] = k;
                    k++;
                }
            }
            return array;
        }

    static void getArraySting2_33(String[] array) {
        for (String i : array) {
            System.out.println(i);
        }
    }

    static Double multiply2_34(Double[] array) {
        double number = 5.;
        for (Double i : array) {
            if(i.isNaN()||i.isInfinite()){
                continue;
            }
            number*=i;
        }
        return number;
    }
}

