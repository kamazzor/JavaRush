package com.javarush.lesson3.task3_5;
/**
 * Created by Arsen on 19.02.2017.
 * Амиго, сегодня наша задача наполнить корабельный бассейн.
 * Нужно посчитать, сколько литров воды нужно для заполнения
 * бассейна до бортов. Известно, что бассейн имеет линейные
 * размеры a × b × c, заданные в метрах.
 Эти размеры передаются в метод getVolume. Метод должен вернуть
 количество литров воды, которое нужно для наполнения бассейна.

 Пример:
 Метод getVolume вызывается с параметрами 25, 5, 2.

 Пример вывода:
 250000
 */
public class PourPoolOut {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //напишите тут ваш код
        return a*b*c*1000;
    }
}
