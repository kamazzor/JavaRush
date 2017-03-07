package com.javarush.lesson7.task0709.problem05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * Удваиваем слова
 *
 1. Введи с клавиатуры 10 слов в список строк.
 2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
 3. Выведи результат на экран, каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        list = initializeList(list);
        list = doubleValues(list);
        printList(list);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> ls) {
        for (int i = 0; i < ls.size(); i+=2) {
            ls.add(i+1, ls.get(i));
        }
        return ls;
    }

    public static ArrayList<String> initializeList(ArrayList<String> ls) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 10; i++) {
            ls.add(r.readLine());
        }
        return ls;
    }
    public static void printList(ArrayList<String> ls) {
        for (String str : ls) {
            System.out.println(str);
        }
    }
}
