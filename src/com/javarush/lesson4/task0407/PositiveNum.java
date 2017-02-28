package com.javarush.lesson4.task0407;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры три целых числа.
 * Вывести на экран количество положительных чисел в исходном наборе.

 Пример для чисел -4 6 6:
 2

 Пример для чисел -6 -6 -3:
 0
 */
public class PositiveNum {
    public static void countOfPosNums (ArrayList<Integer> numbers){
        int count = 0;
        for (int i : numbers) {
            count+=((i > 0) ? 1 : 0);
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        countOfPosNums(nums);
    }
}
