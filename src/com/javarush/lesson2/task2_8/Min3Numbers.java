package com.javarush.lesson2.task2_8;
/**
 * Created by Arsen on 18.02.2017.
 * Написать функцию, которая вычисляет минимум из трёх чисел.

 * Подсказка:
 * Нужно написать тело существующей функции min.
 */
public class Min3Numbers {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int mini = (a <= b) ? a : b;
        return (mini <= c) ? mini : c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }

}
