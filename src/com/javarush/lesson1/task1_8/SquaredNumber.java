package com.javarush.lesson1.task1_8;
/**
 * Created by Arsen on 15.02.2017.
 * Напиши программу, которая выводит на экран квадрат числа 5.
 */
public class SquaredNumber {
    public static void main(String[] args){
       System.out.println(sqr(5));
    }
    public static int sqr(int a){
        return a * a;
    }
}
