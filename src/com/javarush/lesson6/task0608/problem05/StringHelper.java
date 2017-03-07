package com.javarush.lesson6.task0608.problem05;

/**
 * Created by Arsen on 04.03.2017.
 * Сделать класс StringHelper, у которого будут 2 статических метода:
 String multiply(String s, int count) – возвращает строку повторенную count раз.
 String multiply(String s) – возвращает строку повторенную 5 раз.

 Пример:
 Амиго -> АмигоАмигоАмигоАмигоАмиго
 */
public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result = new String(new char[5]).replace("\0", s);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        result = new String(new char[count]).replace("\0", s);
        return result;
    }

    public static void main(String[] args) {

    }
}
