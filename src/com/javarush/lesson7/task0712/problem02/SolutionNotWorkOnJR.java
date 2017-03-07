package com.javarush.lesson7.task0712.problem02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Arsen on 07.03.2017.
 * Перестановочка подоспела
 *
 Ввести с клавиатуры 2 числа N и M.
 Ввести N строк и заполнить ими список.
 Переставить M первых строк в конец списка.
 Вывести список на экран, каждое значение с новой строки.
 */
public class SolutionNotWorkOnJR {
    public static void main(String[] args) throws Exception{
        //debig info
        /*
        InputData.list.add("a");
        InputData.list.add("aa");
        InputData.list.add("aaa");
        InputData.list.add("aaaa");
        InputData.list.add("aaaaa");
        InputData.list.add("aaaaaa");
        InputData.list.add("aaaaaaa");
        */
        initializeListString(InputData.list);
        rearrangeStringsIntoList(InputData.list, InputData.M);
        printList(InputData.list);
    }

    public static void rearrangeStringsIntoList(ArrayList<String> ls, int m) {
        ArrayList<String> temp = new ArrayList<>();
        for (ListIterator<String> iter = ls.listIterator(); ((iter.hasNext()) && (m > 0));) {
            String str = iter.next();
            temp.add(str);
            iter.remove();
            //iter.add(str);
            m--;
        }
        ls.addAll(temp);
    }

    private static class InputData {
        static int N, M;
        static ArrayList<String> list = new ArrayList<>();
    }

    public static void initializeListString(ArrayList<String> ls) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        InputData.N = Integer.parseInt(r.readLine());
        InputData.M = Integer.parseInt(r.readLine());
        for (int i = 0; i < InputData.N; i++) {
            ls.add(r.readLine());
        }
    }

    public static void printList(ArrayList<String> ls) {
        for (String str : ls) {
            System.out.println(str);
        }
    }
}
