package com.javarush.lesson5.task0512.problem02;

/**
 * Created by Arsen on 28.02.2017.
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 2. У классов должны быть поля: name (String), age (int), address (String).
 3. Создай конструкторы, в которые передаются все возможные параметры.
 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».
 */
public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Andrey", 20, "Moscow");
        Man man2 = new Man("David", 22, "SPb");
        Woman woman1 = new Woman("Anya", 24, "Kiev");
        Woman woman2 = new Woman("Diana", 26, "Sevilla");
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+man2.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
    }

    public static class Man {
        private String name = null, address = null;
        private int age;
        private static final String DEFAULT_NAME = "ManUser";
        private static final int DEFAULT_AGE = 0;
        private static final String DEFAULT_ADDRESS = "World";

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(String name){
            this(name, DEFAULT_AGE, DEFAULT_ADDRESS);
        }
        public Man(int age){
            this(DEFAULT_NAME, age, DEFAULT_ADDRESS);
        }
    }

    public static class Woman {
        private String name = null, address = null;
        private int age;
        private static final String DEFAULT_NAME = "WomanUser";
        private static final int DEFAULT_AGE = 0;
        private static final String DEFAULT_ADDRESS = "World";

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman(String name){
            this(name, DEFAULT_AGE, DEFAULT_ADDRESS);
        }
        public Woman(int age){
            this(DEFAULT_NAME, age, DEFAULT_ADDRESS);
        }
    }
}
