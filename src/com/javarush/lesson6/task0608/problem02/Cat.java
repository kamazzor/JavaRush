package com.javarush.lesson6.task0608.problem02;

/**
 * Created by Arsen on 04.03.2017.
 * Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
 с помощью которых можно получить/изменить количество котов (переменную catCount).
 */
public class Cat {
    private static int catCount = 0;

    public Cat(){
        catCount++;
    }

    public static int getCatCount(){
        return Cat.catCount;
    }

    public static void setCatCount(int catCount){
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
