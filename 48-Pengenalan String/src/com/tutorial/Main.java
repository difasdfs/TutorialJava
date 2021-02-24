package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // membuat array
	    String kataString = "hallo - hallo Bandung";
	    char[] kataChar = {'h','a','l','l','o'};

	    // menampilkan array
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // mengakses komponen dari string
        System.out.println("komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(0));

        // membuat komponen dari string di java itu tidak bisa. karena string di java immutable
        kataChar[0] = 'c';
//        kataString[0] = "c"; <--------- ini tidak bisa
        System.out.println(Arrays.toString(kataChar));

        printAddress("kataString", kataString);
        // kita bisa merubah komponen secara tidak langsung, mengambil substring
        kataString = "c" + kataString.substring(1,5);
        System.out.println(kataString);
        printAddress("kataString", kataString);

        // memory dari string (String pool)
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);
    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
