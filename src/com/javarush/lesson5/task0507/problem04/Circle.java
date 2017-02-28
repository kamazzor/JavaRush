package com.javarush.lesson5.task0507.problem04;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс (Circle) круг, с тремя инициализаторами:
 — centerX, centerY, radius
 — centerX, centerY, radius, width
 — centerX, centerY, radius, width, color
 */
public class Circle {
    private int centerX, centerY, radius, width, color;
    private static final int DEFAULT_CENTER_X = 0;
    private static final int DEFAULT_CENTER_Y = 0;
    private static final int  DEFAULT_RADIUS = 1;
    private static final int  DEFAULT_WIDTH = 2 * DEFAULT_RADIUS;
    private static final int  DEFAULT_COLOR = 1;

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = DEFAULT_WIDTH;
        this.color = DEFAULT_COLOR;
    }
    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = DEFAULT_COLOR;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
