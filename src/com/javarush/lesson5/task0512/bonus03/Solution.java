package com.javarush.lesson5.task0512.bonus03;

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
 * Задача по алгоритмам
 Написать программу, которая:
 1. вводит с консоли число N > 0
 2. потом вводит N чисел с консоли
 3. выводит на экран максимальное из введенных N чисел.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        List<Integer> nums = new ArrayList<>();
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int N = Integer.parseInt(r.readLine());
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(r.readLine()));
        }
        List<Integer> sortedNums = CocktailSortOfListInt.cocktailSort(nums);
        System.out.println("Max num is "+sortedNums.get(sortedNums.size()-1));
    }
}
