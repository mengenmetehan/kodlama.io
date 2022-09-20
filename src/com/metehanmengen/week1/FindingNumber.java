package com.metehanmengen.week1;

import java.util.Scanner;

public class FindingNumber {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Sayı giriniz: ");
            int value = Integer.parseInt(kb.nextLine());

            if (value == 0)
                return;
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int val : numbers)
                if (value == val) {
                    System.out.println("Sayı bulundu.");
                    return;
                }
            System.out.println("sayı bulunamadı.");


        }
    }
}