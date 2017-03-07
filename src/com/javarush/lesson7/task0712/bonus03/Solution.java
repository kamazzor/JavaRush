package com.javarush.lesson7.task0712.bonus03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.javarush.sortings.CocktailSortOfListInt;

/**
 * Created by Arsen on 08.03.2017.
 * Делал сам, не по искомому коду.
 * Задача по алгоритмам
 *
 Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(8,2,110,4,2,6,-5,9,2,10));
        //initializeArrayListInt(numbers);
        CocktailSortOfListInt.cocktailSort(numbers);
        printArrayListInt(numbers);
    }

    private static void printArrayListInt(ArrayList<Integer> nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void initializeArrayListInt(ArrayList<Integer> nums) throws Exception {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        while (true){
            String str = r.readLine();
            if (str.isEmpty()) break;
            nums.add(Integer.parseInt(str));
        }
    }
}
