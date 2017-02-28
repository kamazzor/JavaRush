package com.javarush.lesson4.task0416;

import java.util.Scanner;

/**
 * Created by Arsen on 28.02.2017.
 * Вводить с клавиатуры числа и считать их сумму.
 Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
 */
public class Summation {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int i = 0, sum = 0;
        while (i != -1) {
            i = sc.nextInt();
            sum+=i;
        }
        System.out.println(sum);
    }
}
