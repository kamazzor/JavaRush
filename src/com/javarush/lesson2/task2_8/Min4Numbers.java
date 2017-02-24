package com.javarush.lesson2.task2_8;
/**
 * Created by Arsen on 18.02.2017.
 * Написать функцию, которая вычисляет минимум из четырёх чисел.
 * Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 *
 * Подсказка:
 * Нужно написать тело двух существующих функций min.
 */
public class Min4Numbers {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int temp1 = min (a, b);
        int temp2 = min (c, d);
        return (temp1 <=temp2) ? temp1 : temp2;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        return (a <= b) ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}
