package com.javarush.lesson2.task0201;
import java.io.IOException;

/**
 * Created by Arsen on 15.02.2017.
 * Реализуй метод print. Метод должен вывести на экран
 * переданную строку 4 раза. Каждый раз с новой строки.
 */
public class PrintImplementation {
    public static void main(String[] args) throws IOException{
        print("Java easy to learn!");
    }
    public static void print(String s){
        for (int i = 1; i <= 4; i++){
            System.out.println(s);
        }
    }
}
