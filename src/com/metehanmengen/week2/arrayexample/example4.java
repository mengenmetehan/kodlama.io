package com.metehanmengen.week2.arrayexample;

public class example4 {
    public static void run() {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);


    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
