package com.javarush.lesson7.task0704.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 05.03.2017.
 1. В методе initializeArray():
    1.1. Создайте массив на 20 чисел
    1.2. Считайте с консоли 20 чисел и заполните ими массив
 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=Integer.parseInt(r.readLine());
        }
        return mas;
    }

    public static int max(int[] array) {
        int maxx = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxx){
                maxx = array[i];
            }
        }
        return maxx;
    }
}
