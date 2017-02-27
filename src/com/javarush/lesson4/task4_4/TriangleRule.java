package com.javarush.lesson4.task4_4;

import java.util.Scanner;

/**
 * Created by Arsen on 25.02.2017.
 * Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
 Определить возможность существования треугольника по сторонам.
 Результат вывести на экран в следующем виде:
 «Треугольник существует.» — если треугольник с такими сторонами существует.
 «Треугольник не существует.» — если треугольник с такими сторонами не существует.

 Подсказка:
 Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
 Требуется сравнить каждую сторону с суммой двух других.
 Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника
 с такими сторонами не существует.
 */
public class TriangleRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sides[] = new int[3];
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < sides.length; i++) {
            sides[i] = sc.nextInt();
        }
        count = sides.length-1;
        while ((count >= 0) && flag) {
            if (sides[count] >= sides[(count+1)%3] + sides[(count+2)%3]){
                System.out.println("Треугольник не существует.");
                flag = false;
            }
            count--;
        }
        if (flag){
            System.out.println("Треугольник существует.");
        }
    }
}
