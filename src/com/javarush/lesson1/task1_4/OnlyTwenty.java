package com.javarush.lesson1.task1_4;
/**
 * Created by Arsen on 10.02.2017.
 * В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
 Знаки нужно расставить только в строчке, в которой объявляется переменная result.
 Перед каждой переменной должен стоять знак либо плюс, либо минус.
 */
public class OnlyTwenty {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args){
        /*It was so
        int result = + a + b + c + d;
        */
        // It is now
        int result = - a + b - c + d;
        System.out.println(result);
    }
}
