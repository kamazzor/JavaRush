package com.javarush.lesson6.task0608.problem07;

/**
 * Created by Arsen on 04.03.2017.
 * Сделать класс Calculator, у которого будут 5 статических методов:
 int plus(int a, int b) – возвращает сумму чисел a и b
 int minus(int a, int b) – возвращает разницу чисел a и b
 int multiply(int a, int b) – возвращает результат умножения числа a на число b
 double division(int a, int b) – возвращает результат деления числа a на число b
 double percent(int a, int b) – возвращает процент b из числа a
 */
public class Calculator {
    public static int plus(int a, int b) {
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double)a / b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (a/100D)*b;
    }

    public static void main(String[] args) {
        //debug info
        System.out.println(division(5, 17));
        System.out.println(percent(5, 17));
    }
}
