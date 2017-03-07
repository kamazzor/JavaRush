package com.javarush.lesson5.task0512.bonus01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 04.03.2017.
 * Делал сам, не по искомому коду.
 *
 Нужно исправить программу, чтобы компилировалась и работала
 Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        System.out.println("Sum of a and b = "+ (a+b));
    }

}
