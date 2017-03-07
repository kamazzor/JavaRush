package com.javarush.lesson6.task0611.problem03;

/**
 * Created by Arsen on 04.03.2017.
 * Переставь один модификатор static, чтобы пример скомпилировался.
 */
public class Solution {
    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}
