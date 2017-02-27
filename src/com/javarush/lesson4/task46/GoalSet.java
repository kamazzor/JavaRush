package com.javarush.lesson4.task46;

import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры два целых числа, которые будут
 * координатами точки, не лежащей на координатных осях OX и OY.
 Вывести на экран номер координатной четверти, в которой находится данная точка.

 Подсказка:
 Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
 для первой четверти a>0 и b>0;
 для второй четверти a<0 и b>0;
 для третьей четверти a<0 и b<0;
 для четвертой четверти a>0 и b<0.

 Пример для чисел 4 6:
 1

 Пример для чисел -6 -6:
 3
 */
public class GoalSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0){
            if (b > 0){
                System.out.println(1);
            }
            if (b < 0){
                System.out.println(4);
            }
        }
        if (a < 0){
            if (b > 0){
                System.out.println(2);
            }
            if (b < 0){
                System.out.println(3);
            }
        }
    }
}
