package com.javarush.lesson2.task2_8;
/**
 * Created by Arsen on 18.02.2017.
 *
 * Реализуй метод print3. Метод должен вывести
 * переданную строку (слово) на экран три раза,
 * но в одной строке. Слова должны быть разделены
 * пробелом и не должны сливаться в одно.
 */
public class Type3Times {
    public static void print3(String s) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
