package com.javarush.lesson7.task0712.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Arsen on 07.03.2017.
 * Делал сам, не по искомому коду.
 * Нужно добавить в программу новую функциональность
 *
 Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
 Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.

 Пример ввода:
 Кот
 Коты
 Я
 Пример вывода:
 Кот Кот Кот
 Коты Коты
 Я Я Я
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();

/*      //debug info
        strings.add("Кот");
        strings.add("Коты");
        strings.add("Я");
*/

        initializeArrayListString(strings);
        printArrayListString(strings);
        //first task
        makeStringsToUpperCase(strings);
        printArrayListString(strings);
        //second task
        ArrayList<String> multipledStrings = multipleStringsByEvennessOfLength(strings);
        printArrayListString(multipledStrings);


    }

    private static ArrayList<String> multipleStringsByEvennessOfLength(ArrayList<String> strs) {
        ArrayList<String> multipledStrings = new ArrayList<>();
        for (String s : strs) {
            if (s.length() % 2 == 0){
                multipledStrings.add(s+" "+s);
            }else{
                multipledStrings.add(s+" "+s+" "+s);
            }
        }
        return multipledStrings;

    }

    private static void makeStringsToUpperCase(ArrayList<String> strs) {
        ListIterator<String> iter = strs.listIterator();
        while (iter.hasNext()){
            String temp = iter.next();
            iter.remove();
            iter.add(temp.toUpperCase());
        }

    }

    private static void printArrayListString(ArrayList<String> strs) {
        for (String s : strs) {
            System.out.println(s);
        }
    }

    private static void initializeArrayListString(ArrayList<String> strs) throws IOException {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        while (true){
            String str = r.readLine();
            if (str.isEmpty()) break;
            strs.add(str);
        }
    }
}
