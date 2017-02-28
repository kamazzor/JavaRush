package com.javarush.lesson4.task0410;

/**
 * Created by Arsen on 27.02.2017.
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 Буквы в каждой строке не разделять.

 Пример вывода на экран:
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 SSSSSSSSSS
 */
public class DivinationOnDollarBill {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0){
            int j = 10;
            while (j > 0){
                System.out.print("S");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
