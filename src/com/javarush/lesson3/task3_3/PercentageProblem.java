package com.javarush.lesson3.task3_3;
/**
 * Created by Arsen on 19.02.2017.
 * Реализуй метод addTenPercent, который увеличивает переданное целое число на 10%.
 * Исправь ошибку в сигнатуре метода.

 * Подсказка:
 * подумай, какие у этого метода входные и выходные данные.
 */
public class PercentageProblem {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        return i*1.1;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
