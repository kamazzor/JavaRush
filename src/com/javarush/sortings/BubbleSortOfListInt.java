package com.javarush.sortings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Bubble Sorting realization
 */
public class BubbleSortOfListInt {
    //descending bubble sorting
    public static List<Integer> bubbleSortOfListInt (List<Integer> mas){
        int count= mas.size()-1;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < count; i++) {
                //System.out.print(i + " ");  //debug info
                if (mas.get(i).compareTo(mas.get(i+1)) > 0){
                    Collections.swap(mas, i, i+1);
                    swapped = true;
                }
            }
            count--;
            //System.out.println("\n\r" + mas.toString() +"\n\r");  //debug info
        }while (swapped);
        //sout sorted array
        return mas;
    }
}
    // Code for test
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> mas = Arrays.asList(5, 2, 1, 7, 9, 0, 4, 6, 8, 3);


*/
/*
        int n = 3;
        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }
*//*


        bubbleSortOfListInt(mas);
    }
*/
