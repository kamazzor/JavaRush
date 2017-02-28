package com.javarush.lesson5.task0507;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс прямоугольник (Rectangle). Его данными будут
 * top, left, width, height (верхняя координата, левая, ширина и высота).
 Создать для него как можно больше методов initialize(…)

 Примеры:
 — заданы 4 параметра: left, top, width, height
 — ширина/высота не задана (оба равны 0)
 — высота не задана (равно ширине) создаём квадрат
 — создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class Rectangle {
    private int top, left, width, height;
    private static final int DEFAULT_LEFT = 0;
    private static final int DEFAULT_TOP = 0;
    private static final int DEFAULT_WIDTH = 0;
    private static final int DEFAULT_HEIGHT = 0;

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }
    public void initialize(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = this.width;
    }
    public void initialize(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
