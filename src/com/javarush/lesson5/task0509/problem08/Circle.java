package com.javarush.lesson5.task0509.problem08;

/**
 * Created by Arsen on 28.02.2017.
 * Разберись, что делает программа.
 Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

 Подсказка:
 изучи конструктор по умолчанию.
 */
public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }
    //ошибка была здесь - стоял void перед именем конструктора
    public Circle() {
        color = new Color();
    }

    private class Color {
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
