package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[8];
        a[5] = 1;
        a[0] = 4;
        a[3] = 12;
        a[7] = 3;
        a[2] = 8;
        a[6] = 4;
        a[1] = 9;
        a[4] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a [i] + " ");
        }
        minimumMethod(a);
        maximumMethod(a);
        }
        public static void minimumMethod(int [] a) {
        int minimum = a [0];
        for (int i = 0; i < a.length; i++) {
            if (a [i] < minimum) {
        minimum = a [i];
        }
        }
        System.out.println("\nSmallest Element: " + minimum);
        }
        public static void maximumMethod(int [] a) {
        int maximum = a [0];
        for (int i = 0; i < a.length; i++) {
            if (a [i] > maximum) {
            maximum = a [i];
            }
        }
        System.out.println("Largest Element: " + maximum);
    }
    }