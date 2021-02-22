package com.company;

public class Main {

    public static void main(String[] args) {

        // unary = operasi yang dilakukan pada satu variabel

        // unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka,+angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka,-angka);

        // unary decrement dan increment
        // increment
        int angka2 = 10;
        angka2++; // merubah angka
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        // decrement
        int angka3 = 10;
        angka3--; // merubah angka
        System.out.println("nilai dengan '++' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d\n", ++a); // prefix
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d\n", b++); // postfix
        System.out.printf("nilai hasil dari postfix menjadi = %d\n", b);

        // unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup); // tidak akan mengubah nilai variabelnya
    }
}
