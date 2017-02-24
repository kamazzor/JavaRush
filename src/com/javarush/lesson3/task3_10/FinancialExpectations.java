package com.javarush.lesson3.task3_10;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Arsen on 24.02.2017.
 * Финансовые ожидания
 Ввести с клавиатуры число n.
 Вывести на экран надпись «Я буду зарабатывать $n в час».

 Пример:
 Я буду зарабатывать $50 в час
 */
public class FinancialExpectations {

    public static void main(String[] args) throws IOException{
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.read());*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Я буду зарабатывать $"+ n +" в час");

    }
}
