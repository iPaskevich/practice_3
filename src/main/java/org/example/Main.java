package org.example;

public class Main {
    public static void main(String[] args) {
        int [] Array = new int[]{1, 2, 3, 4, 5};
        int AltArray = Array[0];
        Array[0] = Array[4];
        Array[4] = AltArray;


        for (int i=0; i< Array.length; i++) {

            System.out.println(Array[i]);
        }
        //
        {
            System.out.println(" ");
            System.out.println(Array[0] + Array[2]);
        }
    }
}