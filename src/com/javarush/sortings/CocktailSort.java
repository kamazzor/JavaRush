package com.javarush.sortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Реализация шейкерной (коктейльной) сортировки
 */
public class CocktailSort {
    //descending cocktail sorting
    public static void cocktailSort (ArrayList<Integer> mas){
        int temp, i=0;
        boolean swapped = false;
            do {
                swapped = false;
                for (i = 0; i < mas.size()-1; i++) {
                    if (mas.get(i).compareTo(mas.get(i+1)) < 0){
                        //test whether the two elements are in the wrong order
                        Collections.swap(mas, i, i+1);
                        swapped = true;
                    }
                }
                if (!swapped){
                    //we can exit the outer loop here if no swaps occurred.
                    break;
                }
                for (i = mas.size()-2; i >= 0; i--) {
                    if (mas.get(i).compareTo(mas.get(i+1)) < 0){
                        //test whether the two elements are in the wrong order
                        Collections.swap(mas, i, i+1);
                        swapped = true;
                    }
                }
                //if no elements have been swapped, then the list is sorted
            }while (swapped);
        //sout sorted array
        for (i = 0; i < mas.size(); i++) {
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
        cocktailSort(mas);
    }
}
