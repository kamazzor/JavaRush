package com.javarush.lesson6.task0608.problem04;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 04.03.2017.
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 String readString() – читает с клавиатуры строку
 int readInt() – читает с клавиатуры число
 double readDouble() – читает с клавиатуры дробное число
 boolean readBoolean() – читает с клавиатуры строку «true» или «false»
 и возвращает соответствующую логическую переменную true или false

 Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
 */
public class ConsoleReader {
    public static String readString() throws Exception {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        return r.readLine();
    }

    public static int readInt() throws Exception {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        return (Integer.parseInt(r.readLine()));

//      Example with regular expressions
/*
        if(str.matches("^-?\\d+")){
            return Integer.parseInt(str);
        }else{
            System.err.println("NumberFormatException");
        }
*/
    }

    public static double readDouble() throws Exception {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        return (Double.parseDouble(r.readLine()));
    }

    public static boolean readBoolean() throws Exception {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        return (Boolean.parseBoolean(r.readLine()));
    }

    public static void main(String[] args) {

    }
}
