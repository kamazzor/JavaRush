package com.javarush.lesson3.task3_5;
/**
 * Created by Arsen on 19.02.2017.
 * Добавь метод public static int convertToSeconds(int hour)
 * который будет конвертировать часы в секунды.
 Вызови его дважды в методе main с любыми параметрами.
 Результаты выведи на экран, каждый раз с новой строки.
 */
public class TimeConversion {
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }
    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(4));
    }
}
