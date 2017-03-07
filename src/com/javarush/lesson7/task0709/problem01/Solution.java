package com.javarush.lesson7.task0709.problem01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arsen on 06.03.2017.
 * Играем в Jолушку
 *
 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 3. Используя метод printList выведи эти три списка на экран.
 Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> lsDivisibleBy3 = new ArrayList<Integer>();
        ArrayList<Integer> lsDivisibleBy2 = new ArrayList<Integer>();
        ArrayList<Integer> lsOther = new ArrayList<Integer>();
        initializeList(list);
        separateToLists(list, lsDivisibleBy3, lsDivisibleBy2, lsOther);
        printList(lsDivisibleBy3);
        printList(lsDivisibleBy2);
        printList(lsOther);
    }

    private static void separateToLists(List<Integer> ls, List<Integer> lsDivBy3, List<Integer> lsDivBy2, List<Integer> lsOth) {
        for (int i = 0; i < ls.size(); i++) {
            if ((ls.get(i) % 3 != 0) && (ls.get(i) % 2 != 0)){
                lsOth.add(ls.get(i));
            }else {
                if (ls.get(i) % 3 == 0) {
                    lsDivBy3.add(ls.get(i));
                }
                if (ls.get(i) % 2 == 0) {
                    lsDivBy2.add(ls.get(i));
                }
            }
        }
    }

    private static void initializeList(List<Integer> list) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(r.readLine()));
        }
    }

    public static void printList(List<Integer> ls) {
        for (int i : ls) {
            System.out.println(i);
        }
    }
}
