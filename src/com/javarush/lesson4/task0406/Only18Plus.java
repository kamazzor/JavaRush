package com.javarush.lesson4.task0406;

import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры имя и возраст.
 * Если возраст меньше 18 вывести надпись «Подрасти еще».
 */
public class Only18Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
