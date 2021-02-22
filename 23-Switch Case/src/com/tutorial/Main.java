package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // switch case

        // ekspresinya berupa satuan (int, long, byte, short), String, atau enum

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input =  inputUser.next();

        switch (input){
            case "otong":
                System.out.println("saya otong dan hadir bos!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir boss!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir bos!!");
                break;
            default:
                System.out.println(input + " tidak hadir bos!!");
        }

    }
}
