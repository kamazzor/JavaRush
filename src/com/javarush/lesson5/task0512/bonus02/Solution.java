package com.javarush.lesson5.task0512.bonus02;

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
 * Нужно добавить в программу новую функциональность
 Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
 Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
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
        System.out.println("Min of "+ sortedNums.size()+" numbers = "+ sortedNums.get(0));
    }
}
