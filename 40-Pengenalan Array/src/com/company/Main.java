package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // tipedata[] nama = {komponen,komponen, ...}
        // assignment array
        int[] arrayInteger = {1,2,3,4};
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Deklarasi
        // tipedata[] nama = new tipedata[jumlahArray];
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.6f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
