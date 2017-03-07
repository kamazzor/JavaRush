package com.javarush.lesson6.task0611.bonus01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 04.03.2017.
 * Делал сам, не по искомому коду.
 *
 Нужно исправить программу, чтобы компилировалась и работала
 Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        String str = "Max is ";
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        System.out.println(a < b ? str + a : str + b);
    }
}
