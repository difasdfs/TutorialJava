package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai: ");
//        int nilai = userInput.nextInt();
//        System.out.println("Anda memasukan nilai " + nilai);

//        printNilai(nilai);

        int y = jumlahNilai(10);
        System.out.println(y);

        System.out.println(hitungFaktorial(5));
    }

    private static int hitungFaktorial(int parameter){

        if(parameter == 1){
            return parameter;
        }

        return parameter * hitungFaktorial(parameter -1);
    }

    private static int jumlahNilai(int parameter){

        if(parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter -1);
    }

    private static void printNilai(int parameter){

        System.out.println("Nilai = " + parameter);

        if(parameter == 0){
            return;
        }

        parameter--;
        printNilai(parameter);
    }
}
