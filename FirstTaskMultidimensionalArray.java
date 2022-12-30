package by.teachmeskills;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstTaskMultidimensionalArray {
    public static void main(String[] args) {

        /*
        Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
         */

        int[][] array = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) { // length - количество строк в массиве
            for (int j = 0; j < array[i].length; j++) { // length - количество элементов в строке
                array[i][j] = random.nextInt(10); // заполнение случайными числами
            }
        }
        // вывод на экран в виде таблицы
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }

        //ввод числа, на который будет увеличен массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        //увеличения массива на number
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + number;
            }
        }

        for (int[] element1 : array) { // вывод на экран в виде таблицы
            System.out.println(Arrays.toString(element1));
        }
    }
}
