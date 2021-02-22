package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // inisialisasi
        Scanner userInput = new Scanner(System.in);
        int n_min1, n_min2, sekarang, n;
        sekarang = 1;
        n_min1 = 0;
        n_min2 = 0;

        // minta input n dari user
        System.out.print("bilangan ke n: ");
        n = userInput.nextInt();

        // menampilkan awal
        for(int i = 1; i <= n; i++){
//            System.out.println(sekarang);
            System.out.println("Nilai ke - " + i + " adalah " + sekarang);
            n_min2 = n_min1;
            n_min1 = sekarang;
            sekarang = n_min1 + n_min2;
        }
    }
}
