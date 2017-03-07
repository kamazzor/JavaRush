package com.javarush.lesson7.task0709.problem03;

import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * Продолжаем мыть раму
 *
 1. Создай список из слов «мама», «мыла», «раму».
 2. После каждого слова вставь в список строку, содержащую слово «именно».
 3. Вывести результат на экран, каждый элемент списка с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<String> array = new ArrayList<>();
        initializeList(array);
        putWordIntoArray(array, "именно");
        printList(array);
    }

    private static void putWordIntoArray(ArrayList<String> arr, String sample) {
        for (int i = 0; i < arr.size(); i+=2) {
            arr.add(i+1, sample);
        }
    }

    private static void initializeList(ArrayList<String> arr) throws Exception{
        arr.add("мама");
        arr.add("мыла");
        arr.add("раму");
    }
    public static void printList(ArrayList<String> ls) {
        for (String str : ls) {
            System.out.println(str);
        }
    }
}
