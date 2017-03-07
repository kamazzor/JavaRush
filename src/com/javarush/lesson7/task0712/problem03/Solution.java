package com.javarush.lesson7.task0712.problem03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 07.03.2017.
 * Минимаксы в массивах
 *
 Создать массив на 20 чисел.
 Заполнить его числами с клавиатуры.
 Найти максимальное и минимальное числа в массиве.
 Вывести на экран максимальное и минимальное числа через пробел.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        int maximum;
        int minimum;
        for (int i = 0; i < 20; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        maximum = numbers[0];
        minimum = maximum;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum){
                maximum = numbers[i];
            }
            if (numbers[i] < minimum){
                minimum = numbers[i];
            }
        }
        System.out.println(maximum+" "+minimum);
    }
}
