package com.javarush.lesson2.task0205;
/**
 * Created by Arsen on 17.02.2017.
 * Закомментируй максимальное количество строк,
 * чтобы на экран вывелось число 19
 */
public class MostDesiredNumber {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + x; // y == 1

        x = x * 2; // x == 2
        y = y + x; // y == 3

        x = x * 2; // x == 4
        //y = y + x;

        x = x * 2; // x == 8
        //y = y + x;

        x = x * 2; // x == 16
        y = y + x; // y == 19

        System.out.println(y);
    }
}
