package com.javarush.lesson3.task0304;
/**
 * Created by Arsen on 19.02.2017.
 *
 * Расставить правильно (по другому) скобки,
 * чтобы на экран вывелось число 850
 */
public class BracketPuzzle {
    public static void main(String[] args) {
//      System.out.println((1 + 2) * (3 + 4) * (5 + 6) * (7 + 8) * (9 + 10) * (11 + 12) * (13 + 14) + 15);
        System.out.println(1 + 2 * (3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 * 11 + 12 * 13 + 14) + 15);
    }
}
