package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // looping bersarang
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (i > j){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
