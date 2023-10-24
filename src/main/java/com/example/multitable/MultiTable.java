package com.example.multitable;

public class MultiTable {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "단 : " + "\t");

            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "X" + j + "=" + i * j + "\t");
            }
            System.out.println("");
        }
    }
}
