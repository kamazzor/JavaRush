package com.javarush.lesson4.task0413;

/**
 * Created by Arsen on 27.02.2017.
 * Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
 Каждое значение вывести с новой строки.
 */
public class EvenNums {
    public static void main(String[] args) throws Exception{
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
