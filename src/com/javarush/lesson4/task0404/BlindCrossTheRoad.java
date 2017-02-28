package com.javarush.lesson4.task0404;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Arsen on 25.02.2017.
 * Работа светофора для пешеходов запрограммирована следующим образом:
 в начале каждого часа в течение трех минут горит зелёный сигнал,
 затем в течение одной минуты — желтый,
 а потом в течение одной минуты — красный,
 затем опять зелёный горит три минуты и т. д.
 Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 Определить, сигнал какого цвета горит для пешеходов в этот момент.
 Результат вывести на экран в следующем виде:
 «зелёный» — если горит зелёный цвет,
 «желтый» — если горит желтый цвет,
 «красный» — если горит красный цвет.

 Пример для числа 2.5:
 зелёный

 Пример для числа 3:
 желтый

 Пример для числа 4:
 красный

 Пример для числа 5:
 зелёный
 */
public class BlindCrossTheRoad {
    public static void main(String[] args) throws IOException{
        int green = 3, yel = 4, red = 5;
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        if (time % red >= yel){
            System.out.println("красный");
        } else if (time % red >= green){
            System.out.println("желтый");
        } else{
            System.out.println("зелёный");
        }
    }
}
