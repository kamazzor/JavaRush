package com.javarush.lesson4.task4_16;

import java.util.Scanner;

/**
 * Created by Arsen on 28.02.2017.
 * Ввести с клавиатуры строку name.
 Ввести с клавиатуры дату рождения (три числа): y, m, d.

 Вывести на экран текст:
 «Меня зовут name.
 Я родился d.m.y»

 Пример вывода:
 Меня зовут Вася.
 Я родился 15.2.1988
 */
public class ItNamedSo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Меня зовут " + name + ".\n\r" +
                "Я родился " + d + "." + m + "." + y);
    }
}
