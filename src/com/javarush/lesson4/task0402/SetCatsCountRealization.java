package com.javarush.lesson4.task0402;

/**
 * Created by Arsen on 25.02.2017.
 * Реализовать метод setCatsCount так, чтобы с его
 * помощью можно было устанавливать значение переменной
 * catsCount равное переданному параметру.
 */
public class SetCatsCountRealization {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        SetCatsCountRealization.catsCount = catsCount;

    }

    public static void main(String[] args) {

    }
}
