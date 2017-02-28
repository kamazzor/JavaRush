package com.javarush.lesson4.task0406;

import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры имя и возраст.
 * Если возраст больше 20 вывести надпись «И 18-ти достаточно».
 */
public class FaceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
