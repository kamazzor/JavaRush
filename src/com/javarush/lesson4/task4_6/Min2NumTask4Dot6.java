package com.javarush.lesson4.task4_6;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Arsen on 26.02.2017.
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
 Если два числа равны между собой, необходимо вывести любое.
 */
public class Min2NumTask4Dot6 {
    public static void main(String[] args) throws IOException{
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //int a = Integer.parseInt(reader.readLine());
            //int b = Integer.parseInt(reader.readLine());
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a<=b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
