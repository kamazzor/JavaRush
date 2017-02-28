package com.javarush.lesson1.task0108;
/**
 * Created by Arsen on 15.02.2017.
 * Напиши программу, которая вызывает метод sum с параметрами 2 и 2.
 */
public class SimpleAs2Plus2 {
    public static void main(String[] args){
        int a = 2, b = 2;
        sum(a, b);
    }
    public static void sum(int a, int b){
        int c = a + b;
        System.out.print(c);
    }
}
