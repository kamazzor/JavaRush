package com.javarush.lesson3.task3_8;
import java.io.IOException;

/**
 * Created by Arsen on 23.02.2017.
 * Не думать о секундах…
 Реализуй метод getCountSecondsPassedInCurrentHour(int seconds).
 Метод на вход принимает целое число секунд, которые прошли с
 начала текущих суток. Нужно найти количество секунд, прошедших
 с начала последнего часа, и вернуть это число.

 Пример:
 Метод getCountSecondsPassedInCurrentHour вызывается с параметром 12345.

 Пример вывода:
 1545
 */
public class DontThinkAboutSeconds {
    public static void main(String[] args) throws IOException{
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds){
        return seconds - 3600*(seconds / 3600);
    }
}
