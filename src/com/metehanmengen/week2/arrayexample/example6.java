package com.metehanmengen.week2.arrayexample;

public class example6 {
    public static void run() {
        int toplam = topla(1, 2, 3, 4, 5, 6, 7);
        System.out.println(toplam);
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }
        return toplam;
    }
}
