package com.javarush.lesson7.task0706.problem05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Arsen on 06.03.2017.
 * Удалить и вставить
 *
 1. Создай список строк.
 2. Добавь в него 5 строк с клавиатуры.
 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class SolutionNotWorkOnJR {
    public static void main(String[] args) throws Exception {
        //ArrayList<String> arr = new ArrayList<>();
        //initializeArray(arr);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        mazochism(arr, 13);
        //outputArray(arr);
    }

    private static void outputArray(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    private static void mazochism(ArrayList<String> array, int count) {
        for (int i = 0; i < count; i++) {
            //StringBuffer temp = new StringBuffer(array.get(array.size()-1));
            //array.add(0, array.get(array.size()-1));
            String temp = array.remove(array.size()-1);
            array.add(0, temp);
            //output current array after i loop
            //String currRes = String.join(", ", array);
            //System.out.println("Array after " + (i+1) + " loop" + ((i == 0) ? ":  [" : "s: [") + currRes+"]");
        }

    }

    private static void initializeArray(ArrayList<String> array) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(reader);
        int n = 5;
        for (int i = 0; i < n; i++) {
            array.add(0, r.readLine());
        }
        reader.close();
    }
}
