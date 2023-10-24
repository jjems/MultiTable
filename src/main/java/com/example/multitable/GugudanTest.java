package com.example.multitable;

import java.util.Scanner;


public class GugudanTest {
    public static void main(String[] args) {
        System.out.println("몇단? ");
        Scanner scanner = new Scanner(System.in);

        int dan = scanner.nextInt();
            System.out.print(dan + "단 : " + "\n");

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i) + "\t");
        }
    }
}
