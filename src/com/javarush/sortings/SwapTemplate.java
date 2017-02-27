package com.javarush.sortings;

import java.util.Collections;
import java.util.List;

/**
 * Created by Arsen on 28.02.2017.
 * Realization of swapTemplate and swapListTemplate
 */
public class SwapTemplate {
    public static final <T> void swapTemplate(T[] a, int i, int j) {
        T t = a[j];
        a[i] = a[j];
        a[j] = t;
    }

    public static final <T> void swapListTemplate(List<T> ls, int i, int j) {
        Collections.<T>swap(ls, i, j);
    }

}
