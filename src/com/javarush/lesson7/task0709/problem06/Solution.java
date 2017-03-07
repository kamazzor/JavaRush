package com.javarush.lesson7.task0709.problem06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * Проверка на упорядоченность
 *
 1. Введи с клавиатуры 10 слов в список строк.
 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<>();

/*      //debug info
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("a");
        list.add("a");
        list.add("a");
*/

        initializeList(list);
        checkAscOrder(list);
    }

    private static void checkAscOrder(ArrayList<String> list) {
        int curLength = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < curLength){
                System.out.println(i);
                break;
            }else if (list.get(i).length() > curLength){
                curLength = list.get(i).length();
            }
        }

    }

    public static void initializeList(ArrayList<String> ls) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 10; i++) {
            ls.add(r.readLine());
        }
    }
}
