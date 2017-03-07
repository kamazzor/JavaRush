package com.javarush.lesson7.task0704.problem04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 05.03.2017.
 * 1. Создать массив на 10 чисел.
 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 3. Расположить элементы массива в обратном порядке.
 4. Вывести результат на экран, каждое значение выводить с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        int[] nums = initializeArrayInt(10);
        reverseArray(nums);
        outputReversedArray(nums);
    }

    private static void reverseArray(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
    }

    private static int[] initializeArrayInt(int n) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));

        //debug info
        //int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(r.readLine());
        }
        return numbers;
    }

    private static void outputReversedArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
