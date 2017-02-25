package com.javarush.lesson4.task42;

/**
 * Created by Arsen on 25.02.2017.
 * Реализовать метод addNewCat, чтобы при его вызове
 * (т.е. добавлении нового кота), количество котов увеличивалось на 1.
 За количество котов отвечает переменная catsCount.
 */
public class AddNewCatRealization {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        catsCount+=1;
    }

    public static void main(String[] args) {

    }
}
