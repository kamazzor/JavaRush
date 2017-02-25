package com.javarush.lesson4.task44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Arsen on 26.02.2017.
 */
public class IsTherePairOfNumbersRelease {
    public static void outputEquals(ArrayList<Integer> data, ArrayList<Integer> count){
        for (int i = 0; i < data.size(); i++) {
            if (count.get(i)>0) {
                for (int j = 0; j < count.get(i)+1; j++) {
                    System.out.print(data.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void EqualNumInArray(ArrayList<Integer> data){
        HashSet<Integer> used = new HashSet<>();
        ArrayList<Integer> count = new ArrayList<>(Collections.nCopies(data.size(), 0));
        for (int i = 0; i < data.size(); i++) {
            if (used.contains(data.get(i))){
                continue;
            }else{
                used.add(data.get(i));
            }

            for (int j = i+1; j < data.size(); j++) {
                if (data.get(i) == data.get(j)){
                    count.set(i, count.get(i)+1);
                }
            }
        }
        outputEquals(data, count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        int n = 3;
        for (int i = 0; i < n; i++){
            data.add(sc.nextInt());
        }
        EqualNumInArray(data);
    }
}
