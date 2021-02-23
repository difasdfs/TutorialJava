package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("belajar array multidimensi");
        // cara membuat array 2 dimensi dengan assigment
        int[][] array_2D = {
                {1,2},
                {3,4}
        };

        printArray2D(array_2D);

        // cara membuat array 2 dimensi dengan deklarasi
        // int[baris][kolom]
        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

        // looping lengkap secara manual
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayAngka[i].length; j++){
                System.out.print(arrayAngka[i][j] + ",");
            }
            System.out.print("]\n");
        }

    }

    private static void printArray2D(int[][] dataArray){
        for(int i = 0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
