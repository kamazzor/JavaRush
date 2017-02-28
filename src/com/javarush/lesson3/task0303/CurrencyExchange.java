package com.javarush.lesson3.task0303;
/**
 * Created by Arsen on 19.02.2017.
 * Реализуй метод convertEurToUsd, переводящий евро в
 * доллары по заданному курсу.
 * Вызови его дважды в методе main с любыми параметрами.
 * Результаты выведи на экран, каждый раз с новой строки.

 * Подсказка:
 * Расчет выполняется по формуле: долларСША = евро * курс
 */
public class CurrencyExchange {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(70, 0.7));
        System.out.println(convertEurToUsd(75, 0.778));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur*course;
    }
}
