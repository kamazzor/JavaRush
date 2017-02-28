package com.javarush.lesson4.task0410;

/**
 * Created by Arsen on 27.02.2017.
 * Вывести на экран числа от 1 до 10 используя цикл while.
 * Каждое значение с новой строки.
 */
public class FromOneToTen {
    public static void main(String[] args) throws Exception {
        int i = 1;
        while (i < 11){
            System.out.println(i++);
        }
    }
}
