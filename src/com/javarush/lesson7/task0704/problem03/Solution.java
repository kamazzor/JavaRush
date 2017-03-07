package com.javarush.lesson7.task0704.problem03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 05.03.2017.
 1. Создать массив на 10 строк.
 2. Создать массив на 10 чисел.
 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        String[] strs = initializeArrayString(10);
        int[] lengths = fillLengths(strs);
        outputLengths(lengths);
    }

    private static void outputLengths(int[] lengths) {
        for (int i = 0; i < lengths.length; i++) {
            System.out.println(lengths[i]);
        }
    }

    private static String[] initializeArrayString(int n) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        String[] strings = new String[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = r.readLine();
        }
        return strings;
    }
    private static int[] fillLengths(String[] strings){
        int[] numbers = new int[10];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = strings[i].length();
        }
        return numbers;
    }
}
