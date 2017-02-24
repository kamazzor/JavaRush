package com.javarush.lesson2.task2_2;
/**
 * Created by Arsen on 15.02.2017.
 *
 * Реализуй метод printCircleLength. Параметр метода —
 * радиус окружности. Метод должен вывести на экран
 * длину окружности, рассчитанной по формуле: L = 2 * Pi * radius.
 * Результат — дробное число (тип double).
 * В качестве значения Pi используй значение 3.14.
 */
public class CircleLengthCount {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double Pi = 3.14;
        double L = 2 * Pi * (double)radius;
        System.out.println(L);
    }
}
