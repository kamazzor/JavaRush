package com.javarush.lesson4.task0407;

import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры целое число в диапазоне 1 — 999.
 * Вывести его строку-описание следующего вида:
 *
 «четное однозначное число» — если число четное и имеет одну цифру,
 «нечетное однозначное число» — если число нечетное и имеет одну цифру,
 «четное двузначное число» — если число четное и имеет две цифры,
 «нечетное двузначное число» — если число нечетное и имеет две цифры,
 «четное трехзначное число» — если число четное и имеет три цифры,
 «нечетное трехзначное число» — если число нечетное и имеет три цифры.
 Если введенное число не попадает в диапазон 1 — 999,
 в таком случае ничего не выводить на экран.

 Пример для числа 100:
 четное трехзначное число

 Пример для числа 51:
 нечетное двузначное число
 */
public class DescribeNums {
    public static int getCountsOfDigits(int number){
        return (number==0) ? 1 : (int)Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Working version
        if(num>99 && num<1000){
            if(num%2==0){
                System.out.println("четное трехзначное число");
            }
            else{
                System.out.println("нечетное трехзначное число");
            }

        }
        else if(num>9 && num<100){
            if(num%2==0){
                System.out.println("четное двузначное число");
            }
            else{
                System.out.println("нечетное двузначное число");
            }
        }
        else if(num>0 && num<10){
            if(num%2==0){
                System.out.println("четное однозначное число");
            }
            else{
                System.out.println("нечетное однозначное число");
            }
        }

        //My realisations. It doesn't work in Javarush
/*
        String res = "";
        int countNum = getCountsOfDigits(num);
        res = (num % 2 == 0) ? "четное " : "нечетное ";
        switch (countNum) {
            case 1: System.out.print(res + "однозначное число");
                    break;
            case 2: System.out.print(res + "двузначное число");
                    break;
            case 3: System.out.print(res + "трехзначное число");
                    break;
            default: //System.err.println("Too big number. Input number in the range 1...999");
                    break;
        }
*/
    }
}
