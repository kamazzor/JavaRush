package com.javarush.lesson3.task0308;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Arsen on 23.02.2017.
 * Ввести с клавиатуры имя и вывести надпись:
 name зарабатывает $5,000. Ха-ха-ха!

 Пример:
 Тимур зарабатывает $5,000. Ха-ха-ха!
 */
public class ModestyAdornProgrammer {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
