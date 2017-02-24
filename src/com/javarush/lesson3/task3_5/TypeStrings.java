package com.javarush.lesson3.task3_5;
/**
 * Created by Arsen on 19.02.2017.
 * Реализуй метод public static void writeToConsole(String s),
 * который добавляет к началу строки выражение «printing: » и
 * выводит измененную строку на экран.

 Пример вывода для «Hello world!»:
 printing: Hello world!
 */
public class TypeStrings {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        //напишите тут ваш код
        System.out.println("printing: " + s);
    }
}
