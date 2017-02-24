package com.javarush.lesson3.task3_6;
/**
 * Created by Arsen on 22.02.2017.
 * Таблица умножения
 Выведи на экран таблицу умножения 10 на 10 в следующем виде:
 1 2 3 …
 2 4 6 …
 3 6 9 …
 …
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((i+1)*(j+1)+ " ");
            }
            System.out.println();
        }
    }
}
