package com.javarush.lesson4.task4_16;

import com.javarush.sortings.BubbleSortOfListInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 Т.е. не самое большое и не самое маленькое.
 Если все числа равны, вивести любое из них.
 */
public class SoSo {
    public static void main(String[] args) throws Exception{
        List<Integer> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //List<Integer> arr = Arrays.asList(5, 2, 1, 7, 9, 0, 4, 6, 8); //debug info
        int n = 3;
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        temp = BubbleSortOfListInt.bubbleSortOfListInt(arr);
        //System.out.println(temp.toString());  //debug info
        System.out.println(temp.get(temp.size() / 2));
    }
}
