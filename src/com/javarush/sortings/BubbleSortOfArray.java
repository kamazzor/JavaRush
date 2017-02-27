package com.javarush.sortings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Bubble Sorting realization
 */
public class BubbleSortOfArray {
    //descending bubble sorting
    public static int[] bubbleSortOfArray(int[] mas) {
        int count = mas.length - 1;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < count; i++) {
                //System.out.print(i + " ");  //debug info
                if (mas[i] > mas[i + 1]) {
                    SwapMy.swapInt(mas, i, i + 1);
                    swapped = true;
                }
            }
            count--;
            //System.out.println("\n\r" + mas.toString() +"\n\r");  //debug info
        } while (swapped);
        //sout sorted array
        return mas;
    }
}
    //Code for test
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = {5, 2, 1, 3, 9, 0, 4, 6, 8, 7};
        int n = 3;
*/
/*
        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }
*//*



        bubbleSortOfArray(mas);
    }
*/