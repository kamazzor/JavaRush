package com.javarush.lesson3.task3_10;

/**
 * Created by Arsen on 24.02.2017.
 * Сумма цифр трехзначного числа
 Реализуй метод sumDigitsInNumber(int number). Метод на вход
 принимает целое трехзначное число. Нужно посчитать сумму цифр
 этого числа, и вернуть эту сумму.

 Пример:
 Метод sumDigitsInNumber вызывается с параметром 546.

 Пример вывода:
 15
 */
public class SumOfDigitsOfTreeDigitNumb {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number){
        int sumofdig = 0;
        while (number > 0){
            sumofdig += number % 10;
            number /= 10;
        }
        return sumofdig;
    }
}
