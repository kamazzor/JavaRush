package com.javarush.lesson5.task0505;

/**
 * Created by Arsen on 28.02.2017.
 * Реализовать метод boolean fight(Cat anotherCat):
 реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 Зависимость придумать самому.
 Метод должен определять, выиграли ли мы (this) бой или нет,
 т.е. возвращать true, если выиграли и false — если нет.

 Должно выполняться условие:
 если cat1.fight(cat2) = true,
 то cat2.fight(cat1) = false
 */
public class Cat {
    public String name;
    public int age, weight, strength;

    public Cat(){
    }

    public boolean fight(Cat anotherCat){
        if (age + weight*strength < anotherCat.age + anotherCat.weight*anotherCat.strength){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
