package com.javarush.lesson1.task0108;
/**
 * Created by Arsen on 15.02.2017.
 * Напиши программу, которая выводит на экран надпись:
 * «Хочешь — решай задачи, не хочешь — решай нехотя» 16 раз.
 */
public class SolveReluctantly {
    public static void main(String[] main){
        String s = "Хочешь - решай задачи, не хочешь - решай нехотя";
        for (int i = 1; i <=16; i++){
            System.out.println(s);
        }
    }
}
