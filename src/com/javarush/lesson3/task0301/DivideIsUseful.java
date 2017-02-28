package com.javarush.lesson3.task0301;
/**
 * Created by Arsen on 18.02.2017.
 *
 * Делиться полезно
 * Реализуй метод public static void div(int a, int b).
 * Метод должен делить первое число на второе, и выводить
 * на экран результат деления а на b.
 */
public class DivideIsUseful {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) {
        //напишите тут ваш код
        System.out.println(a / b);
    }
}
