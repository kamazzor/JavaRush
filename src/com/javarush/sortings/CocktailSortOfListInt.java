package com.javarush.sortings;

import java.util.*;

/**
 * Created by Arsen on 27.02.2017.
 * Cocktail Sorting realization
 */
public class CocktailSortOfListInt {
    //descending cocktail sorting
    public static List<Integer> cocktailSort(List<Integer> mas) {
        int temp, i = 0;
        int countForw = 0, countBack = 0;
        boolean swapped = false;
        do {
            swapped = false;
            for (i = countBack; i < mas.size() - 1 - countForw; i++) {
                //System.out.print(i + " "); //debug info
                if (mas.get(i).compareTo(mas.get(i + 1)) > 0) {
                    //test whether the two elements are in the wrong order
                    Collections.swap(mas, i, i + 1);
                    swapped = true;
                }
            }
            //System.out.println("\n\r" + mas.toString() +"\n\r");  //debug info
            if (!swapped) {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            countForw++;

            swapped = false;
            for (i = mas.size() - 2 - countForw; i >= countBack; i--) {
                //System.out.print(i + " "); //debug info
                if (mas.get(i).compareTo(mas.get(i + 1)) > 0) {
                    //test whether the two elements are in the wrong order
                    Collections.swap(mas, i, i + 1);
                    swapped = true;
                }
            }
            countBack++;

            //System.out.println("\n\r" + mas.toString() +"\n\r");  //debug info
            //if no elements have been swapped, then the list is sorted
        } while (swapped);
        //sout sorted array
        return mas;
    }
}
    //Code for test
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

        cocktailSort(mas);
    }
*/
