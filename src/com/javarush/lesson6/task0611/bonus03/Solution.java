package com.javarush.lesson6.task0611.bonus03;

import com.javarush.sortings.CocktailSortOfListInt;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arsen on 04.03.2017.
 * Делал сам, не по искомому коду.
 *
 Задача по алгоритмам
 Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
 Пример ввода:
 3
 2
 15
 6
 17
 Пример вывода:
 2
 3
 6
 15
 17
 */

public class Solution {
    public static void main(String[] args) throws Exception{
        List<Integer> nums = new ArrayList<>();
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < 5; i++) {
            nums.add(Integer.parseInt(r.readLine()));
        }
        List<Integer> sortedNums = CocktailSortOfListInt.cocktailSort(nums);
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
}
