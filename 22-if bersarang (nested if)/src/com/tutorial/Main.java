package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // nested if atau if bersarang
        int a = 5;
        int b = 0;

        System.out.println("ini adalah awal dari program");
        if (a == 5) {

            if (b == 10) {
                System.out.println("ini adalah aksi dimana a = 5 dan b = 10");
            } else {
                System.out.println("ini adalah aksi default 1 dimana a = 5 dan b bukan 10");
            }

        } else {
            System.out.println("ini adalah aksi default dimana a salah");
        }
        System.out.println("ini adalah akhir dari program");
    }
}
