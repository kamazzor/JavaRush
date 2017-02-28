package com.javarush.lesson3.task0308;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Arsen on 23.02.2017.
 * План по захвату мира
 Ввести с клавиатуры число и имя, вывести на экран строку:
 «имя» захватит мир через «число» лет. Му-ха-ха!

 Пример:
 Вася захватит мир через 8 лет. Му-ха-ха!

 Последовательность вводимых данных имеет большое значение.
 */
public class WorldConquestPlan {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        //String number = reader.readLine();
        System.out.println(name+" захватит мир через "+numb+" лет. Му-ха-ха!");
    }
}
