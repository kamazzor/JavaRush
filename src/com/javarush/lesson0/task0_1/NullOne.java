package com.javarush.lesson0.task0_1;

import java.io.IOException;
public class NullOne {
    private static String TEXT = "Kiss my metal shiny as";

    public static void main(String[] args) throws IOException{
        System.out.println(TEXT);   //Вывод строки TEXT
        /*
        Выводим три одинаковые строчки
         */
        String s = "Ho-ho-ho!";
        printTextMoreTimes(s, 3);   // вызов метода
    }
    // заголовок метода
    public static void printTextMoreTimes(String s, int count){
        // метод
        for (int i = 0; i < count; i++){
            System.out.println(s);
        }
    }
}