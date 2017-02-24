package com.javarush.lesson2.task2_8;
/**
 * Created by Arsen on 18.02.2017.
 *
 * Написать функцию, которая возвращает минимум из двух чисел.
 * Подсказка:
 * Нужно написать тело существующей функции min.
 */
public class Min2Numbers {
    public static int min (int a, int b){
        return ((a <= b) ? a : b);
    }

    public static void main (String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
