package com.javarush.lesson7.task0712.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 07.03.2017.
 * Перестановочка подоспела
 *
 Ввести с клавиатуры 2 числа N и M.
 Ввести N строк и заполнить ими список.
 Переставить M первых строк в конец списка.
 Вывести список на экран, каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int N, M;
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        N = Integer.parseInt(r.readLine());
        M = Integer.parseInt(r.readLine());
        for (int i = 0; i < N; i++) {
            list.add(r.readLine());
        }
        rearrangeStringsIntoList(list, M);
        printList(list);
    }

    public static void rearrangeStringsIntoList(ArrayList<String> ls, int m) {
        for (int i = 0; m > 0; m--) {
            String temp = ls.get(i);
            ls.remove(i);
            ls.add(temp);
        }
    }

    public static void printList(ArrayList<String> ls) {
        for (String str : ls) {
            System.out.println(str);
        }
    }

/*
    public static void initializeListString(ArrayList<String> ls, int n) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        InputData.N = Integer.parseInt(r.readLine());
        InputData.M = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            ls.add(r.readLine());
        }
    }
*/
}
