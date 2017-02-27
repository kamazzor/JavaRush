package com.javarush.lesson4.task4_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввод с клавиатуры, сравнение чисел и вывод на экран — у студентов
 * 4 уровня секретного центра JavaRush эти навыки оттачиваются до автоматизма.
 Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры.
 Затем происходит сравнение, и если мы находим число, которое отличается от двух других,
 выводим на экран его порядковый номер.
 */
public class TreeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> mas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }
        if (mas.get(0)==mas.get(1)) {
            if (mas.get(1)!=mas.get(2)) System.out.println("3");
        }
        else {
            if (mas.get(0)==mas.get(2)) System.out.println("2");
            else if (mas.get(1)==mas.get(2)) System.out.println("1");
        }
    }
}
