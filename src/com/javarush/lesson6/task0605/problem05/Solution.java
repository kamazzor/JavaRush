package com.javarush.lesson6.task0605.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 01.03.2017.
 * Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
 Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
 Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
 Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
 Вывести на экран сообщение: «Even: а Odd: b», где а — количество четных цифр, b — количество нечетных цифр.

 Пример для числа 4445:
 Even: 3 Odd: 1
 */
public class Solution {
    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int num = Integer.parseInt(r.readLine());
        while (num !=0){
            if ((num%10)%2 == 0){
                even++;
            }else{
                odd++;
            }
            num/=10;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}
