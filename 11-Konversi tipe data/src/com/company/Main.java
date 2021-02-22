package com.company;

public class Main {

    public static void main(String[] args) {

        // urutan : byte>short>int>long

        // program untuk konversi data
        int nilaiInt = 450; // 32-bit
        System.out.println("nilai int = " + nilaiInt);

        // memperluas ke tipe data yang lebih besar
        long nilaiLong = nilaiInt; // 64-bit
        System.out.println("nilai long = " + nilaiLong);

        // memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte)nilaiInt; // tanda kurung merupakan casting
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf("%d / %.1f = %.1f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float)x/y; //hasil x bagi y akan dikonversi menjadi float
        System.out.printf("%d / %d = %.2f\n",x,y,z);
    }
}
