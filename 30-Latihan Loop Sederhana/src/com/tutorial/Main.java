package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        int awal, akhir, jumlah;

        System.out.print("masukan nilai awal: ");
        awal = inputUser.nextInt();

        System.out.print("masukan nilai akhir: ");
        akhir = inputUser.nextInt();

        jumlah = 0;

        while(awal <= akhir){
            jumlah += awal;
            awal++;
        }

        System.out.println("jumlah: " + jumlah);
    }
}
