package com.javarush.lesson6.task0611.problem05;

/**
 * Created by Arsen on 04.03.2017.
 1. В классе Solution создать public статический класс Idea
 2. В классе Idea создать метод public String getDescription(),
    который будет возвращать любой непустой текст
 3. В классе Solution создай статический метод public void printIdea(Idea idea),
    который будет выводить на экран описание идеи — это то, что возвращает метод getDescription
 */
public class Solution {
    public static void printIdea(Idea idea){
        //Idea idea = new Idea();
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea{
        public String getDescription(){
            return "Hola! Idea!";
        }
    }
}
