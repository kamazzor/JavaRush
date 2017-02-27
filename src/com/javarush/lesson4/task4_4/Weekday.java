package com.javarush.lesson4.task4_4;

import java.util.Scanner;

/**
 * Created by Arsen on 25.02.2017.
 * Ввести с клавиатуры номер дня недели,
 * в зависимости от номера вывести название
 «понедельник», «вторник», «среда», «четверг»,
 «пятница», «суббота», «воскресенье»,
 если введен номер больше 7 или меньше 1 –
 вывести «такого дня недели не существует».

 Пример для номера 5:
 пятница

 Пример для номера 10:
 такого дня недели не существует
 *
 */
public class Weekday {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int dayNumb = sc.nextInt();
        switch (dayNumb){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("такого дня недели не существует");
        }
    }
}
