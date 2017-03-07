package com.javarush.lesson7.task0712.problem06;

/**
 * Created by Arsen on 07.03.2017.
 * Семейная перепись
 *
 Создай класс Human с полями
 имя(String),
 пол(boolean),
 возраст(int),
 отец(Human),
 мать(Human).
 Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

 Примечание:
 Если написать свой метод String toString() в классе Human,
 то именно он будет использоваться при выводе объекта на экран.

 Пример вывода:
 Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 Имя: Катя, пол: женский, возраст: 55
 Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 …
 */
public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("дед Игорь", true, 70);
        Human grandFather2 = new Human("дед Максим", true, 70);
        Human grandMother1 = new Human("бабка Клава", false, 65);
        Human grandMother2 = new Human("бабка Серафима", false, 65);
        Human father = new Human("Юрий", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Галина", false, 45, grandFather2, grandMother2);
        Human kid1 = new Human("сын Леша", true, 20, father, mother);
        Human kid2 = new Human("сын Паша", true, 20, father, mother);
        Human kid3 = new Human("дочь Юля", false, 15, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age){
            this(name, sex, age, null, null);
        }

        @Override
        public String toString() {
/*          //standart
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            return text;
*/

            StringBuffer text = new StringBuffer("");
            text.append("Имя: ").append(this.name);
            text.append(", пол: ").append(this.sex ? "мужской" : "женский");
            text.append(", возраст: ").append(this.age);
            if (this.father != null){
                text.append(", отец: ").append(this.father.name);
            }
            if (this.mother != null){
                text.append(", мать: ").append(this.mother.name);
            }
            return text.toString();
        }
    }
}
