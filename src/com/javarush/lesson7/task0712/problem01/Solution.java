package com.javarush.lesson7.task0712.problem01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 07.03.2017.
 * Вывести числа в обратном порядке
 *
 Ввести с клавиатуры 10 чисел и заполнить ими список.
 Вывести их в обратном порядке.
 Использовать только цикл for.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list = new ArrayList<>();
        initializeList(list);
        printRevList(list);
    }

    public static void initializeList(ArrayList<Integer> ls) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 10; i++) {
            ls.add(Integer.parseInt(r.readLine()));
        }
    }

    public static void printRevList(ArrayList<Integer> ls) {
        for (int i = ls.size()-1; i >= 0; i--) {
            System.out.println(ls.get(i));
        }
    }
}
