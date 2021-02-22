package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // break, continue, dan return
        int a = 0;
        while (true){
            a++;
            if(a == 10){
                break;
            } else if (a == 5){
                continue;
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari looping");
    }
}
