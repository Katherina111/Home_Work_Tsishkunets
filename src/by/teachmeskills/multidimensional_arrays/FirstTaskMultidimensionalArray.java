package by.teachmeskills.multidimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class FirstTaskMultidimensionalArray {
    public static void main(String[] args) {

        /*
        Задача №1
        Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
         */

        int[][][] array = new int[3][2][2];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) { // length - количество строк в массиве
            for (int j = 0; j < array[i].length; j++) { // length - количество элементов в строке
                for (int k = 0; k < array[i].length; k++) {
                    array[i][j][k] = random.nextInt(10); // заполнение случайными числами
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + array[i][j][k] + "\t");
                }
            }
            System.out.println();
        }

        //ввод числа, на который будет увеличен массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        //увеличения массива на number
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    array[i][j][k] = array[i][j][k] + number;
                    System.out.print(" " + array[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
