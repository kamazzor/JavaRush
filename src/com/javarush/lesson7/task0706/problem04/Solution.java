package com.javarush.lesson7.task0706.problem04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * В начало списка
 *
 1. Создай список строк в методе main.
 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arr= new ArrayList<>();
        initializeArray(arr);
        outputArray(arr);
    }

    private static void outputArray(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    private static void initializeArray(ArrayList<String> array) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(reader);
        int n = 10;
        for (int i = 0; i < n; i++) {
            array.add(0, r.readLine());
        }
        reader.close();
    }
}
