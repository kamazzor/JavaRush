package com.javarush.lesson4.task0407;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры три целых числа. Вывести на экран количество
 * положительных и количество отрицательных чисел в исходном наборе,
 в следующем виде:
 «количество отрицательных чисел: а», «количество положительных чисел: б»,
 где а, б — искомые значения.

 Пример для чисел 2 5 6:
 количество отрицательных чисел: 0
 количество положительных чисел: 3

 Пример для чисел -2 -5 6:
 количество отрицательных чисел: 2
 количество положительных чисел: 1
 */
public class PositiveAndNegativeNums {
    public static void countOfPosNums (ArrayList<Integer> numbers){
        int countPos = 0;
        int countNeg = 0;
        for (int i : numbers) {
            if (i < 0){
                countNeg++;
            }else if (i > 0){
                countPos++;
            }
        }
        System.out.print("количество отрицательных чисел: " + countNeg +
                            "\n\rколичество положительных чисел: " + countPos);

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
