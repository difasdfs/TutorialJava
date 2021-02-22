package com.company;

public class Main {

    public static void main(String[] args) {

        // operator komparasi.. ini akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("====== PERSAMAAN ======");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n",a,b,hasilKomparasi);

        // operator equal atau persamaan
        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n",a,b,hasilKomparasi);

        // operator not equal atau pertidakpersamaan
        System.out.println("====== PERTIDAKPERSAMAAN ======");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n",a,b,hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("====== KURANG DARI ======");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("====== LEBIH DARI ======");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);
    }
}
