package com.example.multitable;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가로출력은 1/ 세로출력은 2를 입력:");
        int choice = scanner.nextInt();

        if (choice == 1) {

            for (int i = 2; i <= 9; i++) {
                System.out.print(i + "단 : " + "\t");

                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + "X" + j + "=" + i * j + "\t");
                }
                System.out.println("");
            }
        } else if (choice == 2) {
            for (int i = 2; i <= 9; i++) {
                System.out.println(i + "단 : " + "\n");

                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "X" + j + "=" + i * j );
                }
                System.out.println("");
            }
        }else{
            System.out.print("댓츠 ㄴㄴ");
        }
    }
}
