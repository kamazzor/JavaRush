package com.javarush.lesson7.task0706.problem01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Arsen on 05.03.2017.
 * Что за список такой?

 1. Создай список строк.
 2. Добавь в него 5 различных строк.
 3. Выведи его размер на экран.
 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strs = new ArrayList<>(5);
        //ArrayList<String> strs = new ArrayList<>(Arrays.asList("args", "books", "civil", "doubt", "end"));
        initializeArrayList(strs);
        System.out.println(strs.size());
        outputArrayList(strs);
    }

    public static void outputArrayList(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    private static void initializeArrayList(ArrayList<String> strings) throws Exception{
        //Reader reader = new InputStreamReader(System.in);
        //BufferedReader r = new BufferedReader(reader);
        int n = 5;
        for (Integer i = 0; i < n; i++) {
            strings.add("string".concat(String.valueOf(i)));
        }
    }
}
