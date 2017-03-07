package com.javarush.lesson7.task0706.problem05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * Удалить и вставить
 *
 1. Создай список строк.
 2. Добавь в него 5 строк с клавиатуры.
 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<String>();
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 5; i++) {
            String temp = r.readLine();
            arr.add(temp);
        }
        //debug info
        //ArrayList<String> arr = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));

        for (int i = 0; i < 13; i++) {
            String temp = arr.remove(arr.size()-1);
            arr.add(0, temp);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
