package com.javarush.sortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Реализация сортировки пузырьком
 */
public class BubbleSort {
    //descending bubble sorting
    public static void bubbleSort (ArrayList<Integer> mas){
        int temp;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < mas.size()-1; i++) {
                if (mas.get(i).compareTo(mas.get(i+1)) < 0){
                    Collections.swap(mas, i, i+1);
                    swapped = true;
                }
            }
        }while (swapped);
        //sout sorted array
        for (int i = 0; i < mas.size(); i++) {
            System.out.print(mas.get(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mas = new ArrayList<>();
        int n = 3;
        for (int i = 0; i < n; i++) {
            mas.add(sc.nextInt());
        }
        bubbleSort(mas);
    }
}
