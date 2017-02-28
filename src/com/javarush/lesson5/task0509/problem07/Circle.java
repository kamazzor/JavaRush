package com.javarush.lesson5.task0509.problem07;

/**
 * Created by Arsen on 28.02.2017.
 * Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

 Подсказка:
 не забудь про конструктор по умолчанию.
 */
public class Circle {
    public double x;
    public double y;
    public double radius;
    private static final double DEFAULT_X = 0;
    private static final double DEFAULT_Y = 0;
    private static final double DEFAULT_RADIUS = 1;

    //напишите тут ваш код
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x, double y){
        this(x, y, DEFAULT_RADIUS);
    }
    public Circle(double radius){
        this(DEFAULT_X, DEFAULT_Y, radius);
    }
    public Circle(){
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_RADIUS);
    }

    public static void main(String[] args) {

    }
}
