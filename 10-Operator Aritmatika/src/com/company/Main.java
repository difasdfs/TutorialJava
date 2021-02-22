package com.company;

public class Main {

    public static void main(String[] args) {
        // Operasi Aritmatika

        int variabel1 = 10;
        int variabel2 = 5;

        int hasil;

        // 1. penjumlahan
        
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);
        
        // 2. pengurangan

        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d\n",variabel1,variabel2,hasil);

        // 3. perkalian

        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d\n",variabel1,variabel2,hasil);

        // 4. pembagian

        // karena hasil itu integer, maka output harus bulat
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d\n",variabel1,variabel2,hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.printf(a + " / " + b + " = " + hasilFloat);

        // 5. modulus
        // dibagi, dan ada sisanya. modulus adalah sisa pembagian

        hasil = variabel1 % variabel2;
        System.out.printf("\n%d %% %d = %d\n",variabel1,variabel2,hasil);

    }
}
