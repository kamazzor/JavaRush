package com.javarush.lesson4.task4_4;

import java.util.Scanner;

/**
 * Created by Arsen on 25.02.2017.
 * Ввести с клавиатуры число.
 Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то прибавить единицу.
 Если введенное число равно нулю, необходимо вывести ноль.
 Вывести результат на экран.
 */
public class PositiveAndNegativeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){
            a*=2;
            System.out.println(a);
        } else if (a < 0){
            a++;
            System.out.println(a);
        } else{
            System.out.println(a);
        }
    }
}
