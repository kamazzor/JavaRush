package com.javarush.lesson7.task0704.problem05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 05.03.2017.
 * Один большой массив и два маленьких
 *
 1. Создать массив на 20 чисел.
 2. Ввести в него значения с клавиатуры.
 3. Создать два массива на 10 чисел каждый.
 4. Скопировать большой массив в два маленьких:
    половину чисел в первый маленький, вторую половину во второй маленький.
 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */
public class Solution {
    private static int[] nums = new int[20];

    //debug info
    //private static int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    private static int[] nums1 = new int[10];
    private static int[] nums2 = new int[10];

    public static void main(String[] args) throws Exception{
        nums = initializeArrayInt(20);
        nums1 = subArray(nums, 0, nums.length/2-1);
        nums2 = subArray(nums, nums.length/2, nums.length-1);
        outputNums(nums2);

    }

    private static void outputNums(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static int[] initializeArrayInt(int n) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=Integer.parseInt(r.readLine());
        }
        return mas;
    }

    private static int[] subArray(int[] array, int left, int right){
        int count = 0;
        int[] temp = new int[right-left+1];
        for (int i = left; i <= right; i++) {
            temp[count++] = array[i];

            //debug info
            //System.out.println("temp["+(count-1)+"] = array["+i+"] = "+temp[count-1]);
        }
        return temp;
    }
}
