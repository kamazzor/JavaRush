package com.javarush.lesson3.task0304;
/**
 * Created by Arsen on 19.02.2017.
 *
 * Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
 1
 1+2=3
 1+2+3=6
 1+2+3+4=10
 …

 Пример вывода:
 1
 3
 6
 10
 ...
 */
public class SummOf10Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i+1;
            System.out.println(sum);
        }
    }
}
