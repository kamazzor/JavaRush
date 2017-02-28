package com.javarush.lesson2.task0202;
/**
 * Created by Arsen on 15.02.2017.
 *
 * Реализуй метод public static void salary(int a).
 * Метод должен увеличить переданное число на 100
 * и вывести на экран надпись: «Твоя зарплата
 * составляет: a долларов в месяц.» Где a —
 * это переданное число, которое увеличили на 100.
 *
 * Пример вывода на экран для а = 700:
 * Твоя зарплата составляет: 800 долларов в месяц.
 */
public class SalaryAddition {
    public static void main(String[] args) {
        salary(700);
    }

    public static void salary(int a) {
        //напишите тут ваш код
        //a+=100;
        System.out.println("Твоя зарплата составляет: " +
                        (a+100) + " долларов в месяц.");
    }
}
