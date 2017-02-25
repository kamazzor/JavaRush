package com.javarush.lesson4.task41;

/**
 * Created by Arsen on 25.02.2017.
 * Реализовать метод addPrice(int applesPrice),
 * чтобы при его вызове суммарная стоимость яблок
 * увеличивалось на переданное значение.
 За суммарную стоимость яблок отвечает
 переменная public static int applesPrice.
 */
public class ApplePrice {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            //напишите тут ваш код
            Apple.applesPrice += applesPrice;
        }
    }
}
