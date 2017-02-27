package com.javarush.sortings;

import java.util.Collections;
import java.util.List;

/**
 * Created by Arsen on 28.02.2017.
 * Realization of swapTemplate and swapListTemplate
 */
public class SwapMy {
    public static void swapInt(int[] a, int i, int j) {
        a[j]+=a[i];
        a[i] = a[j]-a[i];
        a[j] = a[j]-a[i];
    }
    public static void swapDouble(double[] a, int i, int j) {
        double temp = a[j];
        a[i] = a[j];
        a[j] = temp;
    }
}
