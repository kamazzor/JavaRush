package com.javarush.lesson4.task46;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Arsen on 26.02.2017.
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 Если числа равны между собой, необходимо вывести любое.
 */
public class MaxOf4Numbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int max = 0;
        try {
            max = sc.nextInt();
            for (int i = 0; i < n-1; i++) {
                int temp = sc.nextInt();
                if (temp > max){
                    max = temp;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Несоответствие данных. Введите 4 числа типа int");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        System.out.println(max);
    }
}
