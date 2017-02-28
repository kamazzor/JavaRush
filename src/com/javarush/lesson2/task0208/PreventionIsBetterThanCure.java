package com.javarush.lesson2.task0208;
/**
 * Created by Arsen on 18.02.2017.
 * Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
 * Каждый раз с новой строки.
 */
public class PreventionIsBetterThanCure {
    public static void print3(String s) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
