package com.javarush.lesson3.task0306;
/**
 * Created by Arsen on 22.02.2017.
 * Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
 Каждый объект при создании выводит на экран определенный цвет.
 */
public class EachHunterWantToKnow {
    public static void main(String[] args) {
        /*Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();*/
        new Red();
        new Orange();
        new Yellow();
        new Green();
        new Blue();
        new Indigo();
        new Violet();
    }

    public static class Red {
        public Red(){
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange(){
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow(){
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green(){
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue(){
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo(){
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet(){
            System.out.println("Violet");
        }
    }

}