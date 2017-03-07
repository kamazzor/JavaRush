package com.javarush.lesson5.task0512.problem05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 28.02.2017.
 * Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
 Вывести на экран полученную сумму.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String endSample = "сумма";
        int sum = 0;
        while(true){
            String a = reader.readLine();
            if (a.equals(endSample)){
                System.out.println(sum);
                break;
            }else{
                sum+=Integer.parseInt(a);
            }
        }
        //System.gc(); //Garbage collector call;
    }
}
