package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(arrayAngka));

        // looping standard
        System.out.println("looping standard");
        for(int i = 0; i < 10; i++){
            System.out.println(arrayAngka[i]);
        }

        // looping dengan properti dari arraynya
        System.out.println("\nlooping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println(arrayAngka[i]);
        }

        // looping khusus untuk collection <- array
        System.out.println("\nlooping foreach");
        for( int angka : arrayAngka){
            System.out.println(angka);
        }
    }
}
