package com.javarush.lesson7.task0704.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 05.03.2017.
 * Массив из строчек в обратном порядке
 1. Создать массив на 10 строк.
 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 Каждый элемент — с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = initializeArray();
        arrayOutput(array);
    }

    private static void arrayOutput(String[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static String[] initializeArray() throws IOException {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        String[] mas = new String[10];
        /*for (int i = 0; i < mas.length; i++) {
            mas[i] = null;
        }*/

        for (int i = 0; i < 8; i++) {
            mas[i]=r.readLine();
        }
        return mas;
    }
}
