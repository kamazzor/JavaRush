package com.javarush.lesson7.task0709.problem02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arsen on 06.03.2017.
 * Слова в обратном порядке
 Введи с клавиатуры 5 слов в список строк.
 Удали 3 — ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<String> array = new ArrayList<String>();
        initializeList(array);
        array.remove(2);
        printRevList(array);
    }

    private static void initializeList(ArrayList<String> arr) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 5; i++) {
            arr.add(r.readLine());
        }
    }

    public static void printRevList(ArrayList<String> ls) {
        for (int i = ls.size()-1; i >= 0; i--) {
            System.out.println(ls.get(i));
        }
    }
}
