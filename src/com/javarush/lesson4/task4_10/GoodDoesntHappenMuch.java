package com.javarush.lesson4.task4_10;

import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры строку и число N.
 Вывести на экран строку N раз используя цикл while.
 Каждое значение с новой строки.

 Пример ввода:
 абв
 2

 Пример вывода:
 абв
 абв
 */
public class GoodDoesntHappenMuch {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        while (N > 0){
            System.out.println(str);
            N--;
        }
    }
}
