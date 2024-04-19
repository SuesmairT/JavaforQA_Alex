package Telran.HW150324;

import java.util.Arrays;

public class HW150324 {

    //  1. Посчитайте сумму элементов одномерного массива. Массив чисел создайте самостоятельно.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

//2. Создайте массив чисел. Замените все отрицательные значения на 0.

//
//        int[] array = {1, -2, 3, -4, 5};
//        for (int i = 0; i <array.length; i++) {
//            if (array[i] < 0) {
//                array[i] = 0;
//            }
//
//        System.out.println("Массив после замены отрицательных значений: " + Arrays.toString(array));
//    }
//
////3. Посчитайте произведение положительных элементов одномерного массива. Массив создайте самостоятельно.
//
//
//    public static void main(String[] args) {
//        int[] array = {1, -2, 3, -4, 5};
//        int product = 1;
//        for (int num : array) {
//            if (num > 0) {
//                product *= num;
//            }
//        }
//        System.out.println("Произведение положительных элементов массива: " + product);
//    }
//
////4. Создайте массив чисел. Создайте его копию, которая будет содержать только отрицательные значения из первого массива.
//
//
//    public static void main(String[] args) {
//        int[] array = {1, -2, 3, -4, 5};
//        List<Integer> negativeNumbers = new ArrayList<>();
//        for (int num : array) {
//            if (num < 0) {
//                negativeNumbers.add(num);
//            }
//        }
//        int[] negativeArray = new int[negativeNumbers.size()];
//        for (int i = 0; i < negativeNumbers.size(); i++) {
//            negativeArray[i] = negativeNumbers.get(i);
//        }
//        System.out.println("Массив отрицательных чисел: " + Arrays.toString(negativeArray));
//    }
//
////5. Создайте 2-х мерный массив. Посчитайте сумму всех парных элементов массива.
//
//
//    public static void main(String[] args) {
//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    sum += array[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма всех парных элементов массива: " + sum);
//    }
//
////6. Реализуйте метод, который ищет значение в 2-х мерном массиве и возвращает индекс в виде [x][y].
//
//
//    public static void main(String[] args) {
//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[] result = findValue(array, 5);
//        System.out.println("Индекс элемента с заданным значением: [" + result[0] + "][" + result[1] + "]");
//    }
//
//    public static int[] findValue(int[][] array, int value) {
//        int[] index = new int[2];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == value) {
//                    index[0] = i;
//                    index[1] = j;
//                    return index;
//                }
//            }
//        }
//        return index;
//    }
//
////7. Поменяйте местами значения первой строки 2-х мерного массива со значениями последней строки.
//
//
//    public static void main(String[] args) {
//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[] temp = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = temp;
//        System.out.println("Массив после замены строк: " + Arrays.deepToString(array));
//    }
//
////8. Создайте 2-х мерный массив. Осортируйте каждый из его подмассивов(строк) в порядке возрастания по отдельности.
//
//
//    public static void main(String[] args) {
//        int[][] array = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
//        for (int i = 0; i < array.length; i++) {
//            Arrays.sort(array[i]);
//        }
//        System.out.println("Массив после сортировки каждой строки: " + Arrays.deepToString(array));
//    }
//
}

